package ex2007_패턴_마디의_길이_D2;
import java.util.Scanner;

public class ex2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String pattern = sc.next();
			int length = 0;
			
			for(int j=1; j<=10; j++) {
				String pre = pattern.substring(0, j);
				String now = pattern.substring(j, j+j);
				
				if(pre.equals(now)) {
					System.out.println("#" + (i+1) + " " + pre.length());
					break;
				}
			}
			
		}
	}
}
