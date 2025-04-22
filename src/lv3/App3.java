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

            if (e.equalsIgnoreCase("exit")) {
                System.out.println("계산을 종료합니다.");
                break;           //  전체 while 루프 종료

            } else if (e.equalsIgnoreCase("yes")) {
                while (true) {
                    System.out.println("저장된 연산 결과를 조회하시겠습니까? (yes 입력 시 조회 / no 입력 시 조회하지 않고 계산 계속)");
                    e = scan.nextLine();
                    if (e.equalsIgnoreCase("yes")) {
                        System.out.println("입력하신 숫자보다 큰 값만 조회됩니다. 숫자를 입력해주세요.");
                        double f = scan.nextDouble();
                        scan.nextLine();  // 입력 버퍼 제거
                        calculator.printCheckInputValue(f);
                        break;
                    } else if (e.equalsIgnoreCase("no")) {
                        break;
                    } else {
                        System.out.println("다시 입력해주세요 (yes, no만 입력 가능)");
                    }
                }

            }
        }
    }
}

