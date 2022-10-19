package study;


import java.util.Random;
class RandomStudent02
{
	public static void main(String[] args) 
	{
		String []arr = {"구승현","권현욱","김고운","김동민","김영빈",
						"문현빈","신윤경","유근형","이명진","이정화",
						"이종현","이호형","임수린","정선기","정성현",
						"조영민","최효주","함예이","황은선","황은솔"};
		
		for(int i=0; i<100; i++){
			System.out.print(arr[i % arr.length]);			
			try{
				Thread.sleep(50);
			}catch(Exception e){}
			System.out.print("\b\b\b");
			System.out.print("\r");

		}


		Random r = new Random();
		String name = arr[ r.nextInt(arr.length) ];
		System.out.println(name);
	}
}
