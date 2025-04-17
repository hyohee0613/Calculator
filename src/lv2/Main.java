package lv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요.: ");
        int a = scan.nextInt();

        System.out.println("두번째 숫자를 입력해주세요.: ");
        int b = scan.nextInt();


        Calculator calculator = new Calculator (a, b);

        int sum = calculator.sum();
        System.out.println("계산 결과: " + sum);

        int sub = calculator.sub();
        System.out.println("계산 결과: " + sub);

        int mul = calculator.mul();
        System.out.println("계산 결과: " + mul);

        double div = calculator.div();
        System.out.println("계산 결과: " + div);

    }
}