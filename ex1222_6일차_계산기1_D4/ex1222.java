package ex1222_6일차_계산기1_D4;

import java.util.Scanner;

public class ex1222 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<10; i++) {
			
			int length = sc.nextInt();
			String testCase = sc.next();
			String [] numArr = testCase.split("\\+");
			int sum = 0;
			
			for(int j=0; j<numArr.length; j++) {
				sum = sum + Integer.parseInt(numArr[j]);
			}
			System.out.println("#" + (i+1) + " " + sum);
		}
	}
}
