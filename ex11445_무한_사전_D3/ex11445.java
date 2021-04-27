package ex11445_무한_사전_D3;

import java.util.Scanner;

public class ex11445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String p = sc.next();
			String q = sc.next();
			
			if((p+"a").compareTo(q)<0) {
				System.out.println("#" + (i+1) + " Y");
			}
			else {
				System.out.println("#" + (i+1) + " N");				
			}
		}
	}
}
