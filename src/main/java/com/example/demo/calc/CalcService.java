package com.example.demo.calc;

import org.springframework.stereotype.Component;

@Component
public class CalcService {
    public int add(int x,int y){
        return x+y;
    }
}
