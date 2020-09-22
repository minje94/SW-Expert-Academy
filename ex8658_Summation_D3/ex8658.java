package ex8658_Summation_D3;
import java.util.Scanner;

public class ex8658 {
	public static void main(String[] atgs) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); //입력받는것으로 수정 필요
		
		for(int i=0; i<testCase; i++) {
			int [] sumArr = new int [10];
			int max=0, min=63;
			
			for(int j=0; j<10; j++) {	//10개로 수정 필요
				int sum = 0;
				String num = sc.next();
				
				
				//배열하나의 값을 숫자로 바꾸는 작업
				for(int k=0; k<num.length(); k++) {
					String[] temp = num.split("");
					sum = sum + Integer.parseInt(temp[k]);
				}
				sumArr[j] = sum;
				
				if(sum > max) {
					max = sum;
				}
				if(sum < min) {
					min = sum;
				}
			}
			System.out.println("#" + (i+1) + " " + max + " " + min);
		}
	}
}
