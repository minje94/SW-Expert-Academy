package ex2071_평균값_구하기_D1;

import java.util.*;

public class ex2071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int sum = 0;
			for(int j=0; j<10; j++) {
				sum = sum + sc.nextInt();
			}
			System.out.println("#" + (i+1) + " " + Math.round((double)sum/10));
		}
	}
}
