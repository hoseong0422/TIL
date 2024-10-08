# 형변환 - 자동 형변환
## 형변환
- 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.
    - 예) `int` -> `long` -> `double`
-  큰 범위에서 작은 범위는 다음과 같은 문제가 말생할 수 있다.
    - 소수점 버림
    - 오버플로우
- **작은 범위에서 큰 범위로 대입은 허용한다**
    - 자바에서 순자를 표현할 수 있는 범위는 `int < long < double` 순서
    - `int` -> `long`을 비교해보면 `long`이 더 큰 범위 숫자 타입이라 대입 가능
    - `long` -> `double`의 경우에도 `double`이 부동 소수점을 사용하기 떄문에 더 큰 범위 숫자 타입이라 대응 가능
    - 큰 그릇에 작은 그릇에 담긴 내용물을 옮겨 담을 수 있다.

## 자동형변환
- 다른 타입으로 대입할 경우 동작
    ```java
    intValue = 10;
    
    doubleValue = intValue; // double 변수에 int 변수 대입할 경우 아래의 단계로 변환이 일어난다.
    
    doubleValue = (double) intValue; // 1. 형 맞추기
    doubleValue = (double) 10; // 2. 변수 값 읽기
    doubleValue = 10.0; // 3. 형변환
    ```
    - 이렇게 작은 범위 숫자 타입에서 큰 범위 숫자 타입으로 대입하는 경우 자동으로 일어나는 형변환을 **자동 형변환** 또는 **묵시적 형변환**이라 한다.