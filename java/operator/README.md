# 연산자
## 연산자 종류
실무에서 만이 사용하는 연산자
- 산술 연산자 : `+`, `-`, `*`, `/`, `%` ( 나머지 )
- 증감 연산자 : `++`, `--`
- 비교 연산자 : `==`, `!=`, `>`, `<`, `>=`, `<=`
- 논리 연산자 : `%%` ( AND ), `||` ( OR ), `!` ( NOT )
- 대입 연산자 : `=`, `+=`, `-=`, `*=`, `/=`, `%=`
- 삼항 연산자 : `?`, `:`

## 연산자 피연산자
```
3 + 4
a + b
```
- 연산자( operator ) : 연산 기호 `+`, `-`
- 피연산자( operand ) : 연산 대상 `3`, `4`, `a`, `b`

# 문자열 더하기
문자열에 `+` 연산자를 사용하여 두 문자를 연결할 수 있다.
- 문자열에 더하는 타입들은 전부 문자열이 된다.

## 연산자 우선순위
수학의 사칙연산 우선순위와 동일하게 적용
- `*`, `/`이 먼저 계산되고 괄호 안의 연산이 먼저 계산

## 연산자 우선수위 암기법
외우지 않고 그떄그떄 검색해서 사용하면 되지만 아래 2가지만 기억하자!

**1. 상식선에서 우선순위를 사용하자**
- ```java
    int sum = 1 + 2 * 3
    ```
    - 당연히 `*`가 먼저
- ```java
    int sum = 1 + 2;
    int sum = 3; // 산술 연산자가 먼저 처리
    sum = 3 // 대인 연산자가 마지막에 처리
  ```
  - `1 + 2`를 처리한 후 그 결과를 변수 sum에 넣어야하기 떄문에 대입 연산자가 마지막에 수행

**2. 애매하면 괄호() 사용하기**