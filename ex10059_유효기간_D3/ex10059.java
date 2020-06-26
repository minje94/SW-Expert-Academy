package ex10059_유효기간_D3;
import java.util.Scanner;

public class ex10059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String date = sc.next();
			
			String [] dateArr = date.split("");
			
			int month = Integer.parseInt(dateArr[0])*10 + Integer.parseInt(dateArr[1]);
			int year =  Integer.parseInt(dateArr[2])*10 + Integer.parseInt(dateArr[3]);
			
			if((month>12 || month==0) && (year>12 || year==0)) {
				System.out.println("#" + (i+1) + " NA");
			}
			else if((month>12 || month==0) && year<=12 && year>0) {
				System.out.println("#" + (i+1) + " YYMM");
			}
			else if(month<=12 && month>0 && (year>12 || year==0)) {
				System.out.println("#" +(i+1) +  " MMYY");
			}
			else {
				System.out.println("#" + (i+1) + " AMBIGUOUS");
			}
			
			
		}
	}

}
