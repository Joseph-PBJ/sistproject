package day0616;

public class PrintfTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printf로 출력하세요
		//안녕하세요 제 이름은 송혜교입니다
		//나이는 25세입니다
		// %d: 정수 / %f: 실수 / %s: 문자열
		
		//변수 주기
		String name="송혜교";
		int age=25;
		
		//출력
		System.out.printf("안녕하세요 제 이름은 %s입니다 \n나이는 %d세 입니다",name,age);
		
		//변수를 먼저 주고, 변수에 정수, 실수, 문자열인지 확인 후 printf 문구 작성, 뒤에 차례로 데이터 입력
		
		
	}

}
