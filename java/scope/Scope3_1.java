package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2; // temp 변수는 if 코드 블럭에서만 사용되는데 main 코드 블럭에서 선언해서 메모리를 점유하게 할 필요가 없음
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
