package ex8741_두문자어_D3;
import java.util.Scanner;

public class ex8741 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String word1 = sc.next();
			String word2 = sc.next();
			String word3 = sc.next();
			
			System.out.println("#" + (i+1) + " " + word1.substring(0,1).toUpperCase() + word2.substring(0,1).toUpperCase() + word3.substring(0,1).toUpperCase());
		}
	}
}
