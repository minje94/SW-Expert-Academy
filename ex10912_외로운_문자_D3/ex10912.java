package ex10912_외로운_문자_D3;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ex10912 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String word = sc.next();
			String [] wordArr = word.split("");
			Deque<String> deq = new LinkedList<String>();
			
			for(int j=0; j<wordArr.length; j++) {
				if(deq.isEmpty()) {
					deq.addLast(wordArr[j]);
				}
				else {
					int count = 0;
					int size = deq.size();
					
					while(count < size) {
						if(deq.peekLast().equals(wordArr[j])) {
							deq.pollLast();
							break;
						}
						else {
							deq.addLast(deq.pollFirst());
							count++;
						}
					}
					
					if(size == count) {
						deq.addLast(wordArr[j]);
					}
				}
			}
			
			String answer = "";
			if(deq.isEmpty()) {
				answer = "Good";
			}
			else {
				String [] temp = new String[deq.size()];
				
				for(int j=0; j<temp.length; j++) {
					temp[j] = deq.pollLast();
				}
				
				Arrays.sort(temp);
				
				for(int j=0; j<temp.length; j++) {
					answer = answer + temp[j];
				}
			}
			System.out.println("#" + (i+1) + " " + answer);
		}
	}
}
