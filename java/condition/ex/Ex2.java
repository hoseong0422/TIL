package condition.ex;

public class Ex2 {
    public static void main(String[] args) {
        int distance = 1;
        String transportation;

        if (distance <= 1) {
            transportation = "도보";
        } else if (distance <= 10) {
            transportation = "자전거";
        } else if (distance <= 100) {
            transportation = "자동차";
        } else {
            transportation = "비행기";
        }

        System.out.println("distance: " + distance);
        System.out.println(transportation + "을 이용하세요.");
    }
}
