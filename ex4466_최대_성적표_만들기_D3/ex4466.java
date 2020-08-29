package ex4466_최대_성적표_만들기_D3;
import java.util.Scanner;

public class ex4466 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int testNum = sc.nextInt();
			int scoreNum = sc.nextInt();
			int [] scoreArr = new int [testNum];
			int sum = 0;
			
			for(int j=0; j<testNum; j++) {
				int num = sc.nextInt();
				scoreArr[j] = num;
			}
			
			for(int j=0; j<testNum; j++) {
				for(int k=j+1; k<testNum; k++) {
					if(scoreArr[k] > scoreArr[j]) {
						int temp = scoreArr[k];
						scoreArr[k] = scoreArr[j];
						scoreArr[j] = temp;
					}
				}
			}
			
			for(int j=0; j<scoreNum; j++) {
				sum = sum + scoreArr[j];
			}
			
			System.out.println("#" + (i+1) + " " + sum);
		}
	}
}
