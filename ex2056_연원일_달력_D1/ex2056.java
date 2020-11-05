package ex2056_연원일_달력_D1;
import java.util.Scanner;

public class ex2056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String date = sc.next();
			String [] dateArr = date.split("");
			String answer = dateArr[0] + dateArr[1] + dateArr[2] + dateArr[3] + "/" +
							dateArr[4] + dateArr[5] + "/" + 
							dateArr[6] + dateArr[7];
			
			int month = Integer.parseInt(dateArr[4] + dateArr[5]);
			int day = Integer.parseInt(dateArr[6] + dateArr[7]);
			
			if(month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10 || month == 12  ) {
				if(day>31 || day<0) {
					answer = "-1";
				}
			}
			else if(month == 2) {
				if(day>28 || day<0) {
					answer = "-1";
				}
			}
			else if(month == 4 || month == 6 || month == 9 || month == 11) {
				if(day>30 || day<0) {
					answer = "-1";
				}
			}
			else {
				answer = "-1";
			}
			
			System.out.println("#" + (i+1) + " " + answer);
		}
	}
}
