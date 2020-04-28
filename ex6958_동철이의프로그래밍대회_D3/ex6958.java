package ex6958_동철이의프로그래밍대회_D3;
import java.util.Scanner;

public class ex6958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int testNum = sc.nextInt();
			int quizNum = sc.nextInt();
			int [][] map = new int [testNum][quizNum];
			int [] score = new int [testNum];
			int maxCount = 0;
			
			for(int j=0; j<testNum; j++) {
				int count = 0;
				for(int k=0; k<quizNum; k++) {
					map[j][k] = sc.nextInt();
					if(map[j][k] != 0) {
						count++;
					}
					score[j] = count;
					if(maxCount < score[j]) {
						maxCount = score[j];
					}
				}
			}
			
			int count = 0;
			
			for(int j=0; j<testNum; j++) {
				if(score[j] == maxCount) {
					count++;
				}
			}
			
			System.out.println("#" + (i+1) + " " + count + " " + maxCount);	
			
		}
	}
}
