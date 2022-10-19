package study;


import java.util.Random;
class RandomTest04 {
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(10) + 1;
		System.out.println(n);
	}
}
