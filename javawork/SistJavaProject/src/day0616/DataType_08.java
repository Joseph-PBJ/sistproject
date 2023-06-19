package day0616;

public class DataType_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte a=127; // -128~127사이
		//byte b=128; // 이렇게 하면 오류남 왜냐하면 128이 더 크기 때문에
		byte b=(byte)128; // 더 작은 자료형으로의 변환 / 이렇게 하면 오류 안남 / 왼쪽, 오른쪽 열의 형을 맞춰준 것 
						  // 약간의 값손실-디모션 을 없애는 것
		System.out.println("a="+a);
		System.out.println("b="+b);
		//127다음은 -128
		
		
		int x=7;
		int y=4;
		
		System.out.println(x/y); // 1이 나옴 / 왜냐하면 정수형끼리의 계산이기 때문에 무조건 int(정수)타입
		
		// 실수 타입으로 결과물을 출력하려면? 
		System.out.println((double)x/y); // 즉 내가 출력하고자 하는 타입의 명을 수식 앞에다가 써주면 됌
		System.out.println(x/(double)y); // x앞, y앞 다 동일함! 한번만 입력해주면 됌
		
		//강제 형변환
		double d=100.0;
		int i=100;
		
		//int result=d+i; 오른쪽의 d+i를 왼쪽에 넣는 것인데, double>int이기 때문에 넣을 수 없음
		// double이 되기 때문에 오류가 남 
		
		int result=(int)d+i; // 이렇게 입력해야 함 / int를 우측에 줘야 함
		
		System.out.println("d="+d);
		System.out.println("i="+i);
		System.out.println("result="+result);
		
		double result2=(double)d+i; // 이것은 우측에 double을 주건 안주건 상관이 없음 / 작은 것이 큰 것에 포함되기 때문
		
		System.out.println("result2="+result2);
		
		
		
	}

}
