package day0619;

import java.util.Scanner;

public class QuizOper_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 월 급여를 입력해서 만원, 천원, 백원, 십원, 일원 개수 출력하기
		// ex. 금액을 입력하시오
		/*
		 * 2,565,325 입력했을 때
		 * =================
		 * 만원: 256
		 * 천원: 5
		 * 백원: 3
		 * 십원: 2
		 * 일원: 5
		 */
		
		//Scanner sc=new Scanner(System.in);
		
		//int wage;
		
		//System.out.print("금액을 입력하시오");
		//wage=sc.nextInt();
		
		//int mill=wage/10000;
		//int thou=(wage-2560000)/1000;
		//int hund=(wage-2560000)/10000;
		//int ten=(wage-2560000)/100000;
		
		//System.out.println("==============");
		//System.out.println("급여: "+wage+"원");
		//System.out.println("만원: "+mill);
		//System.out.println("천원: "+thou);
		//System.out.println("백원: "+hund);
		//System.out.println("십원: "+ten);
		
		
		// 교수님 방법
		
		Scanner sc=new Scanner(System.in);
		int pay;
		
		System.out.println("금액을 입력하세요");
		pay=sc.nextInt();
		
		System.out.println("만원: "+pay/10000);
		System.out.println("천원: "+(pay%10000)/1000); // pay를 10000으로 나눈 것을 1000으로 나눈 것
		System.out.println("백원: "+(pay%1000)/100);
		System.out.println("십원: "+(pay%100)/10);
		System.out.println("일원: "+(pay%10));
		
	}

}
