package ex10804_문자열의_거울상_D3;
import java.util.Scanner;
import java.util.Stack;

public class ex10804 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String word = sc.next();
			String wordArr [] = word.split("");
			word = "";
			Stack<String> st = new Stack<String>();
			
			for(int j=0; j<wordArr.length; j++) {
				if(wordArr[j].equals("b")) {
					st.push("d");
				}
				else if(wordArr[j].equals("d")) {
					st.push("b");
				}
				else if(wordArr[j].equals("p")) {
					st.push("q");
				}
				else {
					st.push("p");
				}
			}
			
			while(!st.isEmpty()) {
				word = word + st.pop();
			}
			System.out.println("#" + (i+1) + " " + word);
		}
	}
}
