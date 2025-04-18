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
     double calculate(char c) {

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
                 if (b == 0) {
                     throw new ArithmeticException("두번째 입력한 숫자가 0인 경우 나눗셈할 수 없습니다.");
                 }
                 result = (double) a / b;
                 break;

         }
         resultAB.add(result);
         return result;
     }


     //게터: 저장된 계산 결과를 읽어오기
     public List<Double> getResultAB() {
        return resultAB;
     }


     //세터: 값 바꾸기
    public void set1(int a) {
        this.a = a;
    }

    public void set2(int b) {
        this.b = b;
    }


    // resultAB 리스트 전체 비우기 (초기화)
    public void removeResult() {
        resultAB.clear();
    }

}
