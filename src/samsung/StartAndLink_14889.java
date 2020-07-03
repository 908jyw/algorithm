package samsung;

import java.util.Scanner;



public class StartAndLink_14889 {

	static int N;
	static int [][]arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		arr = new int[N][N];
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		
		

	}

}
