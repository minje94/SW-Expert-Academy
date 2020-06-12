package ex1204_1일차_최빈수구하기_D2;
import java.util.Scanner;

public class ex1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		int [] testCaseArr = new int [testCase+1];
		
		for(int i=1; i<=testCase; i++) {
			int [] numArr = new int [101];
			int [] countArr = new int [101];
			int maxCount = 0, maxNum = 0, sum=0;
			int index =sc.nextInt();
			
			
			for(int j=0; j<=100; j++) {
				numArr[j] = j;			//numArr 배열에  num값 채우기
				countArr[j] = 0;		//count 0으로 초기화
			}
			
			for(int j=0; j<1000; j++) {
				int num = sc.nextInt(); //숫자입력받기
				
				// 같은 숫자 발견시
				if(num == numArr[num]) {
					countArr[num]++; 	//해당자리의 인덱스 count 증가
				}
			}
			
			for(int j=0; j<=100; j++) {
				if(maxCount < countArr[j]) {
					maxCount = countArr[j];
					maxNum = j;
					testCaseArr[index] = maxNum;
					}
				else if(maxCount == countArr[j] && maxNum < j) {
					maxNum = j;
					testCaseArr[index] = maxNum;
					}
			}
		}
		
		for(int i=1; i<=testCase; i++) {
			System.out.println("#" + i + " " + testCaseArr[i]);
		}
	}
}
