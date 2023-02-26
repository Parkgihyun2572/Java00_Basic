/* 이클립스 환경 알아보기
 
0. 주석문(comments) : 프로그래머가 메모 또는 코드를 설멍하는 용도. 코드 실행 X
  - 한줄주석: ctrl + /
  - 여러줄 주석: ctrl + shift + / (해제: 원키)
    * 색상수정 : preferences > java > editor > syntax coloring > comments
      노: 230, 219, 116
      초: 142, 183, 116
      
1. 이클립스 환경 설정
  가. 테마 수정 : 상단 window > Perference > General > Appearance > 테마 수정

  나. 이클립스 UI 확대하기
    이클립스가 설치되어 있는 폴더의 eclipse.ini 메모장으로 오픈
    다음 코드 입력. autoScale = 원하는크기 
-Dswt.enable.autoScale=true 
-Dswt.autoScale=150
-Dswt.autoScale.method=nearest

  다. 폰트 수정
    : Windows > Preferences > General > Appearance > Colors and Fonts > Debug > Console font
    - 폰트 확대, 축소: ctrl + '+'/'-'

  라. 이클립스 레이어웃 초기화 하는 법
    : Window > Perspective > Reset Perspective
    
  마. 한글깨짐 처리하기
    : Windows>preference>general>workspace>text file encoding: 'UTF-8'
	  >content types>Java Class File> Default encoding: MS949 입력하고 update
    - 프로젝트 가져와서 실행시 Console창 실행화면 한글 깨짐 해결: 
      : run > run configration > common >endcoding: MS949 입력 후 실행

3. 파일 공통 작명규칙
  - 대소문자를 구분함
  - 특수문자는 "_", "$"만 가능
  - 파일 명을 숫자로 시작할 수 없음
  - 자바 키워드 사용 불가
  - 한글 이름 가능

4. 단위 별 파Project 대문자 - package 소문자 - Class 대문자
프로젝트: 대문자 시작 권장
패키지: 소문자 시작 원칙
클래스: 대문자 시작 원칙

*/
package contents;

public class C00_Eclipse {
	//"main" + ctrl + space: 메인메소드 자동완성
	public static void main(String[] args) {
		// 한줄 주석
		/*
		 * 여러줄 주석
		 * 여러줄에 주석 처리
		 */
		
//		"syso" + ctrl + space: 출력문 자동완성
		System.out.println("OT진행");
		
//		System.out.println("금요일"); 한줄 주석처리
		
		/* 여러줄 주석처리
		 * System.out.println("아무말"); System.out.println("어이!");
		 * System.out.println("주석처리 해볼거야아");
		 */
		
		//실행(Run): ctrl + F11
		System.out.println("hi!!");
//		System.out.println("실행이야 실행!")
//		=> 에러: 빨간 줄이 표시되면 에러 발생. 실행이 불가함
	}
}