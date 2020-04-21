package ex1209_sum_D3;
import java.util.Scanner;

public class ex1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] map = new int [100][100]; //100으로 바꿔라
		
		for(int i=0; i<1; i++) { //10으로 바꿔라
			int testCase = sc.nextInt();
			int sum = 0, maxSum = 0;
			
			for(int j=0; j<100; j++) { //100으로 바꿔라
				
				//행을 합친 값 경우
				for(int k=0; k<100; k++) { //100으로 바꿔라
					int num = sc.nextInt();
					map[j][k] = num;
					sum = sum + num;
				}
				
				if(sum > maxSum) {
					maxSum = sum;
				}
				sum = 0;
			}
			
			for(int j=0; j<100; j++) { //100으로 바꿔라
				//열을 합친 값 경우
				for(int k=0; k<100; k++) { //100으로 바꿔라
					sum = sum + map[k][j];
				}

				if(sum > maxSum) {
					maxSum = sum;
				}
				sum = 0;
			}
			
			for(int j=0; j<100; j++) {
				//대각선을 합친 값 경우
				
				//0,0, 1,1, 2,2, 3,3, 4,4,
				for(int k=0; k<100; k++) {
					if(j==k) {
						sum = sum + map[j][k];
					}
				}
			}
			
			if(sum > maxSum) {
				maxSum = sum;
			}
			sum = 0;
			
			for(int j=0; j<100; j++) {
				
				//0,4, 1,3, 2,2, 3,1, 4,0,
				
				for(int k=99; k>0; k--) {
					if((j+k) == 99) {
						sum = sum + map[j][k];
					}
				}
			}
			
			if(sum > maxSum) {
				maxSum = sum;
			}
			sum = 0;

			System.out.println("#" + (i+1) + " " + maxSum);
		}
	}
}
