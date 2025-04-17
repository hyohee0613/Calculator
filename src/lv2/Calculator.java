package lv2;

import java.util.List;
import java.util.ArrayList;

public class Calculator {

    //속성
    private int a;
    private int b;
    private List<Double> resultAB = new ArrayList<>(); // 연산 결과를 저장하는 컬렉션 타입 필드

    //생성자 : 필요없음, 메서드에서 바로 값을 받아서 사용
    public Calculator () {}

    //기능: 연산 후 연산 결과를 컬렉션 필드에 저장
     double calculate(int a, int b, char c) {
        double result = 0;
        switch (c) {
             case '+':
                 result = a + b;
                 break;
             case '-':
                 result = a - b;
                 break;
             case '*':
                 result = a * b;
                 break;
             case '/':
                 result = (double) a / b;
                 break;

         }
         resultAB.add(result);
         return result;
     }




}
