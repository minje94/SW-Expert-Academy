package ex1215_회문1_D3;
import java.util.Scanner;

public class ex1215 {
	
	public static void main(String[] args0) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int length = sc.nextInt();
			
			String [][] map = new String[8][8];
	
			//map에 입력하는 부분
			for(int j=0; j<8; j++) {
				String [] inputString = sc.next().split("");
				for(int k=0; k<8; k++) {
					map[k][j] = inputString[k];
				}
			}
			
			int count=0;
			String palindrome="", sumWord="";
			
			//x축 비교
			for(int j=0; j<8; j++) {
				int startX = 0;
				
				while(startX+length<=8) {
					for(int k=startX; k<startX+length; k++) {
						sumWord = sumWord + map[k][j];
					}
					
					for(int k=startX+length-1; k>=startX; k--) {
						palindrome = palindrome + map[k][j];
					}	
					
					if(sumWord.equals(palindrome)) {	
					//	System.out.println("x: sumWord: " + sumWord + ", palindrome: " + palindrome);
						count++;
					}
					startX++;
					sumWord="";
					palindrome="";
				}
			}
			
			//y축 비교
			for(int j=0; j<8; j++) {
				int startY=0;
				
				while(startY+length<=8) {
					for(int k=startY; k<startY+length; k++) {
						sumWord = sumWord + map[j][k];
					}	
					for(int k=startY+length-1; k>=startY; k--) {
						palindrome = palindrome + map[j][k];
					}
					
					if(sumWord.equals(palindrome)) {
					//	System.out.println("y: sumWord: " + sumWord + ", palindrome: " + palindrome);
						count++;
					}
					startY++;
					sumWord="";
					palindrome="";
				}
			}
			
			System.out.println("#" + (i+1) + " " + count);
			//CAAACCAB
		}
	}
}
