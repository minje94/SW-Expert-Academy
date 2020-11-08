package ex2072_홀수만_더하기_D1;
import java.util.Scanner;

public class ex2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int sum = 0;
			
			for(int j=0; j<10; j++) {
				int num = sc.nextInt();
				
				if(num%2 != 0) {
					sum = sum + num;
				}
			}
			System.out.println("#" + (i+1) + " " + sum);
		}
	}
}
