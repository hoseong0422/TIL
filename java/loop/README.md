# 반복문
- 특정 조건 코드를 반복해서 실행할 떄 사용
- 반복문에는 `while`, `for`문이 있다.

## while문
```java
while (조건식) {
    // 코드
}
```
- 조건식이 참이면 코드 블럭 실행하고 거짓이면 while문 종료

## do-while 문
- 조건에 상관없이 무조건 한 번은 코드를 실행
``` java
do {
    // 코드
} while (조건식);
```

## break, continue
- 반복문에서 사용하는 키워드
- break : 즉시 종료
- continue 반복문의 나머지 부분을 건너뛰고 다음 반복 진행

### break
```java
while (조건식) {
    코드 1;
    break; // 코드2가 실행되지 않고 즉시 while문 종료
    코드 2;
}
```

### continue
```java
while(조건식) {
    코드 1;
    continue; // 즉시 조건식으로 이동하여 조건이 참일경우 while문 다시 실행
    코드 2;
}
```