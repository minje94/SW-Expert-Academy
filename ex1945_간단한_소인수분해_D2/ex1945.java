package ex1945_간단한_소인수분해_D2;

import java.util.Scanner;

public class ex1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
	
		
		//숫자 입력
		for(int i=0; i<testCase; i++) {
			int num = sc.nextInt();
			int [] numArr = new int [5];
			
			for(int j=0; j<5; j++) {
				numArr[j] = 0;
			}
			
			while(num != 0) {
				if(num%2 == 0) {
					numArr[0]++;
					num = num/2;
					continue;
				}
				else if(num%3 == 0) {
					numArr[1]++;
					num = num/3;
					continue;
				}
				else if(num%5 == 0) {
					numArr[2]++;
					num = num/5;
					continue;
				}
				else if(num%7 == 0) {
					numArr[3]++;
					num = num/7;
					continue;
				}
				else if(num%11 == 0) {
					numArr[4]++;
					num = num/11;
					continue;
				}
				
				if(num == 1) {
					break;
				}
			}
			
			System.out.print("#" + (i+1));
			for(int j=0; j<numArr.length; j++) {
				System.out.print(" " + numArr[j]);
			}
			System.out.println("");		
		}
	}
}
