package ex2058_ÀÚ¸´¼ö_´õÇÏ±â_D1;
import java.util.Scanner;

public class ex2058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println(sum);
	}
}
