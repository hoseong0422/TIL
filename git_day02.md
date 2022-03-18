# GIt & Github 2일차 정리

## git init -> local repository  생성



**local repository** : 영역에서의 작업 (내 컴퓨터에서 init한 폴더, 깃허브에서 클론해온 폴더)

<img src="https://git-scm.com/book/en/v2/images/areas.png" alt="Working tree, staging area, and Git directory." style="zoom: 67%;" />



**remote repository** : 깃허브 repository



local repository 와 remote repository 연걸

```bash
# origin 이란 이름을 쓰는것이 관례
git remote add origin [Github repository URL]

# 리모트 상태 확인
git remote -v
```



```bash
# commit 된 데이터 push ( local -> remote )
git push origin master # 상향식 이동
```

```bash
# 하향식 연결 ( remote -> local )
git clone [Github repository URL] [복제할 이름]
```

- clone된 repository라면 remote 연결 해주지 않아도 된다. init도 불필요

<img src="https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318104808758.png?raw=true" style="zoom:120%;" />



```bash 
# 폴더로 이동하면 (master)로 바뀌는것이 확인된다.
# 리모트도 되었고 폴더안에 .git 폴더도 생성된것 확인가능
cd [복제한 이름]
```



```bash
# 하향식 이동 ( remote에 새로운 커밋이 있을경우 )
git pull origin master
```

![image-20220318112717567](https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318112717567.png?raw=true)



- remote repository에 push / pull 기능을 사용하면 다른 환경에서 혹은 다른사람들과 작업을 이어가는것이 가능해진다.

  

## branch

> 버전 관리의 꽃

<img src="https://media.vlpt.us/images/jaeseok-go/post/e54cc0bc-f519-42ed-8be3-c2683687d987/image.png" alt="post-thumbnail" style="zoom: 67%;" />

### 브랜치는!

- 나뭇가지처럼 **작업 영역**을 여러개로 나누어서 <u>독립적으로 작업</u> 할 수 있게 함

왜?! 브랜치를 써야할까?

- 예시 : 카카오 개발자 -> 카카오톡의 채널 탭을 신규 개발하는 경우
  - 1번 ) master branch에서 그대로 작업
    - master : 이미 상용화되어 서비스 되고 있는 곳
      - 이미 세상에 나와있는 서비스 => 카카오톡
    - 작업 중 에러가 난 경우는 서비스 장애 발생
  - 2번 ) 신규 개발을 위한 branch를 생성하여 작업
    - 신규로 branch 생성 -> 작업 -> 버그 처리 ->
    - 작업 완료된 기능을 다시 master에 push



## 브랜치 명령어

- git branch

> 조회, 생성, 삭제

```bash
# 브랜치 목록 조회
git branch

# 원격 저장소의 브랜치 목록을 포함하여 조회
git branch -r

# 신규 브랜치 생성 -> 지금까지 master에 쌓인 모든 커밋이 포함 된
git branch [branch 이름]

# 커밋 아이디를 기준으로 브랜치 생성
git branch [branch 이름] [commet ID]

#브랜치 삭제 -> 병합 완료된 브랜치들만 삭제 가능
git branch -d [branch 이름]

# 병합완료되지 않은 브랜치 삭제
git branch -D [branch 이름]
```



![image-20220318133156230](https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318133156230.png?raw=true)

- branch ID :  `git log`에서 보이는 노란 글자들

### git switch

> 이동한 내역은 HEAD, 혹은 경로 옆 괄호 표시를 보고 확인 가능하다!

```bash
# 다른 브랜치로 이동
git switch [이동하고자 하는 branch 이름]

# 생성과 동시에 이동
git switch -c [branch 이름]

# commit ID를 기준으로 브랜치 생성과 동시에 이동
git switch -c [branch 이름] [commit ID]
```



<img src="https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318141637478.png?raw=true" alt="image-20220318141637478" style="zoom:130%;" />

-> 브랜치 생성 후 이동한 모습



<img src="https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318143731252.png?raw=true" alt="image-20220318143731252" style="zoom:120%;" />



```bash
# 다른 브랜치에 있는 커밋 로그 전체 보기
$ git log --oneline --all

# 그래프 이용해서 커밋로그 보기
$ git log --oneline --all --graph
```



### git merge

- branch에서 작업이 끝나면,  master 브랜치에 병합해서 서비스 운영 할 수 있도록
- `merge` -> 병합

```bash
# git merge => 분기된 branch 합치기
# master로 이동한 다음 merge 진행
git merge [합칠 브랜치 이름] # -> master에 병합할거라 합칠 브랜치 이름만 필요
```



![image-20220318145708441](https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318145708441.png?raw=true)

- 놀이기구만 있던 master에 어린이 놀이기구가 추가되었다.

  

```bash
# 병합된 branch 삭제하기!
git branch -d kids
```



![image-20220318150028421](https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318150028421.png?raw=true)





> 같은 라인에 데이터가 있는 상태에서 브랜치를 머지하는 경우

![image-20220318151603823](https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318151603823.png?raw=true)

- CONFLICT 발생 -> 어떻게 merge할지 선택 후 저장 ->  **git add** -> **git commit** 진행

![image-20220318151955707](https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318151955707.png?raw=true)



## 소유권이 없는 상황에서 clone

- Fork 버튼을 눌러 내 Github 상에 레포지토리에 복제 후 로컬로 clone 작업을 실시
- clone 후 master가 아닌 추가 branch 생성 후 작업 실시

![image-20220318170946996](https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318170946996.png?raw=true)

```bash
# pull request가 완료된 상태에서 pull 하기 위한 설정
git remote add upstream [원본 URL]
```

- 브랜치에서 작업 완료 후 `git add`, `git commit`실시

<img src="https://github.com/hoseong0422/TIL/blob/master/images/GIt_Day02/image-20220318171729602.png?raw=true" style="zoom:120%;" />

> 브랜치 이름으로 다시 업로드 실시하면 이렇게 나온다.



```bash
# 작업 완료 후 리모트 레포지토리로 push
git push origin [branch 이름]
```

-> reviewer가 merge 해주면 된다. 

