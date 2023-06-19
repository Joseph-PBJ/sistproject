package day0619;

public class IfTest_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int n=10;
		
		if(n>=100) // 조건문이 있으면 조건에 해당하는 출력물은 1줄임!! {}로 출력문들을 묶어야 조건이 다 적용됨!
			System.out.println("n은 100보다 크거나 같다");
			System.out.println("프로그램 종료");
		//이렇게 하면 "프로그램 종료"가 출력되고 
			// {System.out.println("n은 100보다 크거나 같다");
			//  System.out.println("프로그램 종료");} 이렇게 묶으면 아무것도 출력되지 않음(조건이 두 출력물에 모두 영향)
			*/
		
		/* int i=9; //i가 짝수인지 홀수인지 구하기
		
		if (i/2==0)
			System.out.println(i+"는 짝수입니다");
		else 
			System.out.println(i+"는 홀수입니다");
			
		*/
		
		// if문을 이용해서 학점 구하기 90이상 A 80이상 B 70이상 C 60이상 D 60 미만 F
		
		/*
		int score=88;
		
		if (score>=90)
				System.out.println("당신의 학점은 A입니다");
		else if (score>=80)
				System.out.println("당신의 학점은 B입니다");
		else if (score>=70)
				System.out.println("당신의 학점은 C입니다");
		else if (score>=60)
				System.out.println("당신의 학점은 D입니다");
		else
				System.out.println("당신의 학점은 F입니다");
		*/
		
		
		/*
		int score=88;
		String grade; // char grade;로 할거면 밑에서 grade='A'
		
		if (score>=90)
			grade="A";
		else if (score>=80)
			grade="B";
		else if (score>=70)
			grade="C";
		else if (score>=60)
			grade="D";
		else
			grade="F";
		System.out.println("학점은 "+grade+"입니다");
		*/
		
		// 학점을 삼항연산자를 이용하여 구해보기
		
		
		int score=88;
		String grade;
		grade=score>=90?"A":
				score>=80?"B":
						score>=70?"C":
								score>=60?"D":"E";
		System.out.println("당신의 학점은 "+grade+"입니다");
		
		
		
		
		
		
	}

}
