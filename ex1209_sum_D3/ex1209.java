package ex1209_sum_D3;
import java.util.Scanner;

public class ex1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] map = new int [100][100]; //100���� �ٲ��
		
		for(int i=0; i<1; i++) { //10���� �ٲ��
			int testCase = sc.nextInt();
			int sum = 0, maxSum = 0;
			
			for(int j=0; j<100; j++) { //100���� �ٲ��
				
				//���� ��ģ �� ���
				for(int k=0; k<100; k++) { //100���� �ٲ��
					int num = sc.nextInt();
					map[j][k] = num;
					sum = sum + num;
				}
				
				if(sum > maxSum) {
					maxSum = sum;
				}
				sum = 0;
			}
			
			for(int j=0; j<100; j++) { //100���� �ٲ��
				//���� ��ģ �� ���
				for(int k=0; k<100; k++) { //100���� �ٲ��
					sum = sum + map[k][j];
				}

				if(sum > maxSum) {
					maxSum = sum;
				}
				sum = 0;
			}
			
			for(int j=0; j<100; j++) {
				//�밢���� ��ģ �� ���
				
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
