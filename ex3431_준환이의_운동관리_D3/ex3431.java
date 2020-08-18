package ex3431_준환이의_운동관리_D3;

import java.util.Scanner;

public class ex3431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int minimum = sc.nextInt();
			int maximum = sc.nextInt();
			int now = sc.nextInt();
			
			if(minimum > now) {
				System.out.println("#" + (i+1) + " " + (minimum-now));
			}
			else if(minimum < now && maximum > now) {
				System.out.println("#" + (i+1) + " 0");
			}
			else if(minimum < now && maximum < now) {
				System.out.println("#" + (i+1) + " -1");
			}
		}
	}
}
