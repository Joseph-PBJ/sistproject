package day0619;

public class ReviewArgs_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 매개변수로 실행시 이름, 국영수, 3과목을 넘겨서 이름, 과목점수, 총점, 평균까지 출력하기
		// 변수선언
		String name=args[0];
		
		int kor=Integer.parseInt(args[1]);
		int eng=Integer.parseInt(args[2]);
		int mat=Integer.parseInt(args[3]);
		
		// 출력해서 계산해도 되지만 / 계산식 세우고 출력하는 것이 더 좋기는 함
		
		int tot=kor+eng+mat;
		double avg=tot/3.0; //평균은 보통 실수이기 때문에 int가 아닌 double로 
		
		// 출력
		System.out.println("*****중간고사 시험 점수******");
		System.out.println("학생명: "+name);
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+mat);
		System.out.println("========================");
		System.out.println("총점: "+tot);
		System.out.println("평균: "+avg);
		
	}

}
