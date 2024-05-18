package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32768 ~ 32767까지
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 21억), 정수는 기본적으로 int 많이 사용

        long l = 9223372036854775807L; // 제일 긴 정수 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        // long 타입의 경우 리터럴 뒤에 l 또는 L을 사용하는데 l은 1과 잘 구분이 되지 않아 L 사용을 권장

        // 대부분 int 사용하며 아래로 내려올수록 메모리 공간 많이 사용

        // 실수
        float f = 10.0f; // 소수점 계산에 오류가 많이 발생하여 권장하지 않음
        double d = 10.0; // 정밀도가 더 높은 실수 ( 표현 범위의 차이에 의해 실수는 기본적으로 double을 많이 사용 )
    }
}

