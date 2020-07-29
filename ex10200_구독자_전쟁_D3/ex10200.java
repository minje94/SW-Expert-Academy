package ex10200_구독자_전쟁_D3;
import java.util.Scanner;

public class ex10200 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int sum = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int max = 0, min = Integer.MAX_VALUE;
			
			if(sum > A+B) {
				min = 0;
			}
			else {
				min = A + B - sum;
			}
			
			if(A > B) {
				max = B;
			}
			else {
				max = A;
			}
			
			System.out.println("#" + (i+1) + " " + max + " " + min);
		}
	}
}
