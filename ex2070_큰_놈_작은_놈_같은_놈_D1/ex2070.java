package ex2070_ū_��_����_��_����_��_D1;
import java.util.Scanner;

public class ex2070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==B) {
				System.out.println("#" + (i+1) + " =");
			}
			else if(A<B) {
				System.out.println("#" + (i+1) + " <");
			}
			else {
				System.out.println("#" + (i+1) + " >");
			}
		}
	}
}
