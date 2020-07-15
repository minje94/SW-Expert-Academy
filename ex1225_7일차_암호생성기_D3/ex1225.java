package ex1225_7일차_암호생성기_D3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ex1225 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 for(int i=0; i<10; i++) {
			 int testCase = sc.nextInt();
			 Deque <Integer> deq = new LinkedList<>();
			 
			 for(int j=0; j<8; j++) {
				 deq.addLast(sc.nextInt());
			 }
			 
			 int count = 1;
			 while(true) {
				 int num = deq.removeFirst() - count++;
				 if(num <= 0) {
					 deq.addLast(0);
					 break;
				 }
				 if(count == 6) {
					 count = 1;
				 }
				 deq.addLast(num);
			 }
			 System.out.print("#" + (testCase) + " ");
			 for(int j=0; j<8; j++) {
				 System.out.print(deq.removeFirst() + " ");
			 }
			 System.out.println("");
		 }
	}
}
