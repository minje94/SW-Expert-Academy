package ex1859_백만장자_프로젝트_D2;
import java.util.Arrays;
import java.util.Scanner;

public class ex1859 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int day = sc.nextInt();
			int [] priceArr = new int[day];
			
			for(int j=0; j<day; j++) {
				priceArr[j] = sc.nextInt();
			}
			int maxPrice = priceArr[day-1];
			int count=0;
			long sum=0, buy=0;
			
			for(int j=priceArr.length-1; j>=0; j--) {
				
				if(maxPrice <= priceArr[j] ) {
					sum  = sum + (maxPrice * count);
					maxPrice = priceArr[j];
					count = 0;
				}
				else if(j == 0 ) {
					count++;
					sum = sum + (count * maxPrice);
					buy = buy + priceArr[j];
				}
				
				else{
					buy = buy + priceArr[j];
					count++;
				}
				
			}
			if(sum-buy < 0) {
				System.out.println("#" + (i+1) + " 0");
			}
			else {
				System.out.println("#" + (i+1) + " " + (sum-buy));
			}
		}
	}
}
