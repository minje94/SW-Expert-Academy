package ex9940_¼ø¿­1_D3;
import java.util.Arrays;
import java.util.Scanner;

public class ex9940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int length = sc.nextInt();
			int [] arr = new int [length];
			
			for(int j=0; j<length; j++) {
				arr[j] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for(int j=0; j<length;j++) {
				if(arr[j] != (j+1)) {
					System.out.println("#" + (i+1) + " " + "No");
					break;
				}
				else if(j == length-1) {
					System.out.println("#" + (i+1) + " " + "Yes");
				}
			}
		}
	}
}
