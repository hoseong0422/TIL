package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { // for 문에서 선언한 변수 역시 for 문 블럭 안에서만 사용 가능
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        }
    }
}
