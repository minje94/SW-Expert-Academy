package ex4299_태혁이의_사랑은_타이밍_D3;
import java.util.Scanner;

public class ex4299 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int day = sc.nextInt();
			int hour = sc.nextInt();
			int minute = sc.nextInt();
			
			System.out.println("#" + (i+1) + " " + calculate(day, hour, minute));
		}
	}
	
	public static int calculate(int day, int hour, int minute) {
		int sum = 0;
		int d = 11, h = 11, m = 11;
		
		d = day-d;
		
		if(hour < h) {
			d = d-1;
			h = 24 + hour - h; 
		}
		else {
			h = hour - h;
		}
		
		if(hour < h) {
			h = h-1;
			m = 60 + minute - m; 
		}
		else {
			m = minute - m;
		}
		
		sum = d*24*60 + h*60 + m;
		
		if(sum<0) {
			sum = -1;
		}
		
		return sum;
	}
}
