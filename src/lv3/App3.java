package lv3;

import lv3.Calculator3;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator3 calculator = new Calculator3();

        //숫자 a, b 입력받기

        while (true) {
            System.out.println("첫번째 숫자를 입력하세요: ");
            String input = scan.nextLine().trim();

            try {
                int a = Integer.parseInt(input);
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
                int b = Integer.parseInt(input);
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


    }



    }

