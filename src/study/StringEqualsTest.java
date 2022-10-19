package study;


//사용자한테 암호와 암호확인을 입력받아 
//서로 동일한지 판별하는 pg를 작성
import java.util.Scanner;
class StringEqualsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pwd,chkpwd;
		System.out.print("암호를 입력하세요==>");
		pwd = sc.next();
		System.out.print("암호확인을 입력하세요==>");
		chkpwd = sc.next();
		if(pwd.equals(chkpwd)){
			System.out.println("암호와 암호확인 일치합니다.");
		}else{
			System.out.println("암호와 암호확인 일치하지 않습니다.");
		}
	}
}
