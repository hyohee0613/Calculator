package lv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculator calculator = new Calculator();

        String inputE;

        while (true) {

            while (true) {
                System.out.println("첫번째 숫자를 입력하세요: ");
                int a = scan.nextInt();

                if (a < 0) {
                    System.out.println("0을 포함한 양의 정수로 다시 입력해주세요");

                } else {
                    calculator.set1(a);
                    break;
                }

            }

            while (true) {
                System.out.println("두번째 숫자를 입력하세요: ");
                int b = scan.nextInt();
                scan.nextLine();    // 입력 버퍼 제거

                if (b < 0) {
                    System.out.println("0을 포함한 양의 정수로 다시 입력해주세요");

                } else {
                    calculator.set2(b);
                    break;
                }
            }

            //사칙연산 기호 입력

            char inputC = ' ';

            while (true) {
                System.out.println("사칙연산 기호를 입력해주세요. (+, -, *, /)");
                String ch = scan.nextLine();

                if ((ch.length() == 1) && "+-*/".contains(ch)) {
                    inputC = ch.charAt(0);
                    break;

                } else {
                    System.out.println("+, -, *, / 중 한 개만 입력해주세요.");
                }
            }


            //입력받은 정수 2개 (inputA,inputB)와 연산기호 (c)를 이용하여 연산 진행

            try {
                double result = calculator.calculate(inputC);
                System.out.println("계산 결과: " + result);
            } catch (ArithmeticException e) {
                System.out.println("에러: " + e.getMessage());
            }

            System.out.println("지금까지의 계산 결과: " + calculator.getResultAB());



            //계산을 더 진행할지 끝낼지 확인

            System.out.println("더 계산하시겠습니까? (yes 입력 시 계속 / exit 입력 시 종료)");
            inputE = scan.nextLine();
            if (inputE.equals("exit")) {
                System.out.println("계산 결과를 초기화하고 종료합니다.");
                calculator.removeResult();
                break;
            }


        }
    }
}