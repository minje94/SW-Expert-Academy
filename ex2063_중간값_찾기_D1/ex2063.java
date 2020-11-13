package ex2063_중간값_찾기_D1;

import java.util.Arrays;
import java.util.Scanner;

public class ex2063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int numArr [] = new int [num];
		
		for(int i=0; i<num; i++) {
			numArr[i] = sc.nextInt();
		}
		Arrays.sort(numArr);
		
		System.out.println(numArr[num/2]);
	}
}
