package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        필수 기능
//        계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
//        계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.

        //스캐너 불러오기
        Scanner scanner = new Scanner(System.in);

        //값 입력
        while (true) {
            System.out.println("첫번째 숫자를 입력하세요: ");
            int a = scanner.nextInt();

            if (a < 0) {
                System.out.println("0을 포함한 양의 정수로 다시 입력해주세요");

            } else {
                break;
            }
        }

        while (true) {
            System.out.println("두번째 숫자를 입력하세요: ");
            int b = scanner.nextInt();

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
        System.out.println("테스트");







    }

}
