package ex5431_민석이의_과제_체크하기_D3;
import java.util.Scanner;

public class ex5431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int student = sc.nextInt();
			int doHomework = sc.nextInt();
			int [] studentArr = new int [student];
		
			for(int j=0; j<studentArr.length; j++) {
				studentArr[j] = 0;
			}
			for(int j=0; j<doHomework; j++) {
				int studentNum = sc.nextInt();
				studentArr[studentNum-1] = 1;
			}
			System.out.print("#" + (i+1) + " ");
			for(int j=0; j<studentArr.length; j++) {
				if(studentArr[j] == 0) {
					System.out.print((j+1) + " ");
				}
			}
			System.out.println("");
		}
	}
}
