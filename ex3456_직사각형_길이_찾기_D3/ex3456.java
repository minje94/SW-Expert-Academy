package ex3456_직사각형_길이_찾기_D3;
import java.util.Scanner;

public class ex3456 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int length1 = sc.nextInt();
			int length2 = sc.nextInt();
			int length3 = sc.nextInt();
			
			if(length1 == length2) {
				System.out.println("#" + (i+1) + " " + length3);
			}
			else if(length1 == length3) {
				System.out.println("#" + (i+1) + " " + length2);
			}
			else if(length2 == length3) {
				System.out.println("#" + (i+1) + " " + length1);
			}
		}
	}
}
