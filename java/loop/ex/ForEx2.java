package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        for (int num = 2, count = 1; count <= 10; num += 2, count++) { // 한번에 2개의 변수에 대한 증감
            System.out.println(num);
        }

        // for문에서 한번에 2개개 변수 선언이 가능하지만 다른 용도까지 섞어서 사용하는것은 깔끔하지 않아보임
//        int num = 2;
//        for (int count = 1; count <= 10; count++) {
//            System.out.println(num);
//            num += 2;
//        }
    }
}
