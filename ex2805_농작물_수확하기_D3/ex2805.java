package ex2805_농작물_수확하기_D3;

import java.util.Scanner;

public class ex2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int size = sc.nextInt();
			int sum = 0;
			
			if(size==1) {
				int onlyNum = sc.nextInt();
				System.out.println("#" + (i+1) + " "+ onlyNum);
			}
			
			else {
				for(int j=0; j<size; j++) {
					
					if(j<=size/2) {
						String num = sc.next();
						String [] numArr = num.split("");
						
						for(int k=0; k<=j; k++) {
							if(k==0) {
								sum = sum + Integer.parseInt(numArr[size/2]);
							}
							else{
								sum = sum + Integer.parseInt(numArr[size/2-k]);
								sum = sum + Integer.parseInt(numArr[size/2+k]);	
							}
						}
					}
					
					else {
						String num = sc.next();
						String [] numArr = num.split("");
						
						for(int k=size-j-1; k>=0; k--) {
							
							if(k==0) {
								sum = sum + Integer.parseInt(numArr[size/2]);
							}
							else{
								sum = sum + Integer.parseInt(numArr[size/2-k]);
								sum = sum + Integer.parseInt(numArr[size/2+k]);	
							}
						}
					}
				}
				System.out.println("#" + (i+1) + " "+ sum);
			}
		}
	}
}
