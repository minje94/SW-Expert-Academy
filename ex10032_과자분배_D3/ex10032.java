package ex10032_과자분배_D3;
import java.util.Scanner;

public class ex10032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int people = sc.nextInt();
			int cookies = sc.nextInt();
			
			if(people%cookies == 0) {
				System.out.println("#" + (i+1) + " " + 0);
			}
			else {
				System.out.println("#" + (i+1) + " " + 1);
			}
		}	
	}
}
