/* 대입 연산자
*/
package contents;

public class C02_PutData {
	public static void main(String[] args) {
//		= : 대입연산자
//		오른쪽의 데이터를 왼쪽 대상에 저장한다.
//		cf) 같음의 의미는 "=="
		
		int a;
		a = 10; // a에 정수 10을 대입
		System.out.println(a);
		
		int b;
		b = 20;
		System.out.println(b);
		
		b = a;  //a에 들어있는 값을 b에 대입
		System.out.println(b);
		b = a + 100; //(a + 100) 결과를 b에 대입
		System.out.println(b);
		a = b = 50; //50을 b에 대입한 후, b값을 a에 대입
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		String c;
		c = "문자열 메세지"; //문자열을 c에 대입
		System.out.println(c);
		
	}
}