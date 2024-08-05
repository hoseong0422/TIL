package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 이라는 변수 선언
        if (true) {
            int x = 20; // x 라는 변수 선언 (if문 안에서만 사용가능한 변수)
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x는 이제 사용 불가
        //System.out.println("main x = " + x); //cannot find symbol 에러 발생!!
        System.out.println("main m = " + m);
    } // m은 이제 사용 불가
}
