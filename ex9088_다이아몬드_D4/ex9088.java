package ex9088_다이아몬드_D4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex9088 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {
			int diaNum = sc.nextInt();
			int size = sc.nextInt();
			Integer[] diaArr = new Integer[diaNum];

			// 다이아 입력.
			for (int j = 0; j < diaNum; j++) {
				diaArr[j] = sc.nextInt();
			}
			Arrays.sort(diaArr, Collections.reverseOrder());

			int maxNum = 0;

			for (int j = 0; j < diaNum; j++) {
				int count = 1;

				for (int k = j + 1; k < diaNum; k++) {
					if (diaArr[j] - diaArr[k] <= size) {
						count++;
					}
				}

				if (count > maxNum) {
					maxNum = count;
				}
			}

			System.out.println("#" + (i + 1) + " " + maxNum);
		}
	}
}
