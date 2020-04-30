package ex7728_다양성_측정_D3;
import java.util.Scanner;

public class ex7728 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String num = sc.next();
			String [] numArr = num.split("");
			boolean [] numCompare = new boolean[10];
			int count = 0;
			
			for(int j=0; j<numCompare.length; j++) {
				numCompare[j] = false;
			}
			
			for(int j=0; j<numArr.length; j++) {
				numCompare[Integer.parseInt(numArr[j])] = true;
			}
			
			for(int j=0; j<numCompare.length; j++) {
				if(numCompare[j] == true) {
					count++;
				}
			}
			System.out.println("#" + (i+1) + " " + count);
		}
	}
}
