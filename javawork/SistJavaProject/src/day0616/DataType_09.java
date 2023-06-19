package day0616;

public class DataType_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 묵시적 형변환: 말하지 않아도 아는, 자동으로 결정되는 타입
		// String+int = String이 됨
		// double+int = double이 됨
		// long+short = long이 됨
		// char+int = int가 됨
		
		char a='a';
		
		System.out.println(a);
		System.out.println(a+2); // char+int = int가 되는 것
		System.out.println((char)(a+2)); // a+2를 문자로 보고싶어! => (char)을 붙여줌
		
		System.out.println("Happy"+5+6);
		System.out.println(""+5+6); // "" 안에 공백이어도 문자가 됨
		System.out.println("Happy"+(5+6));
		
		System.out.println('A'+3); // A의 아스키 코드 값 65 + 3 = 68이 나옴
		
		System.out.println(2+'b'); // 2+98
		System.out.println('a'+'b'); // 97+98
		System.out.println('a'); // 그냥 'a'로 하면 a 가 출력됨 / but 연산이 들어가면 정수형이기 때문에 숫자로 출력
		
		
		
	}

}
