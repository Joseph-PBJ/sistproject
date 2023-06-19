package day0616;

public class ParseintArgs_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* [결과출력]
		 * 내 이름은 박병주
		 * 자바 점수는 88
		 * 오라클 점수는 77
		 * 두 과목의 합계는 165점 입니다
		 */
		
		String name=args[0];
		String num1=args[1];
		String num2=args[2];
		//위 사항은 변수만 지정한 것이지 출력과는 전혀 상관 없음/ String이어서 88,77은 나오지만 덧셈은 안됨/ 형변환 고고
		
		int java=Integer.parseInt(num1);
		int oracle=Integer.parseInt(num2);
		
		System.out.println("[결과출력]");
		System.out.println("내 이름은 "+name);
		System.out.println("자바 점수는 "+java);
		System.out.println("오라클 점수는 "+oracle);
		System.out.println("두 과목의 합계는 "+(java+oracle)+"점 입니다");
		
		//String name=args[0];
		//int java=Integer.parseInt(args[1]);
		//int oracle=Integer.parseInt(args[2]);
		//위 사항은 변수만 지정한 것이지 출력과는 전혀 상관 없음/ String이어서 88,77은 나오지만 덧셈은 안됨/ 형변환 고고
				
		//int java=Integer.parseInt(args[1]);
		//int oracle=Integer.parseInt(args[2]);
			
		//System.out.println("[결과출력]");
		//System.out.println("내 이름은 "+name);
		//System.out.println("자바 점수는 "+java);
		//System.out.println("오라클 점수는 "+oracle);
		//System.out.println("두 과목의 합계는 "+(java+oracle)+"점 입니다");
		
		
		
	}

}
