package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        // 내 풀이
//        int rows = 5;
//        String pyramid = "";
//
//        for (int i = 1; i <= rows; i++) {
//            pyramid += "*";
//            System.out.println(pyramid);
//        }

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
