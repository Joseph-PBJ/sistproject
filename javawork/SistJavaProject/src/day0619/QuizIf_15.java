package day0619;

import java.util.Scanner;

public class QuizIf_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 점수를 입력하여 평가를 출력하시오
		/*
		 * 당신의 점수는? 88
		 * ==================================
		 * 90점 이상: 장학생 80점 이상: 우수상 80점 미만: 재시험
		 * ==================================
		 * 당신은 88점 이므로 평가는 우수상입니다
		 */
		
		/*
		Scanner sc=new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.print("당신의 점수는? ");
		score=sc.nextInt();
		
		
		if (score>=90)
			grade="장학생";
		else if (score>=80)
			grade="우수상";
		else
			grade="재시험";
		System.out.println("당신은 "+score+"점 이므로 평가는 "+grade+"입니다");
		*/
		
		Scanner sc=new Scanner(System.in);
		int score;
		String grade;
		
		System.out.print("당신의 점수는? ");
		score=sc.nextInt();
		
		grade=score>=90?"장학생":
				score>=80?"우수상":"재시험";
				
		System.out.println("당신은 "+score+"점 이므로 평가는 "+grade+"입니다");		
	
		
		
		}
		
		
		
	}


