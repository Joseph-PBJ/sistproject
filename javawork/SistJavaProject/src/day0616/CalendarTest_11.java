package day0616;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Date date=new Date();
		
		//System.out.println("지금은 "+(date.getYear()+1900));
		//Date 지금은 안씀. / calendar 씀
		
		Calendar cal=Calendar.getInstance();
		// cal,c,calendar 다 가능! new calendar 로 안써도 됨. 수학 공식 같은 것에만 사용
		System.out.println("지금은 "+cal.get(cal.YEAR)+"년도 입니다");
		System.out.println("지금은 "+(cal.get(cal.MONTH)+1)+"월 입니다");
		// 월(month)은 무조건 1을 더해줘야 함!
		System.out.println("지금은 "+cal.get(cal.DATE)+"일 입니다");
		System.out.println("지금은 "+cal.get(cal.DAY_OF_MONTH)+"일 입니다");
		System.out.println("지금은 "+cal.get(cal.HOUR)+"시 입니다");
		System.out.println("지금은 "+cal.get(cal.MINUTE)+"분 입니다");
		System.out.println("지금은 "+cal.get(cal.SECOND)+"초 입니다");
		
		
	}

}
