package ex2068_최대수_구하기_D1;
import java.util.Scanner;

public class ex2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int maxNum = 0;
			
			for(int j=0; j<10; j++) {
				int num = sc.nextInt();
				
				if(num > maxNum) {
					maxNum = num;
				}
			}
			System.out.println("#" + (i+1) + " " + maxNum);
		}
	}
}
