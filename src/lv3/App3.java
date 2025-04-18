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
                if (scan.hasNextInt()) {
                    int a = scan.nextInt();
                    try {
                        calculator.setA(a);
                        break;
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("숫자로 다시 입력해주세요");
                    scan.nextLine();    // 입력 버퍼 제거
                }
            }

            while (true) {
                System.out.println("두번째 숫자를 입력하세요: ");
                if (scan.hasNextInt()) {
                    int b = scan.nextInt();
                    try {
                        calculator.setB(b);
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("숫자로 다시 입력해주세요");
                    scan.nextLine();    // 입력 버퍼 제거
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
            scan.nextLine();    // 입력 버퍼 제거
        }


        //연산하고 출력하기




        //계산을 더 진행할지 끝낼지 확인










    }
}
