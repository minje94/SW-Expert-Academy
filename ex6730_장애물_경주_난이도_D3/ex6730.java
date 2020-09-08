package ex6730_장애물_경주_난이도_D3;

import java.util.Scanner;

public class ex6730 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int blocknum = sc.nextInt();
			int [] blockArr = new int [blocknum]; 
			int up = 0, down = 0;
			
			for(int j=0; j<blocknum; j++) {
				blockArr[j] = sc.nextInt();
				
				if(j>0) {
					if(blockArr[j] > blockArr[j-1] && up < blockArr[j] - blockArr[j-1]) {
						up = blockArr[j] - blockArr[j-1];
					}
					else if(blockArr[j] < blockArr[j-1] && down < blockArr[j-1] - blockArr[j]) {
						down = blockArr[j-1] - blockArr[j];
					}
				}
			}
			System.out.println("#" + (i+1) + " " + up + " " + down);
		}
	}
}

