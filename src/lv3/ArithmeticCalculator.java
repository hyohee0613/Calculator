package lv3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {

    //속성
    private T a;
    private T b;
    private OperatorType c;
    private List<Double> resultAB = new ArrayList<>();


    //생성자
    public ArithmeticCalculator() {}


    //기능
    public double calculate() {
        double aA = a.doubleValue();
        double bB = b.doubleValue();
        double result = 0;
        switch (c) {
            case SUM:
                result = aA + bB;
                break;
            case SUB:
                result = aA - bB;
                break;
            case MUL:
                result = aA * bB;
                break;
            case DIV:
                if (bB == 0) {
                    throw new ArithmeticException("두번째 입력한 숫자가 0인 경우 나눗셈할 수 없습니다.");
                }
                result = aA / bB;
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
      public void setA(T a) {
          if (a.doubleValue() < 0) {
              throw new IllegalArgumentException("0을 포함한 양의 정수로 다시 입력해주세요");
          }
          this.a = a;
      }

      public void setB(T b) {
          if (b.doubleValue() < 0) {
              throw new IllegalArgumentException("0을 포함한 양의 정수로 다시 입력해주세요");
          }
          this.b = b;
      }

      public void setC(String c) {
        if ((c.length() != 1) || !"+-*/".contains(c)){
              throw new IllegalArgumentException("+, -, *, / 중 한 개만 입력해주세요.");
          }
          this.c = OperatorType.fromChar(c.charAt(0));
      }


    // 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력
    public void printCheckInputValue(double inputvalue) {
        System.out.println("[" + inputvalue + "]보다 큰 계산 결과:");

        resultAB.stream()
                .filter(result -> result > inputvalue)
                .forEach(result -> System.out.println(result));
    }

}
