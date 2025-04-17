package lv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inputA;
        int inputB;
        String inputE;

        while (true) {

            while (true) {
                System.out.println("첫번째 숫자를 입력하세요: ");
                inputA = scan.nextInt();

                if (inputA < 0) {
                    System.out.println("0을 포함한 양의 정수로 다시 입력해주세요");

                } else {
                    break;
                }
            }

            while (true) {
                System.out.println("두번째 숫자를 입력하세요: ");
                inputB = scan.nextInt();
                scan.nextLine();    // 입력 버퍼 제거

                if (inputB < 0) {
                    System.out.println("0을 포함한 양의 정수로 다시 입력해주세요");

                } else {
                    break;
                }
            }

            //사칙연산 기호 입력

            char c = ' ';

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


            //입력받은 정수 2개 (inputA,inputB)와 연산기호 (c)를 이용하여 연산 진행

            Calculator calculator = new Calculator(inputA, inputB);

            if (inputB == 0 && c == '/') {
                System.out.println("두번째 입력한 숫자가 0인 경우 나눗셈할 수 없습니다.");
            } else {
                switch (c) {
                    case '+':
                        System.out.println("계산 결과: " + calculator.sum());
                        break;
                    case '-':
                        System.out.println("계산 결과: " + calculator.sub());
                        break;
                    case '*':
                        System.out.println("계산 결과: " + calculator.mul());
                        break;
                    case '/':
                        System.out.println("계산 결과: " + calculator.div());
                        break;
                }
            }

            //계산을 더 진행할지 끝낼지 확인

            System.out.println("더 계산하시겠습니까? (yes 입력 시 계속 / exit 입력 시 종료)");
            inputE = scan.nextLine();
            if (inputE.equals("exit")) {
                break;
            }



        }
    }

}