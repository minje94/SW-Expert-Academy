package ex8931_Á¦·Î_D3;

import java.util.Scanner;
import java.util.Stack;

public class ex8931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {
			int num = sc.nextInt();
			int sum = 0;
			Stack st = new Stack();

			for (int j = 0; j < num; j++) {
				int putNum = sc.nextInt();
				if (putNum == 0) {
					st.pop();
				} else {
					st.push(putNum);
				}
			}

			if (st.size() == 0) {
				System.out.println("#" + (i + 1) + " 0");
			} else {
				while (st.size() > 0) {
					sum = sum + (int) st.pop();
				}
				System.out.println("#" + (i + 1) + " " + sum);
			}
		}
	}
}
