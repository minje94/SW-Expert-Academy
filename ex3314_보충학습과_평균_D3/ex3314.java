package ex3314_보충학습과_평균_D3;

import java.util.Scanner;

public class ex3314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
		
			int sum = 0;
			
			for(int j=0; j<5; j++) {
				int score = sc.nextInt();
				
				if(score <40) {
					score = 40;
				}
				
				sum = sum + score;
			}
			System.out.println("#" + (i+1) + " " + sum/5);
		}
	}
}
