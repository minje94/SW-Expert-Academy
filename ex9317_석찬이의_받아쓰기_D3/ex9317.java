package ex9317_석찬이의_받아쓰기_D3;
import java.util.Scanner;

public class ex9317 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int length = sc.nextInt();
			String [] wordArr = new String[length];
			String [] inputWord = new String[length];
			
			wordArr = sc.next().split("");
			inputWord = sc.next().split("");
			int count = 0;
			
			for(int j=0; j<length; j++) {
				if(wordArr[j].equals(inputWord[j])){
					count++;
				}
			}
			System.out.println("#" + (i+1) + " " + count);
		}
	}
}
