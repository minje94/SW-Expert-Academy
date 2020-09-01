package ex5549_È¦¼öÀÏ±î_Â¦¼öÀÏ±î_D3;
import java.util.Scanner;

public class ex5549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String num = sc.next();
			String changeNum = num.substring(num.length()-1, num.length());
			
			if(Integer.parseInt(changeNum) % 2 == 0) {
				System.out.println("#" + (i+1) + " Even");
			}
			else {
				System.out.println("#" + (i+1) + " Odd");
			}
		}
	}
}
