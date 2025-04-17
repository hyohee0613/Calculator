package lv2;

public class Calculator {

    //사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스

    //속성
    private int a;
    private int b;

    //생성자
    public Calculator (int a, int b){
        this.a = a;
        this.b = b;
    }

    //기능
     int sum (){
        int result = a + b;
        return result;
    }

    int sub () {
        int result = a - b;
        return result;
    }

    int mul () {
        int result = a * b;
        return result;
    }

    double div () {
        double result = (double) a / (double) b;
        return result;
    }


}
