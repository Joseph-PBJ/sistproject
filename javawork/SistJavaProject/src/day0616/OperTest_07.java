package day0616;

public class OperTest_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본자료형은 총 8개
		// 실사용 : 논리형-boolean / 정수형-int / 실수형-double
		// 1.논리형(True, False로 대변이 되는) = boolean
		boolean b=false; // 실제 사용, bool이라고도 많이 씀
		
		// 2.문자형
		// char 는 '' 이어야 함 ("" xx) / 반드시 하나의 문자 (2byte 즉 16비트 유니코드값을 표현)
		// 자바에서 char 문자 하나는 2바이트
		// 기본적으로는 정수형임(아스키코드에서 변환해 보면 '가'라는 문자가 정수로 몇인지 알 수 있음)
		char ch='A';
		
		// 3.정수형
		byte a=-128; // 1바이트 -128~127까지 가능 / 즉 -128 다음은 -129가 아니라 127임
		short s=32000; //16bit임
		int c=6700000; //32bit임 / 실제 사용
		long num=100L; //64bit임 / 롱인지 구분하는 방법은 숫자 뒤에 L or l(소문자)을 써줌. 안붙이면 int가 되어버림
		
		// 4. 실수형
		double d=42356.14526; //64bit임 / 소수점을 의미함 / 실수형의 기본임
		float f=3.121314f; // 32bit임 / f를 붙여야 float 의미 / 안붙이면 double 의미
				
		// 비트로 크기를 어떻게 파악함?
		// int,float은 똑같이 32bit이지만 / 기본적으로 실수형이 정수형보다 큰 타임으로 처리된다. 실수형>정수형
		
		//출력해볼까?
		System.out.println("bool="+b);
		System.out.println("not bool="+!b);
		System.out.println("ch="+ch);
		System.out.println("ch="+(char)(ch+10)); //"K"으로 출력됨 / 형변환 한것 -> 10을 아스키코드에서 문자로 바꿔서 합쳐진 것
		System.out.println("ch="+(ch+1)); // (char)을 빼서 아스키코드로 변환된 숫자 값으로 나옴
		System.out.println("ch="+(char)(ch+1)); // (char)을 추가하면 아스키코드로 변환된 숫자에서 +1 값으로 나옴
		System.out.println("d="+d); //정밀도 15자리
		System.out.println("f="+f); //정밀도 8자리
		
		//printf %f:실수
		//전체 자리수 10자리 / 소수점 2자리 출력하려면
		
		System.out.printf("d=%10.2f\n",d); //10자리가 안되면 앞에 공백으로라도 둔다
		
		//소수점 1자리로 출력하려면
		System.out.printf("d=%.1f",d);
		
	}

}
