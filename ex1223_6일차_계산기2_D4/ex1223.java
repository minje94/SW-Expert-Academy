package ex1223_6일차_계산기2_D4;
import java.util.Scanner;


public class ex1223 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int length = sc.nextInt();
			String operation = sc.next();
			String [] calculate = operation.split("\\+");
			
			int sum = 0;
			
			for(int j=0; j<calculate.length; j++) {
				if(calculate[j].length() != 1) {
					String [] subCalculate = calculate[j].split("\\*");
					int temp=1;
					
					for(int k=0; k<subCalculate.length; k++) {
						temp = Integer.parseInt(subCalculate[k]) * temp;
					}
					sum = sum + temp;
				}
				else {
					sum = sum + Integer.parseInt(calculate[j]);
				}
			}

			System.out.println("#" + (i+1) + " " + sum);
		}
	}
}
