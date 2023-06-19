package day0616;

public class ParseintArgs_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 변수명: sangName,su,dan,total
		 * -> 변수들이 다 매개변수임! 매개변수는 main에서 실행할 때 args 변수로 넘기는 문제
		 * 1.변수선언
		 * 2.계산
		 * 3.출력
		 * 
		 * [상품정보]
		 * 상품명: 갤럭시폴드
		 * 수량: 5개
		 * 단가: 800000원
		 * 총금액: 4000000원
		 */
		
		//sangName의 경우 원래 문자열이라 string num1=sangName으로 안해도 되는듯!
		//String sangName=args[0];
		//String num1=args[1];
		//String num2=args[2];
		
		//int su=Integer.parseInt(num1);
		//int dan=Integer.parseInt(num2);
		//int total=su*dan;
		
		//System.out.println("[상품정보]");
		//System.out.println("상품명: "+sangName);
		//System.out.println("수량: "+su+"개");
		//System.out.println("단가: "+dan+"원");
		//System.out.println("총금액: "+total+"원");
		
		//다른 방법
		//1. 변수 선언
		String sangName=args[0];
		int su=Integer.parseInt(args[1]);
		int dan=Integer.parseInt(args[2]);
		int total;
		
		//2. 계산
		total=su*dan;
				
		System.out.println("[상품정보]");
		System.out.println("상품명: "+sangName);
		System.out.println("수량: "+su+"개");
		System.out.println("단가: "+dan+"원");
		System.out.println("총금액: "+total+"원");
		
		
		
	}

}
