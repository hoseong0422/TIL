package loop;

public class Break1 {

    public static void main(String[] args) {
        // 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 언제일까?
        int sum = 0;
        int i = 1;

        while(true) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }
    }
}
