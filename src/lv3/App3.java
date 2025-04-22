package lv3;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        //숫자 a, b 입력받기

        while (true) {      //전체 루프

            while (true) {
                System.out.println("첫번째 숫자를 입력하세요: ");
                String input = scan.nextLine().trim();

                try {
                    Double a = Double.parseDouble(input);
                    calculator.setA(a);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자로 입력해주세요.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            while (true) {
                System.out.println("두번째 숫자를 입력하세요: ");
                String input = scan.nextLine().trim();
                try {
                    Double b = Double.parseDouble(input);
                    calculator.setB(b);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자로 입력해주세요.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }


            //사칙연산자 c 입력받기

            while (true) {
                System.out.println("사칙연산 기호를 입력해주세요. (+, -, *, /)");
                String c = scan.nextLine();

                try {
                    calculator.setC(c);
                    break;

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }


            //연산하고 출력하기

            try {
                double result = calculator.calculate();
                System.out.println("계산 결과: " + result);
                System.out.println("지금까지의 계산 결과: " + calculator.getResultAB());
            } catch (ArithmeticException e) {
                System.out.println("에러: " + e.getMessage());
            }


            //계산을 더 진행할지 끝낼지 확인
            System.out.println("더 계산하시겠습니까? (yes 입력 시 계속 / exit 입력 시 종료)");
            String e = scan.nextLine();

            if (e.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;         //  while 루프 종료

            } else if (e.equals("yes")) {
                while (true) {
                    System.out.println("가장 먼저 저장된 계산 결과를 삭제하시겠습니까? (yes 입력 시 삭제 후 계속 / no 입력 시 삭제하지 않고 계속)");
                    e = scan.nextLine();
                    if (e.equals("yes")) {
                        calculator.removeResult();
                        break;
                    } else if (e.equals("no")) {
                        break;
                    } else {
                        System.out.println("다시 입력해주세요 (yes, no만 입력 가능)");
                    }
                }

                // break 후, while 루프 처음부터 숫자 입력으로 돌아감

            } else {
                System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                break;
            }
        }
    }
}

