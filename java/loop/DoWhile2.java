package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i); // while 조건에 만족하지 않아도 최초 1회는 부조건 실행
            i++;
        } while (i < 3);
    }
}
