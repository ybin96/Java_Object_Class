package study;


import java.util.Calendar;
class CalendarTest02 {
	public static void main(String[] args) {
		// Calendar를 이용하여 이번달의 1일의 요일을 출력해 봅니다.
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, 1);
		
		int day = c.get(Calendar.DAY_OF_WEEK) ;
		//일:1, 월:2 ....
		System.out.println(day);
		
	}
}
