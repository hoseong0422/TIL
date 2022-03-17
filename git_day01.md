# 마크다운 문법



# 제목 (Heading)

- h1 ~ h6 제목을 표현

- `#` 을 통해 만든다.

- 수준은 1 ~ 6 까지 가능



# 목록

- 순서가 없는 목록 : `-`   `*`  `+` (마찬가지로 뒤에 띄어쓰기 필요)
  - tab을 통해 들여쓰기, shift + tab 통해 내어쓰기 가능

- 순서가 있는 목록 : `1.` `2.` `3.` 숫자를 사용



# 글꼴 

- *기울임* : `*글자*`, `_글자_`, ctrl + i (타이포라에서만) 
- **굵게** : `**글자**` , `__글자__`, **ctrl + b**(타이포라에서만)
- ~~취소선~~ : `~~글자~~`
- 밑줄 : <u>ctrl + u</u> (타이포라에서만)



# 코드(code)

- 한 줄 코드 : `인라인 코드` (백틱으로 감싸기)
- 여러줄 코드 : ```python (백틱 3번 입력하고 코드의 종류를 작성)

```python
print("Hello git!")
```

```bash
mkdir test
cd test
```



# 링크

- `[표시할 글자](주소)` 하이퍼링크 걸기

[Github - TIL](https://github.com/hoseong0422/TIL.git)



# 이미지

- `![표시할 글자](보여주고 싶은 사진 url)`

<img src="https://git-scm.com/images/logos/downloads/Git-Logo-2Color.png" alt="Git 로고" style="zoom: 50%;" />



![image-20220317130322120](마크다운 문법!!.assets/image-20220317130322120.png)





# 인용

- 인용문
- `>` 를 사용하여 인용, 중첩이 가능

> 인용문 작성
>
> > 중첩된 사용 
> >
> > > 가능합니다.



# 수평선

- 구분선 `***`,`---`, `___`

***

___

---



# 표

- 타이포라를 쓰는 이유
- 원래 파이프 (|), 하이픈(-) 가지고 만들어야 한다.
- 타이포라에서는 `ctrl + t` 를 통해서 만들 수 있다.



| 설치 목록 | 완료 인원 | 비고 |
| :-------- | --------- | ---- |
| git       | 50        |      |
| vscode    | 40        |      |
| typora    | 50        |      |

`ctrl + /` 를 통해 원본 확인 가능

---

# CLI 기초

1. `GUI (Graphic User Interface)` : 그래픽을 통해 사용자가 컴퓨터가 상호 작용하는 방식
2. ` CLI (Command Line Interface)` : 터미널을 통해 사용자와 컴퓨터가 상호 작용하는 방식

## CLI를 사용하는 이유

CLI보다 GUI가 단계가 많고 컴퓨터의 성능을 더 많이 소모합니다.

그리고 CLI는 GUI로는 불가능한, 많은 세부적인 기능을 사용 할 수 있습니다.

## 경로

### 루트, 홈 디렉토리

1. **루트 디렉토리** (Root Directory, `/`)
   - 모든 파일과 폴더를 담고 있는 최상위 폴더
   - Windows의 경우 보통은 `C 드라이브`를 위미



2. **홈 티렉토리** (Home Directory, `~`)
   - `Tilde(틸드)` 라고도 부르며, 현재 로그인 된 사용자의 홈 폴더를 의미
   - Windows의 경우 `C:/Users/현재 사용자 계정`을 의미합니다.
   - Mac의 경우 `/Users/현재 사용자 계정`을 의미합니다.



### 절대 경로와 상대 경로

1. **절대 경로** : 루트 디렉토리부터 목적 지점까지 거치는 모든 경로를 전부 작성한 것
   - 윈도우 바탕화면의 절대 경로 C:/Users/현재 사용자 계정/Desktop
2. **상대 경로** : 현재 작업하고 있는 디렉토리를 기준으로 계산된 상대적 위치를 작성한
   - 현재 작업하고 있는 디렉토리가 `C:/Users`라고 한다면
   - 윈도우 바탕 화면으로의 상대 경로는 `현재 사용자 계정/Desktop`이 됩니다.
   - 간결해서 좋지만, 현재 작업하고 있는 디렉토리가 변경 되면 상대 경로도 변경됩니다.
   - `./`: 현재 작업하고 있는 폴더를 의미합니다.
   - `../` : 현재 작업하고 있는 폴더의 부모 폴더를 의미합니다.

​	

## 터미널 명령어

1. `touch`

   - <u>파일 생성 명령어</u>

   - 띄어쓰기로 한번에 여러 파일을 한꺼번에 생성 가능

   - 숨김 파일을 만들기 위해서는 `.`을 파일 명 앞에 붙입니다.

     ``` bash
     $ touch text.txt
     ```

2. `mkdir`

   - make directory

   - <u>새 폴더 생성 명령어</u>

   - 띄어쓰기로 구분하여 여러 폴더 한꺼번에 생성 가능

   - 폴더 이름 사이에 공백이 있다면 따옴표로 묶어서 입력합니다.

     ```bash
     $ mkdir folder
     $ mkdir 'folder name'
     ```

     

3. `ls`
   - List Segments
   - <u>현재 작업 중인 디렉토리의 폴더/파일 목록을 보여주는 명령어</u>
   - `-a` : all 옵션. 숨김 파일까지 모두 보여줍니다.
   - `-ㅣ` : long 옵션. 용량, 수정 날짜 등 파일정보를 자세히 보여줌



```bash
# 기본 사용
$ ls

# all 옵션
$ ls -a

# all, long 옵션 함께 적용
$ ls -a -l == $ ls -al # 여러 옵션 축약 가능

```



4. `mv`

   - move

   - <u>폴더/파일을 다른 폴더로 내로 이동 하거나 이름을 변경하는 명령어</u>

   - 단, 다른 폴더로 이동할 때는 작성한 폴더가 반드시 있어야 한다.

     없으면 이름이 변경됨

```bash
# text.txt를 folder 폴더 안에 넣을 떄
$ mv text.txt folder

# text.txt의 이름을 txt2.txt로 바꿀 때
$ mv text.txt txt2.txt

# 실수 방지를 위해 이동 할 폴더 뒤에 /를 붙여주자 
# 폴더가 없으면 에러 발생
# -> mv: cannot move 'README.md' to 'read/': No such file or directory
```



5. `cd`
   - change directory
   - 현재 작업 중인 디렉토리를 변경하는 명령어
   - `cd ~`를 입력하면 홈 디렉토리로 이동합니다. ( 단순히 `cd` 라고만 입력해도 동일)
   - `cd ..`을 입력하면 부모 디렉토리로 이동  (위로 가기)
   - `cd -`를 입력하면 바로 전 디렉토리로 이동 (뒤로 가기)

6. `rm`
   - remove
   - 폴더/파일 지우는 명령어
   - GUI와 달리 휴지통으로 이동하지 않고, 바로 `완전 삭제`합니다.
   - `*(asteristk, wildcard)`를 사용해서 `rm *.txt`라고 입력하면 txt 파일 전체를 다 지웁니다.
   - `-r` : recursice 옵션, 폴더를 지울 때 사용합니다.

```bash
$ rm test.txt
$ rm -r folder/ # 폴더/디렉토리 관련해서는 항상 뒤에 / 붙여주기
```



7. `start , open`
   - 폴더/파일을 여는 명령어
   - `Windows`에서는 start를, `Mac`에서는 open을 사용

```bash
# Windows
$ start test.txt

#Mac
$ open test.txt
```

---

# Git!

## 버전 관리란?

- 버전 관리 시스템은 **파일 변화를 시간에 따라 기록**했다가 나중에 **특정 시점의 버전을 다시 꺼내올 수 있는** 시스템이다.



### 로컬 버전 관리 (로컬 VCS)

- 한대의 컴퓨터에서 버전 관리

  

  <img src="https://git-scm.com/book/en/v2/images/local.png" alt="로컬 버전 관리" style="zoom:50%;" />



### 중앙집중식 버전 관리(CVCS)

- 서버가 별도로 있고 클라이언트가 중앙 서버에서 파일을 받아서 사용
- 서버에 문제가 생기면 작업이 불가능하다.



<img src="https://git-scm.com/book/en/v2/images/centralized.png" alt="중앙집중식 버전 관리(CVCS)" style="zoom:50%;" />



### 분산 버전 관리 시스템 (DVCS)

- 저장소를 히스토리와 더불어 전부 복제
- 서버에 문제가 생기면 복제물을 이용해서 작업 진행 가능



<img src="https://git-scm.com/book/en/v2/images/distributed.png" alt="분산 버전 관리 시스템(DVCS)" style="zoom: 67%;" />



### Git 초기설정

- 최초 한번만 설정
- 누가 커밋 기록을 남겼는지 확인할 수 있도록 이름과 이메일을 설정.

```bash
$ git config --global user.name "Github_Username"
$ git config --global user.email "Github_User_ID"
$ git config --global core.editor "code --wait"
```



```bash
# 작성자가 잘 설정되었는지 확인

$ git config --global -l

또는

$ git config --global --list
```



### 세 가지 상태

- Committed : 데이터가 로컬 데이터베이스에 안전하게 저장
- Modified : 수정한 파일을 아직 로컬 데이터베이스에 커밋하지 않은 것
- Staged : 현재 수정한 파일을 곧 커밋할 것이라고 표시한 상태



### Git 프로젝터의 세 가지 단계

<img src="https://git-scm.com/book/en/v2/images/areas.png" alt="Working tree, staging area, and Git directory." style="zoom:67%;" />



1. 워킹 트리에서 파일을 수정
2. Staging Area에 파일을 Stage 해서 커밋할 스냅샷을 만든다.
3. Staging Area에 있는 파일들을 커밋해서 Git 디렉토리에 영구적인 스냅샷으로 저장



### git init

```bash
$ git init
```

- 현재 작업 중인 디렉토리를 Git으로 관리한다는 명령어
- `.git`이라는 하위 디렉토리를 생성 (.git 안에는 저장소에 필요한 뼈대(Skeleton) 파일이 들어있음)



### git  명령어

```bash
# git 상태 조회
$ git status

# Working Diretory -> Staging Area
$ git add a.txt # 특정 파일
$ git add folder/ # 특정 폴더
$ git add . # 현재 디렉토리에 속한 파일/폴더 전부
```



### git commit

```bash
# commit (현재의 버전을 기록/저장)
$ git commit -m "message here!"
```



### git log

```bash
# commit log를 조회 (누가 언제 commit 했는지?)
$ git log
```

- `--oneline` : 한 줄로 축약해서
- `--graph` : 브랜치와 머지 내역을 그래프로 보여줌
- `--all` : 현재 브랜치를 포함한 모든 브랜치의 내역을 보여줌
- `--reverse` : 커밋 내역이 순서를 반대로 보여줌 (최신이 가장 아래)
- `-p` : 파일의 변경 내용도 같이 보여줌
- `-2` : 원하는 갯수 만큼의 내역을 보여줌 (2 대신 원하는 갯수 입력)

