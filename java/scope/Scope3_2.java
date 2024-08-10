package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2; // if 블럭에서 사용하는 변수는 if 블럭 내부에 선언
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
