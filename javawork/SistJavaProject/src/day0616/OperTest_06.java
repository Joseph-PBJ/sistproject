package day0616;

public class OperTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 증감연산자 ++,--
		
		int a,b;
		a=b=5;
		
		// 단항일 경우 연산자를 앞에 붙이나 뒤에 붙이나 똑같다
		++a; // =>원래 a값에서 1 증가하는 것
		b++; // b=b+1로 표현할 수도 있음
		
		System.out.println("a="+a+", b="+b);
		
		// 수식에서 사용할 경우 전치, 후치의 결과값이 틀림!
		
		int m,n;
		m=n=0;
		a=b=5; // 위에 ++ 연산자 사용했지만 다시 쓰면 초기화 되서 a,b 둘 다 5가 됨
		
		m=a++; // a를 증가시켜셔 m에다가 대입을 했음 => 결과 값이 5가 나옴
		       // 왜냐하면 후치의 경우 a를 먼저 m에 대입 후에, a는 1 증가 해서 6이 되는 것임!
		
		System.out.println("m="+m+", a="+a); // 이렇게 하면 m=5, a=6 이 됨
		
		n=++b;
		System.out.println("n="+n+", b="+b); // => n=6, b=6이 나옴
		// 왜냐하면 전치이기 때문에 b가 먼저 증가 하고 / 증가된 b가 n에 대입되기 때문에
		
		
		
		
	}

}
