// 변수를 초기화하지 않고 사용하게 된다면??
// 컴파일 에러 발생 variable a might not have been initialized
// 컴파일 에러는 오히려 빠르고 명확하게 확인 가능한 에러
// 런타임 에러가 가장 최악의 경우

package variable;

public class Var6 {
    public static void main(String[] args) {
        int a;
        System.out.println(a);
    }
}
