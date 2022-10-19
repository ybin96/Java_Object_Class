package study;


class Rect{
	private double width;
	private double height;
	public  Rect(double width, double height){
		this.width = width;
		this.height = height;
	}

	public String toString(){
		return "[가로:"+width+",세로:"+height+"]";
	}

	public boolean equals(Rect r){
		boolean flag = false;
		if(width == r.width && height == r.height){
			flag = true;
		}
		return flag;
	}
}


class ToStringEqualsTest04 {
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 3;
		if(a == b){
			System.out.println("같아요");
		}else{
			System.out.println("달라요");
		}

		Rect r1 = new Rect(20,30);
		Rect r2 = new Rect(20,30);

		if(r1.equals(r2)){
			System.out.println("같아요");
		}else{
			System.out.println("달라요");
		}	
	}
}

/*
	출력문에 객체를 표현하여 
	자동으로 toString이 동작합니다.
	toString을 오버라이딩 하지 않으면
	기본적으로 클래스이름과 객체의 주소값이 반환됩니다.
*/