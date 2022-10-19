package study;


// GregorianCalendar를 이용하여 
// 오늘날짜와 시간을 출력해 봅니다.
// 그리고 올해가 윤년인지도 판별해 봅니다.
// 완성하면 "3"
import java.util.GregorianCalendar;
import java.util.Calendar;
class GregorianCalendarTest 
{
	public static void main(String[] args) 
	{
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		int hours = today.get(Calendar.HOUR);
		int minutes = today.get(Calendar.MINUTE);
		int seconds = today.get(Calendar.SECOND);
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초\n",
				year,month+1,date,hours,minutes, seconds);
		
		if(today.isLeapYear(year)){
			System.out.println(year+"년도는 윤년입니다.");
		}else{
			System.out.println(year+"년도는 윤년이 아닙니다.");	
		}

	}
}
