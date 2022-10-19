package study;


import java.util.GregorianCalendar;
import java.util.Calendar;
class ThisCalendarTest 
{
	public static void main(String[] args) 
	{
		String []arr = {"일","월","화","수","목","금","토"};
	
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		
		GregorianCalendar startDay = new GregorianCalendar(year, month , 1);
		int day = startDay.get(Calendar.DAY_OF_WEEK);
			

		System.out.println("***" + year + "년 " + (month+1) + "월 ***");

		for(int i=0; i<arr.length; i++){
			System.out.printf("%-4s", arr[i]);
		}
		System.out.println("\n-------------------------------------");
		
		//요일-1만큼 빈칸을 출력합니다.			
		for(int i=1; i<day; i++){				
			System.out.printf("%-5c",' ');
		}
		
		for(int i=1; i<=31;i++){
			System.out.printf("%-5d", i);
			if( (i+day-1) % 7 == 0){
				System.out.println();
			}
		}
	}
}
