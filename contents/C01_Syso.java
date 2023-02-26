/* 
출력문 설명
  - 단축키 : "syso" + ctrl + space
 */

package contents;

public class C01_Syso {
	public static void main(String[] args) {//클래스 안에서 메인공간을 만든 것, 이 안에 코드 작성 진행
		//System.out.println(출력할 내용);
		
//		1. 문자열 출력
//		쌍따옴표("") 안에 내용은 문자열 데이터로 인식
//		문자열 간에는 '+'기호로 이어 붙일 수 있다. 
		System.out.println("겨울입니다.");
		System.out.println("날씨가 춥습니다.");
		System.out.println("다음달은 " + "봄입니다.");
		
//		2. 숫자 데이터 출력
		System.out.println(24); //정수 출력
		System.out.println(12.5); //실수 출력
		System.out.println(10 + 20); //숫자 데이터 연산
		System.out.println(1.2 + 3.4);
		
//		3. 문자열과 숫자 데이터
		System.out.println("10"); //문자열 출력
		System.out.println(10);  //숫자 출력, 위 문자열과 출력되는 결과는 같음
		
//		형태가 다른 대상들도 '+'기호로 결합 가능(타입이 달라도)
		System.out.println("Maroon" + 5);
		System.out.println("오늘은 " + 2 + "월 입니다.");
		System.out.println("20 + 30 = " + (20 + 30));  // ()없이 문자열 + 숫자를 하게되면 숫자는 문자열로 잡아먹히며
		// 앞에서 부터 순차적 결합이 되기에 원하는 50을 얻으려면 (), *, /로 연산의 우선 순위를 고려해야 한다.
		System.out.println("20 * 30 = " + 20 * 30);
		
//		4. println vs print
		System.out.println("자동으로 줄바꿈해주는");
		System.out.println("println");
		
		System.out.print("줄바꿈 없이 출력해주는");
		System.out.println("print");
		
//		\n: new line. 줄바꿈 실행
		System.out.println("문자열 안에 \n 줄바꿈 넣기");
		
//		c언어처럼 출력할 수 있다(이런게 있는데 사용은 안한다.)
		System.out.printf("정수: %d\n", 30);
	}
}
