package ex5601_�꽺_������_D3;
import java.util.Scanner;

public class ex5601 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int people = sc.nextInt();
			
			System.out.print("#" + (i+1));
			for(int j=0; j<people; j++) {
				System.out.print(" 1/" + people);
			}
			System.out.println("");
		}
	}
}
