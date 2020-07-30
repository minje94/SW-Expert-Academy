package ex1986_지그재그_숫자_D2;

import java.util .Scanner;

public class ex1986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int num = sc.nextInt();
			int sum = 0;
			
			for(int j=num; j>=1; j--) {
				if(j%2 == 0) {
					sum = sum + (-1 * j);
				}
				else {
					sum = sum + j;
				}
			}
			System.out.println("#" + (i+1) + " " + sum);
		}
	}
}
