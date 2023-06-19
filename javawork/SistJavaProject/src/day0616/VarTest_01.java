package day0616;

public class VarTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10진수의 정수의 저장을 위한 메모리공간을 할당하겠다
		int num;
		//위 문구의 의미는 그 메모리 공간의 이름을 num이라고 하겠다는 뜻
		//int 변수의 특성을 결정짓는 키워드를 자료형 이라고 한다 -> 키워드는 변수명으로 불가능
		//숫자로 시작하는 것은 안됨, $ _ 는 가능 / 나머지 특수문자는 사용 불가
		
		int num1;
		num1=100;
		
		//위 문구들을 아래처럼 한 줄로 입력해도 OK
		int num2=200; 
		
		int num3=num1+num2;
		
		System.out.println(num1+"+"+num2+"="+num3);
		
		
		
	}

}
