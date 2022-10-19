package study;

//정렬
import java.util.Random;
class AutoLottoTest02 {	
	public static boolean isAlready(int arr[], int n, int last){
		boolean flag = false;
		for(int i=0; i<last; i++){
			if(arr[i] == n){
				flag = true;
				break;
			}
		}
		return flag;
	}		
	public static void main(String[] args) {
		Random r = new Random();
		int []arr = new int[6];
		for(int i=0; i<arr.length; ){				
			int n = r.nextInt(45) + 1;	
			if(!isAlready(arr, n, i)){											
				arr[i] = n;
				i++;
			}
		}

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
