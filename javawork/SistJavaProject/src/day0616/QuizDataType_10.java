package day0616;

public class QuizDataType_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 매개변수(args)를 이용하여 출력해보기
		 * [시험결과]
		 * Java=88,Jsp=77,Spring=99
		 * 총점: 264점
		 * 평균: 88.00점
		 */
		
		int Java=Integer.parseInt(args[0]);
		int Jsp=Integer.parseInt(args[1]);
		int Spring=Integer.parseInt(args[2]);
		int total=Java+Jsp+Spring;
		
		double avg=total/3;
		
		System.out.println("[시험결과]");
		System.out.println("Java="+Java+","+"Jsp="+Jsp+","+"Spring="+Spring);
		System.out.println("총점: "+total+"점");
		System.out.printf("평균: %.2f",avg);
		
		//강사님 방법
		//int Java=Integer.parseInt(args[0]);
		//int Jsp=Integer.parseInt(args[1]);
		//int Spring=Integer.parseInt(args[2]);
		//int count=3; =>3과목을 의미하는 변수 / 줘도 되고 안줘도 됨
		//int tot=Java+Jsp+Spring;

		//double avg=tot/count;
				
		//System.out.printf("java=%d, jsp=%d, spring=%d\n",Java,Jsp,Spring);
		//System.out.println("총점: "+tot+"점");
		//System.out.printf("평균: %.2f",avg);
		//System.out.print("점");
		
	}

}
