package ex1217_4ÀÏÂ÷_°ÅµìÁ¦°ö_D3;

import java.util.Scanner;

public class ex1217 {
	static int num = 0;
	static int count = 0;
	
	public static int recursive(int num) {
		if(count>1) {
			count--;
			return num * recursive(num);
		}
		else {
			return num;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] testArr = new int [10];
		for(int i=0; i<10; i++) {
			int testCase = sc.nextInt();
			num = sc.nextInt();
			count = sc.nextInt();
			
			testArr[testCase-1] = recursive(num);
		}
		for(int i=0; i<testArr.length; i++) {
			System.out.println("#" + (i+1)+ " " + testArr[i]);
		}
	}
}
