package day0619;

import java.util.Scanner;

public class OperTest_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 산술 연산자 +,-,*,/,%
		// 두 수 입력 후 구해보기?
		
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		
		System.out.println("두 수를 입력해 주세요");
		x=sc.nextInt(); // 다음에 문자열이 오는 것이 아니기 때문에 nextint로 해도 괜찮음
		y=sc.nextInt();
		
		// 산술 출력
		
		System.out.println("더하기= "+(x+y));
		System.out.println("빼기= "+(x-y));
		System.out.println("곱하기= "+(x*y));
		System.out.println("나누기= "+(x/y));
		System.out.println("나머지= "+(x%y));
		
		
	}

}
