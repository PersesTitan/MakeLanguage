# MakeLanguage
자바로 언어를 만드는 도움이 되는 라이브러리 입니다.</br>

## Jar 파일 다운로드 링크
[모든 버전 다운로드](https://downgit.evecalm.com/#/home?url=https://github.com/PersesTitan/MakeLanguage/tree/master/Jar)</br>
[V1 다운로드](https://downgit.evecalm.com/#/home?url=https://github.com/PersesTitan/MakeLanguage/tree/master/Jar/V1)</br>
[V2 다운로드](https://downgit.evecalm.com/#/home?url=https://github.com/PersesTitan/MakeLanguage/tree/master/Jar/V2)</br>

# 사용법
jar 파일을 다운로드 하신뒤 라이브러리에 jar파일을 추가해 주세요.</br>
</br>

## GetLine getLine = new GetLine(String[] args, String extension, boolean difCase);
설명 : 처음 값을 설정하는 생성자 입니다.</br>
  * args = main 메소드 값
  * extension = 확장자 입력
  * difCase = 확장자 대소문자 구분 허용 (true 대소문자 구분 X)

</br>

---

</br>


## getURL();
설명 : 파일텍스트를 받고 String 형으로 변환 시키는 메소드 입니다.</br>
리턴 타입 : String </br>


## endCode();
설명 : 바로 종료되는 것을 방지합니다. Enter를 눌르면 프로그램이 종료됩니다.</br>
리턴 타입 : void </br>

# 버전
  1. 2022/4/29 V1 - getURL, endCode 추가
  2. 2022/5/04 V2 - 생성자 형태로 변경
