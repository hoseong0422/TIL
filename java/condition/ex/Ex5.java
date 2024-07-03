package condition.ex;

public class Ex5 {

    public static void main(String[] args) {

        String grade = "A";
        String feedback;

        switch (grade) {
            case "A":
                feedback = "탁월한 성과입니다.";
                break;
            case "B":
                feedback = "좋은 성과입니다.";
                break;
            case "C":
                feedback = "준수한 성과입니다.";
                break;
            case "D":
                feedback = "향상이 필요합니다.";
                break;
            case "F":
                feedback = "불합격입니다.";
                break;
            default:
                feedback = "잘못된 학접입니다.";
        }

        System.out.println(feedback);
    }
}
