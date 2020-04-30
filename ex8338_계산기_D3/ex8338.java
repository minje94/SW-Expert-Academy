package ex8338_°è»ê±â_D3;
import java.util.Scanner;

public class ex8338 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int numCase = sc.nextInt();
			int firstNum = sc.nextInt();
			int sum = firstNum;
			
			for(int j=0; j<numCase-1; j++) {
				int num = sc.nextInt();
				
				if(sum*num > sum + num) {
					sum = sum * num;
				}
				else {
					sum = sum + num;
				}
			}
			System.out.println("#" + (i+1) + " " + sum);
		}
	}
}
