package day0619;

import java.util.Scanner;

public class ScannerScore_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 콘솔 창에 변수값을 입력 받아서 출력할것!!!
		
		Scanner sc=new Scanner(System.in);
		
		// 변수 선언
		
		String name;
		int kor,eng,mat; //같은 계열(정수, 문자열) 등은 한 줄에 입력해도 괜찮음
		int tot;
		double avg;
		
		// 입력
		
		System.out.println("학생의 이름은?");
		name=sc.nextLine(); // 입력되는 이름을 한 줄로 읽어온다는 의미
		
		System.out.println("국어 점수는?");
		kor=sc.nextInt();
		System.out.println("영어 점수는?");
		eng=sc.nextInt();
		System.out.println("수학 점수는?");
		mat=sc.nextInt();
		
		
		// 계산
		
		tot=kor+eng+mat;
		avg=tot/3.0;
		
		
		//최종 출력
		System.out.println("===============");
		System.out.println("학생명: "+name);
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+mat);
		System.out.println("총점: "+tot+"점");
		System.out.println("평균: "+avg+"점");
		
		
	}

}
