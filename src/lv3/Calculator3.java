package lv3;

import java.util.ArrayList;
import java.util.List;

public class Calculator3 {

    //속성
    private int a;
    private int b;
    private String c;
    private List<Double> resultAB = new ArrayList<>();


    //생성자
    public Calculator3() {}


    //기능
    public double calculate() {
        this.c.charAt(0);
        double result = 0;
        switch (c.charAt(0)) {
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


    //게터
      public List<Double> getResultAB() {
          return resultAB;
      }

      //세터: 값 저장 전 검사
      public void setA(int a) {
          if (a < 0) {
              throw new IllegalArgumentException("0을 포함한 양의 정수로 다시 입력해주세요");
          }
          this.a = a;
      }

      public void setB(int b) {
          if (b < 0) {
              throw new IllegalArgumentException("0을 포함한 양의 정수로 다시 입력해주세요");
          }
          this.b = b;
      }

      public void setC(String c) {
        if ((c.length() != 1) || !"+-*/".contains(c)){
              throw new IllegalArgumentException("+, -, *, / 중 한 개만 입력해주세요.");
          }
          this.c = c;
      }

    // resultAB 리스트에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제 (List에 있는 기본 메서드)
    public void removeResult() {
        resultAB.remove(0);
    }

}
