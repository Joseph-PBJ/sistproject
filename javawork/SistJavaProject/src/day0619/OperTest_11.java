package day0619;

public class OperTest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 삼항(조건)연산자
		// 수식 ? "참": "거짓";
		
		int score=85;
		//char grade=(score>90)?'A':'F'; // 스코어가 90점 이상입니까? 맞으면 A 아니면 F 출력
		
		//System.out.println(score+"점은 "+grade+"등급입니다");
		
		char grade=(score>90)?'A':((score>80)?'B':'C'); // 이 문장이 없이 프린트아웃은 안된다고 생각하면 됨
		System.out.println(score+"점은 "+grade+"등급입니다");
		
	}

}
