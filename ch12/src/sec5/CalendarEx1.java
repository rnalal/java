package sec5;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year1 = cal.get(Calendar.YEAR);				//년도 숫자 = cal.YEAR
		int month1 = cal.get(Calendar.MONTH);				//0~11 = cal.MONTH
		int day1 = cal.get(Calendar.DAY_OF_MONTH);		//요일번호(1~7) = cal.DAY_OF_MONTH
		int day2 = cal.get(Calendar.DATE);				//요일번호(1~7) = cal.DATE
		
		int hour1 = cal.get(Calendar.HOUR);				//시(0~23)
		int hour2 = cal.get(Calendar.HOUR_OF_DAY);		//시(1~24)
		int minute = cal.get(Calendar.MINUTE);			//분
		int second = cal.get(Calendar.SECOND);			//초
		
		int w = cal.get(Calendar.DAY_OF_WEEK);			//요일번호
		
		System.out.println(year1);	//년도		
		System.out.println(month1);	//월(0~11)
		System.out.println(day1);	//일
		System.out.println(day2);	//일	
		System.out.println(hour1);	//시
		System.out.println(hour2);	//시
		System.out.println(minute);
		System.out.println(second);
		
		String week = "";
		switch(w){
			case Calendar.MONDAY:	week = "월"; break;
			case Calendar.TUESDAY:	week = "화"; break;
			case Calendar.WEDNESDAY:	week = "수"; break;
			case Calendar.THURSDAY:	week = "목"; break;
			case Calendar.FRIDAY:	week = "금"; break;
			case Calendar.SATURDAY:	week = "토"; break;
			case Calendar.SUNDAY:	week = "일"; break;		
		}
		System.out.println("요일:"+week+"요일");
		
		if(hour1>=12){
			System.out.println("오후"+(hour1 - 12)+"시");
		} else {
			System.out.println("오전"+hour1+"시");
		}
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm == Calendar.AM){ System.out.println("오전"); }
		else { System.out.println("오후"); }		
	}
}












