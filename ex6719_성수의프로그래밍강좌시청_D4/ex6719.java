package ex6719_성수의프로그래밍강좌시청_D4;
import java.util.Arrays;
import java.util.Scanner;

public class ex6719 {
	public static void main(String[] args0) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int studyNum = sc.nextInt();
			int sugang = sc.nextInt();
			int [] studyArr = new int [studyNum];
			
			for(int j =0; j<studyNum; j++) {
				studyArr[j] = sc.nextInt();
			}
			Arrays.sort(studyArr);
			
			float sum = 0;
			
			for(int j=studyNum-sugang; j<studyNum; j++) {
				sum = (studyArr[j] + sum) / 2;
			}
			System.out.printf("#%d %f", (i+1), sum);
			System.out.println("");
		}
	}
}
