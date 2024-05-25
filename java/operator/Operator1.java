package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // a + b = 7

        // 뼬셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // a - b = 3

        // 곱셉
        int multi = a * b;
        System.out.println("a * b = " + multi); // a * b = 10

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // a / b = 2 -> 정수형이라 실수 표현 X

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // a % b = 1

        // int z = 10 / 0;
        // System.out.println(z); // 0으로 나누면 예외 발생 수학에서도 불가능 Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
