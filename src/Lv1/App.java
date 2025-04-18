package Lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//        필수 기능
//        계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
//        계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.

        //스캐너 불러오기
        Scanner scan = new Scanner(System.in);

        //변수 선언
        int a;
        int b;
        String e;

        while (true) {

            //값 입력
            while (true) {
                System.out.println("첫번째 숫자를 입력하세요: ");
                a = scan.nextInt();

                if (a < 0) {
                    System.out.println("0을 포함한 양의 정수로 다시 입력해주세요");

                } else {
                    break;
                }
            }

            while (true) {
                System.out.println("두번째 숫자를 입력하세요: ");
                b = scan.nextInt();
                scan.nextLine();    // 입력 버퍼 제거

                if (b < 0) {
                    System.out.println("0을 포함한 양의 정수로 다시 입력해주세요");

                } else {
                    break;
                }
            }

//**메모
//nextInt()로 정수를 받는데, 사용자가 3.65처럼 실수를 입력하면
//프로그램이 오류가 나지 않고,"0을 포함한 양의 정수로 다시 입력해주세요"
//라고 예쁘게 처리되길 원함 >> try-catch 예외 처리

            //사칙연산 기호 입력

            char c;

            while (true) {
                System.out.println("사칙연산 기호를 입력해주세요. (+, -, *, /)");
                String ch = scan.nextLine();

                if ((ch.length() == 1) && "+-*/".contains(ch)) {
                    c = ch.charAt(0);
                    break;

                } else {
                    System.out.println("+, -, *, / 중 한 개만 입력해주세요.");
                }
            }

            //입력받은 정수 2개 (a,b)와 연산기호 (c)를 이용하여 연산 진행

            int sum = a + b;
            int sub = a - b;
            int mul = a * b;
            double div = (double) a / (double) b;

            if (b == 0 && c == '/') {
                System.out.println("두번째 입력한 숫자가 0인 경우 나눗셈할 수 없습니다.");
            } else {
                switch (c) {
                    case '+':
                        System.out.println("계산 결과: " + sum);
                        break;
                    case '-':
                        System.out.println("계산 결과: " + sub);
                        break;
                    case '*':
                        System.out.println("계산 결과: " + mul);
                        break;
                    case '/':
                        System.out.println("계산 결과: " + div);
                        break;
                }
            }

            //계산을 더 진행할지 끝낼지 확인

            System.out.println("더 계산하시겠습니까? (yes 입력 시 계속 / exit 입력 시 종료)");
            e = scan.nextLine();
            if (e.equals("exit")) {
                break;
            }

        }

    }
}
