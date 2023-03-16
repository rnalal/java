package sec3;

import java.util.Calendar;

public class Example2 {
	public static void main(String[] args) {
	
		//weekday.java(enum/열거형)에서 요일 가져오기
		
		Weekday today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);	//달력에서 요일번호 가져오기(1~7)
		
		switch(week){
			case 1:
				today = Weekday.SUNDAY;
				break;
			case 2:
				today = Weekday.MONDAY;
				break;
			case 3:
				today = Weekday.TUESDAY;
				break;
			case 4:
				today = Weekday.WEDNESDAY;
				break;
			case 5:
				today = Weekday.THURSDAY;
				break;
			case 6:
				today = Weekday.FRIDAY;
				break;
			case 7:
				today = Weekday.SATURDAY;	//요일명: 열거형상수라고 함(무조건 다 대문자로 써야함)
				break;
		}
		
		if(today == Weekday.FRIDAY){
			System.out.println("오늘은 불타는 금요일~!");
		} else {
			System.out.println("그냥 공부나 열심히~!");
		}
	}

}
