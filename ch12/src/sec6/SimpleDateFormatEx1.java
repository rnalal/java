package sec6;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 표시형식 코드
 y : 연도
 M : 월
 d : 일 - 현재 달에서 몇 번째 날인지
 D : 일 - 현재 년도에서 몇 번째 날인지
 h : 시 - 오전/오후 구분
 H : 시 - 24시간제로 표시(0~23)
 k : 시 - 오전/오후 구분
 K : 시 - 24시간제로 표시(1~24)
 m : 분
 s : 초
 S : 밀리초
 Z : 해당 타임존(Locale)형식으로 Long 타입으로 표시(지역+시간)
 Z : 해당 타임존(Locale)형식으로 Short 타입으로 표시(시간만!)
 F : 이번 달 이번 주 몇 번째 날인지 표시
 E : 요일 표시
 w : 현재 년도에서 몇 번째 주인지
 W : 현재 달에서 몇 번째 주인지
 */
public class SimpleDateFormatEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		SimpleDateFormat sf4 = new SimpleDateFormat("오늘은 E요일 입니다.");
		SimpleDateFormat sf5 = new SimpleDateFormat("요늘은 올해의 D번째 날입니다.");
		SimpleDateFormat sf6 = new SimpleDateFormat("오늘은 이달의 d번째 날입니다.");
		
		String d1 = sf1.format(now);
		String d2 = sf2.format(now);
		String d3 = sf3.format(now);
		String d4 = sf4.format(now);
		String d5 = sf5.format(now);
		String d6 = sf6.format(now);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
	}
}








