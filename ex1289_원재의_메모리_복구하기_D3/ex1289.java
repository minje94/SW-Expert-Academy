package ex1289_원재의_메모리_복구하기_D3;

import java.util.Scanner;

public class ex1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		String [] basicArr;
		String [] memoryArr = new String [50];
		
		for(int i=0; i<testCase; i++) {
			String memory = sc.next();
			memoryArr = memory.split("");
			basicArr = new String [memoryArr.length];
			int count = 0;
			
			for(int j=0; j<memoryArr.length; j++) {
				basicArr[j] = "0";
			}
			
			for(int j=0; j<memoryArr.length; j++) {
				if(!basicArr[j].equals(memoryArr[j])) {
					count++;
					String num = memoryArr[j];
					
					for(int k=j; k<memory.length(); k++) {
						basicArr[k] = num; 
					}
				}
			}
			System.out.println("#" + (i+1) + " " + count);
			
		}
	}
}
