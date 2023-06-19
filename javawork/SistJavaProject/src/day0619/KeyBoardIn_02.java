package day0619;

import java.util.Scanner;

public class KeyBoardIn_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Scanner sc = new Scanner(System.in);
	    // int i = sc.nextInt();   => 스캐너는 이것만 기억하면 됨!
		
		// 스캐너는 문자열이나 숫자를 모두 키보드로 입력받으려 할때 생성하는 것
		
		Scanner sc=new Scanner(System.in); // 스캐너 입력하려면 반드시 써줘야 하는 문장
		
		// 변수
		String name; // 원래는 string name="홍길동" 등등 썼지만 스캐너 사용하면 안 써도 됨 or string name=null
		int age;
		String city;
		
		// 출력(출력은 출력인데 입력문임)
		
		System.out.print("이름을 입력해 보세요==>"); // printIn을 하면 입력값이 아래 칸에 입력됨
		name=sc.nextLine(); //nextline=> 라인을 내려주는 듯(엔터 역할) 
		// 위 문장은 한 줄을 문자로 읽어오는 것임(공백도 ok)
		
		System.out.print("나이를 입력해 보세요==>");
		// age=sc.nextInt(); // 형 변환 해줘야 함
		age=Integer.parseInt(sc.nextLine()); //요렇게 해야 int(정수)와 동시에 라인도 띄어줄 수 있음
		
		System.out.print("당신이 사는 지역은?==>");
		city=sc.nextLine();
		
		// 최종 출력
		
		System.out.println("내 이름은 "+name+"입니다");
		System.out.println("내 나이는 "+age+"세 입니다");
		System.out.println("내가 사는 지역은 "+city+"입니다");
		
		// 요렇게 하면 마지막 city 는 내가 입력하지도 않았는데 이상한 값으로 입력이 됨 > 버퍼 걸린 것
		// 숫자-숫자-숫자의 경우 버퍼가 생기지 않는데, 그 반대의 경우에는
		// 숫자입력 후 엔터를 누르면 그 엔터가 키보드 버퍼로 저장되어서
		// 다음 문자열을 읽을 때 먼저 읽어버리는 문제가 발생하는 것
		// 즉 다음 문자열을 읽기 전에 sc.(nextline)으로 띄어주는 것
		// 어떻게 해결할까?
		// name은 nextline으로 해서 line을 띄어줘서 age를 정상적으로 입력할 수 있었는데
		// age의 경우 nextint를 했기 때문에 다음 칸으로 띄우는 것이 불가능 해 버퍼 발생
		// 문자-문자-문자는 괜찮은데 문자-숫자-문자이기 때문에
		// 그럼 어떡해!
		// age를 라인을 띄어줘야 함 ==> 형변환 해줘야 함(integer.parseint(sc.nextline()))
		
		
		
	}

}
