package ex1545_거꾸로_출력해_보아요_D1;
import java.util.Scanner;

public class ex1545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num; i>=0; i--) {
			System.out.print(i + " "); 
		}
	}
}
