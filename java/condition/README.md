# 조건문
- 특정 조건에 따라서 다른 코드를 실행하는 것
- 조건문에는 `if`문, `switch`문이 있다.
## if else 문
### if 문
- 특정 조건이 참인지 확인하고, 그 조건이 참(true)인 경우 코드 블록 실행
    ```java
    if (condition) {
        // 조건이 참일 때 실행되는 코드
    }
    ```

### else 문
- `if`문에서 만족하는 조건이 없다면 실행
    ```java
    if (condition) {
        // 조건이 참일 때 실행되는 코드
    } else {
        // 조건이 참이 아닐 때 실행되는 코드
    }
    ```

## else if 문
- 불필요한 조건 검사를 피하기 위해 코드의 효율성을 높이기 위해서 사용
- else는 생략 가능
### if-else
```java
if (condition1) {
    // 조건 1일 참일 때 실행
} else if (condition2) {
    // 조건 1이 거짓이고, 조건 2가 참일 떄 실행
} else if (condition3) {
    // 조건 2가 거짓이고, 조건 3이 참일 때 실행
} else {
    // 모든 조건이 거짓일 떄 실행
}
```

## if문과 else if 문
- `if` 문에 `else if`를 함께 사용하는 것은 서로 연관된 조건일 떄 사용
- 서로 관련이 없는 독립 조건이면 `else if`를 사용하지 않고 `if`문을 독립적으로 사용
```java
// 예시 1.  if-else 사용 : 서로 연관된 조건
if (condition1) {
    // 작업 1 수행
} else if (condition2) {
    // 작업 2 수행
}

// 예시 2. if문 각각 사용 : 독립 조건일 때
if (condition1) {
    // 작업 1 수행
}

if (condition2) {
    // 작업 2 수행
}
```

## if문 {} 중괄호 생략 가능
```java
if (true)
    System.out.println("if 문에서 실행됨");
```
- 이것도 두줄도 되는것처럼 보이지만 실제로 아래쪽 라인은 if문 바깥에서 실행됨
    ``` java
    if (true)
        System.out.println("if 문에서 실행됨");
        System.out.println("if 문 바깥에서 실행됨"); // if문 바깥에서 실행되는 코드
    ```
- 가독성, 유지보수성 때문에 권장하지 않는다