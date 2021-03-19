package feature.hello;

import com.example.demo.KarateBddApplication;
import com.intuit.karate.junit5.Karate;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = KarateBddApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class HelloFeatureRunner {

    @Karate.Test
    Karate testCalc() {
        return Karate.run("hello").relativeTo(getClass());
    }

}
