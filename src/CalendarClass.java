import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		/*
		   Calendar : 일정관리
		   			  회원관리
		   			  인사관리
		   Date : 연도, 월, 일, 시, 분, 초 
		 */
		
	//	Calendar cal = new GregorianCalendar();
		
		Calendar cal = Calendar.getInstance();
		// 오늘 날짜 취득
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1; // Calendar.MONTH의 범위는 0 ~ 11이다.
		int day =cal.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "달" + day + "일");
		
		// 날짜 설정(stter)
		cal.set(Calendar.YEAR, 2021) ;
		cal.set(Calendar.MONTH, 12 - 1); // Calendar.MONTH의 범위는 0 ~ 11이기 때문에 1월 달을 넣으려면 0값을 넣어야한다
		cal.set(Calendar.DATE, 31);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1 ;
		day =cal.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "달" + day + "일");
		
		// 오전/오후
		String ampm = cal.get(Calendar.AM_PM) == 0? "오전":"오후";
		System.out.println(ampm);
		
		// 요일
		int weekday =cal.get(Calendar.DAY_OF_WEEK); // Calendar.DAY_OF_WEEK 범위는 1(일요일) ~ 7(토요일)
		System.out.println(weekday);
		
		switch(weekday) {
			case 1:
				System.out.println("일요일");
				break;
			case 2:
				System.out.println("월요일");
				break;
			case 3:
				System.out.println("화요일");
				break;
			case 4:
				System.out.println("수요일");
				break;
			case 5:
				System.out.println("목요일");
				break;
			case 6:
				System.out.println("금요일");
				break;
			case 7:
				System.out.println("토요일");
				break;
		}
		
		cal.set(Calendar.YEAR, 2021) ;
		cal.set(Calendar.MONTH, 2 - 1); 
		cal.set(Calendar.DATE, 1);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1 ;
		day =cal.get(Calendar.DATE);
		
		
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("마지막 날: " + lastday );
		
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekday); // 2 월요일 출력
		
		// 달력의 위쪽 빈칸
		int upEmpty = (weekday-1) % 7; // 위쪽 빈칸 연산
		System.out.println(month + "월의 위의 빈칸은 "+ upEmpty + "입니다");
		
		// 달력의 아래쪽 빈칸
		lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DATE, lastday);
		
		weekday = cal.get(Calendar.DAY_OF_WEEK); // 마지막날의 요일
		
		int downEmpty = 7-weekday; // 밑의 빈칸수 연산
		System.out.println(month + "월의 밑의 빈칸수 : " + downEmpty);
		
		
		// 달력 만들기
		cal.set(Calendar.YEAR, 2021) ;
		cal.set(Calendar.MONTH, 11 - 1); // 11월
		cal.set(Calendar.DATE, 1);
		
		
		int startDay = cal.get(Calendar.DAY_OF_WEEK); // 11월 1일의 요일 ->월
		System.out.println("startDay = "+startDay);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 11월의 마지막 날의 요일
		int _day = 1;
		
		System.out.println("2021년 11월");
		System.out.println("========================================================");
		
		String week_day = "일월화수목금토";
		
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();
		
		// 달력의 위에쪽 빈칸
		for (int i = 1; i < startDay; i++) {
			System.out.print("*" + "\t");
		}
		
		// 날짜 
		for(int i=0; i<lastDay; i++) {
			System.out.print(_day + "\t");
			
			if((_day + startDay -1 ) %7 == 0) {
				System.out.println();
			}
			_day++;
		}
		
		// 밑쪽 빈칸
		for(int i =0; i<(7 - (startDay + lastDay-1) %7); i++) {
			System.out.print("*" + "\t");
		}
		
		System.out.println();
	}

}
