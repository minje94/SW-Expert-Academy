package ex5162_µÎ°¡Áö_»§ÀÇ_µô·¹¸¶_D3;

import java.util.Scanner;

public class ex5162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int breadA = sc.nextInt();
			int breadB = sc.nextInt();
			int money = sc.nextInt();
			int min = money/breadA;
			
			if(breadA>breadB) {
				min = money/breadB;
			}
			
			System.out.println("#" + (i+1) + " " + min);
			
		}
	}
}
