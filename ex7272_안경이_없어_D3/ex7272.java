package ex7272_안경이_없어_D3;
import java.util.Scanner;

public class ex7272 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String [] word1 = sc.next().split("");
			String [] word2 = sc.next().split("");
			
			if(word1.length != word2.length) {
				System.out.println("#" + (i+1) + " DIFF");
			}
			else {
				String word1Count = "", word2Count = "";
				
				for(int j=0; j<word1.length; j++) {
					switch(word1[j]) {
						case "A":
							word1Count = word1Count + 1;
							break;
						case "D":
							word1Count = word1Count + 1;
							break;
						case "O":
							word1Count = word1Count + 1;
							break;
						case "P":
							word1Count = word1Count + 1;
							break;
						case "Q":
							word1Count = word1Count + 1;
							break;
						case "R":
							word1Count = word1Count + 1;
							break;
						case "B":
							word1Count = word1Count + 2;
							break;
						default :
							word1Count = word1Count + 0;
							break;
					}
				}
				
				for(int j=0; j<word2.length; j++) {
					switch(word2[j]) {
						case "A":
							word2Count = word2Count + 1;
							break;
						case "D":
							word2Count = word2Count + 1;
							break;
						case "O":
							word2Count = word2Count + 1;
							break;
						case "P":
							word2Count = word2Count + 1;
							break;
						case "Q":
							word2Count = word2Count + 1;
							break;
						case "R":
							word2Count = word2Count + 1;
							break;
						case "B":
							word2Count = word2Count + 2;
							break;
						default :
							word2Count = word2Count + 0;
							break;
					}
				}
				
				if(word1Count.equals(word2Count)) {
					System.out.println("#" + (i+1) + " SAME " + word1Count + ", " + word2Count );
				}
				else {
					System.out.println("#" + (i+1) + " DIFF");
				}
			}
		}
	}
}
