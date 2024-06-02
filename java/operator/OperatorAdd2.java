package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자 사용 예
        a = 1;
        b = 0;

        b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        // 1. b = a 대입
        // 2. a++ a에 증가 연산
        System.out.println("a = " + a + ", b = " + b);

        // 단독으로 사용하는 경우에는 전위, 후위 상관없음
        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
    }
}
