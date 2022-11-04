package or.co.org.coco.kr.ttido.studyJava.classStudy;
import java.util.Scanner;     //Scanner 함수 사용하기 위해 import 시킴




public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    //입력 받는 값을 Sys.in 에 저장함

        System.out.println("첫 반째 숫자를 입력하시오");
        String str1 = sc.nextLine();        //숫자 입력

        System.out.println("사칙 연산자를 입력하시오");
        String op = sc.nextLine();

        System.out.println("두 번째 숫자를 입력하시오");
        String str2 = sc.nextLine();

        int num1 = Integer.parseInt(str1);          // 입력받은 첫 번째 문자를 숫자형으로 변경해주는 것
        int num2 = Integer.parseInt(str2);         // Integer클래스 내에 있는 perseINT메소드를 홏출한 것이다.
        int result = 0;
    //모든 값을입력 받았따.

        if (op.equals("+"))
            result = num1 + num2;

        else if (op.equals("-"))
            result = num1 - num2;

        else if (op.equals("*"))
            result = num1 * num2;

        else if (op.equals("/"))
            result = num1 / num2;

        System.out.println(str1 + " " + op + " " + str2 + " = " + result); // 결과값 출력







    }

}
