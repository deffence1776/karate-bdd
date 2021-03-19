package feature.calc;

import com.example.demo.KarateBddApplication;
import com.example.demo.calc.CalcService;
import com.intuit.karate.junit5.Karate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = KarateBddApplication.class)
public class CalcFeatureRunner {

    static CalcService calcService;

    @Autowired
    public  void setCalcService(CalcService calcService) {
        CalcFeatureRunner.calcService = calcService;
    }

    @Karate.Test
    Karate testCalc() {
        return Karate.run("calc").relativeTo(getClass());
    }

    public static int testAdd(int input1,int input2){
        //仕様を実現するコードを書いていく。流動的で良い
        return calcService.add(input1,input2);
    }


}
