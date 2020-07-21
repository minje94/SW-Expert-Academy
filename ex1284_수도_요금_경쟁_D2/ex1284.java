package ex1284_수도_요금_경쟁_D2;

import java.util.Scanner;

public class ex1284 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int aCost = sc.nextInt();
			int bBasicCost = sc.nextInt();
			int bBasicLiter = sc.nextInt();
			int bPlusCost = sc.nextInt();
			int useLiter = sc.nextInt();
			
			if(useLiter<bBasicLiter && aCost*useLiter < bBasicCost) {
				System.out.println("#" + (i+1) + " " + (aCost*useLiter));
			}
			else if (useLiter<bBasicLiter && aCost*useLiter > bBasicCost) {

				System.out.println("#" + (i+1) + " " + bBasicCost);
			}
			else if (useLiter>bBasicLiter && aCost*useLiter < bBasicCost + (useLiter - bBasicLiter)*bPlusCost) {
				System.out.println("#" + (i+1) + " " + (aCost*useLiter));
			}
			else if (useLiter>bBasicLiter && aCost*useLiter > bBasicCost + (useLiter - bBasicLiter)*bPlusCost) {
				System.out.println("#" + (i+1) + " " + (bBasicCost + (useLiter - bBasicLiter)*bPlusCost));
			}
		}
	}
}
