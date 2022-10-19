package study;


class SortTest 
{
	public static void main(String[] args) 
	{
		int []data = {10, 9, 3, 2, 6};

		//정렬 : 순서대로 배치하는 것
		//오름차순 정렬	: 값이 작은것 부터 먼저 오는 것	**
		//내림차순 정렬	: 값이 큰것 부터 먼저 오는 것

		// 2 3 6 9 10
		// [10][9][3][2][6]
		//   0  1  2  3  4

		// [2][3][6][9][10]
		//  0  1   2  3  4

		for(int i=0; i<data.length ; i++){
			for(int j = i+1; j< data.length; j++){
				if(data[j] < data[i]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

		for(int i=0; i<data.length; i++){
			System.out.print(data[i] + " ");
		}
	}
}
