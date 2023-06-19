package day0619;

import java.util.Calendar;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class ScannerMyAge_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 당신의 이름은? 박병주
		 * 당신의 출생년도는? 1998년
		 * ========================================
		 * 이름: 박병주
		 * 현재년도: 2023년
		 * 나이: 25세
		 */
		
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		
		String name;
		int cur=cal.get(cal.YEAR);
		int birth;

		
		System.out.println("당신의 이름은?");
		name=sc.nextLine();
		System.out.println("당신의 출생년도는?");
		birth=Integer.parseInt(sc.nextLine());
		
		int age=cur-birth+1;
				
		System.out.println("=======================");
		System.out.println("이름: "+name);
		System.out.println("현재년도: "+cur);
		System.out.println("나이: "+age);
		
		
		// 교수님 풀이
		// 생성
		//Scanner sc=new Scanner(System.in);
		//Calendar cal=Calendar.getInstance();
		
		//변수
		//String name;
		//int myYear;
		//int age;
		
		//int curYear=cal.get(cal.year);
		
		//입력
		//System.out.print("당신의 이름은? ");
		//name=sc.nextLine();
		//System.out.print("당신의 출생년도는? ");
		//myYear=sc.nextInt();
		
		//나이 계산
		//age=curYear-myYear;
		
		// 최종 출력
		//System.out.println("=======================");
		//System.out.println("이름: "+name);
		//System.out.println("현재년도: "+curYear+"년도");
		//System.out.println("나이: "+age+"세");
		
		
		
	}

}
