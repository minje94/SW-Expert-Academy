package ex7087_제목문제붙이기_D3;
import java.util.Arrays;
import java.util.Scanner;

public class ex7087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int wordNum = sc.nextInt();
			String [] wordArr = new String [wordNum];
			
			for(int j=0; j<wordNum; j++) {
				wordArr[j] = sc.next();
			}
			Arrays.sort(wordArr);
			
			int checkNum = 17, index = 0, count = 0;
			
			while(true) {
				if(wordArr[index].charAt(0)-'0' == checkNum) {
					checkNum++;
					count++;
				}
				index++;
				if(index >= wordArr.length)
					break;
			}
			
			System.out.println("#" + (i+1) + " " + count);
		}
	}
}
