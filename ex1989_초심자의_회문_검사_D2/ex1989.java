package ex1989_초심자의_회문_검사_D2;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class ex1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
	
		for(int i=0; i<testCase; i++) {
			Deque <String> deq = new ArrayDeque<String>();
			String word = sc.next();
			String [] wordArr = word.split("");
			
			for(int j=0; j<wordArr.length; j++) {
				deq.addLast(wordArr[j]);
			}
			
			
			while(true) {
				if(deq.size() > 1 && deq.peekFirst().equals(deq.peekLast())) {
					deq.pollFirst();
					deq.pollLast();
				}
				
				else if(deq.isEmpty() || deq.size() == 1) {
					System.out.println("#" + (i+1) + " 1");
					break;
				}
				else {
					System.out.println("#" + (i+1) + " 0");
					break;
				}
			}
		}
	}
}
