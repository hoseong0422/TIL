package condition;

public class If5 {
    public static void main(String[] args) {
        // 할인 조건
        // 가격이 10,000원 이상일 때, 1,000원 할인
        // 나이가 10살 이하일 때 1,000원 할인
        // 한 사용자가 동시에 여러 할일은 할인받는 경우
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매, 1,000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1,000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
