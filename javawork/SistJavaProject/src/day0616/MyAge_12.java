package day0616;

import java.util.Calendar;

public class MyAge_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 매개변수 args에서 실행시 이름과 태어난 연도를 보낸 후 출력하세요(name, myBirth)
		// 이름: 박병주
		// 태어난 연도: 1998년도
		// 나이: 26세
		
		//현재 년도는 Calendar import하여 구할 수 있음
		//1. import 할 것 있으면 먼저 하자
		//2. 변수 선언 할 것 있으면 먼저 하자
		//3. 계산할 것 있으면 먼저 하자
		//4. 최종 출력
		
		Calendar cal=Calendar.getInstance();
		
		String name=args[0];
		int myBirth=Integer.parseInt(args[1]);
		
		System.out.println("이름: "+name);
		System.out.println("태어난 연도: "+myBirth+"년도");
		System.out.println("나이: "+(cal.get(cal.YEAR)-myBirth+1)+"세");
		
		
		
		//강사님 방법
		
		//Calendar cal=Calendar.getInstance();
		
		//String name=args[0];
		//int myBirth=Integer.parseInt(args[1]);
		//int curYear=cal.get(cal.YEAR);
		
		//int myAge=curYear-myBirth;
		
		//System.out.println("이름: "+name);
		//System.out.println("태어난 연도: "+myBirth+"년도");
		//System.out.println("나이: "+myAge+"세");
				
		
		
		
	}

}
