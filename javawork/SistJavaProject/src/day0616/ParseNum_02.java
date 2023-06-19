package day0616;

public class ParseNum_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1="10";
		String num2="20";
		
		System.out.println("두수 더하기: "+(num1+num2));
		// 위 문구 실행하면 두수 더하기: 1020 으로 나옴
		// 10+20 즉 30으로 출력하고 싶으면 형변환을 해야 함
		
		// String타입을 int타입으로 변경하려면
		// Integer.parseInt -> parseInt 매서드를 찾기 위해 Integer(래퍼 클래스) 라는 클래스가 필요 
		// Integer.parseInt("10"); => 이렇게 실행하면 문자열 10이 정수 10으로 반환됨
		// Double.parseDouble("12.23"); => 이렇게  실행하면 문자열 12.23이 실수타입의 12.23으로 반환됨
		
		//문자열 num1, num2를 정수타입 int로 변환 후 계산해보기
		
		int su1=Integer.parseInt(num1);
		int su2=Integer.parseInt(num2);
		
		System.out.println("변환 후 두수 더하기: "+(su1+su2));
		
		System.out.println("변환 후 두수 빼기 "+(su1-su2));
		System.out.println("변환 후 두수 곱하기"+(su1*su2));
		System.out.println("변환 후 두수 나누기"+(su1/su2));
		
		//나누었을 때 왜 0이 나와요? => 정수형을 연산하면 정수형이 나옴!(소수점을 표현하지 않는다는 뜻)
		
		
	}

}
