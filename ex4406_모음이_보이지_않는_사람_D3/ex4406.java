package ex4406_모음이_보이지_않는_사람_D3;
import java.util.Scanner;

public class ex4406 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String word = sc.next();
			System.out.print("#" + (i+1) + " ");
			for(int j=0; j<word.length(); j++) {
				char str = word.charAt(j);
				if(str=='a' || str=='e' || str=='i' || str=='o' || str=='u') {
					continue;
				}
				else
					System.out.print(str);
			}
			System.out.println("");
		}
	}
}
