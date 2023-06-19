package day0616;

public class PrintfTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Printf는 문자열을 구성해서 출력
		// 문자열 뒤에 따라오는 데이터(%)를 순서대로 배치
		// %d: 정수 / %f: 실수 / %s: 문자열
		
		int num1=10,num2=20;
		// 같은 자료형이면 한 줄로 적어도 무관함!
		
		int num3=num1+num2;
		
		System.out.println(num1+"+"+num2+"="+num3);
		
		// Printf로 출력하기 => 문자열 안에서 출력 => ""안에서 출력하자!
		
		System.out.println("num1의 값은 %d,num2의 값은 %d,num3의 값은 %d입니다");
		//이렇게 출력하면 num1의 값은 %d,num2의 값은 %d,num3의 값은 %d입니다 => 이렇게 나옴!
		//따라서 문자열 뒤에 따라오는 데이터를 배치해야 함 즉,
		System.out.printf("num1의 값은 %d,num2의 값은 %d,num3의 값은 %d입니다",num1,num2,num3);
		//이렇게 출력하면 num1의 값은 10,num2의 값은 20,num3의 값은 30입니다 => 이렇게 나옴!
		
		
		
	}

}
