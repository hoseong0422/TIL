package condition.ex;

public class Ex6 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // 내 풀이
        String result = (a > b) ? "더 큰 숫자는 " + a + "입니다." : "더 큰 숫자는 " + b + "입니다.";
        System.out.println(result);

        // 정답
        // int max = (a > b) ? a : b;
        // System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
