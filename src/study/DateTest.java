package study;


// 이번달 1일의 요일을 출력해 봅시다.
// 완성하면 "3"
import java.util.Date;
class DateTest02 {
	public static void main(String[] args) {
		Date today = new Date();
		int year = today.getYear();
		int month = today.getMonth();

		Date startDay = new Date(year, month , 1);
		int day = startDay.getDay();
		String []arr = {"일","월","화","수","목","금","토"};
		System.out.println(arr[day]);
	}
}
