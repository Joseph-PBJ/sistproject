package day0619;

public class OperTest_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비교 연산자: >, >=, <, <=, ==, !=
		// 논리연산자: &&(and), ||(or), !(not)
		
		// 결과값을 true, false로 출력해보기
		int a=5, b=3, c=5;
		
		System.out.println(a>b); // true
		System.out.println(a==b); // false
		System.out.println(!(a==b)); // true
		System.out.println(a!=b); // true
		
		System.out.println(a>b&&b>c); // false // && 연산자는 하나라도 틀리면 false
		System.out.println(a>b||b>c); // true or false => 하나만 맞아도 true
		
	}

}
