package ex2005_ÆÄ½ºÄ®ÀÇ_»ï°¢Çü_D2;
import java.util.Scanner;

public class ex2005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int N = sc.nextInt();
			int [][] map = new int [N][N];
			map[0][0] = 1;
			
			for(int j=1; j<N; j++) {
				for(int k=0; k<=j; k++) {
					if(k==0) {
						map[j][k] = map[j-1][k];
					}
					else if(k==j) {
						map[j][k] = map[j-1][k-1];
					}
					else {
						map[j][k] = map[j-1][k-1] + map[j-1][k]; 
									
					}
				}
			}
			
			System.out.println("#" + (i+1));
			
			for(int j=0; j<N; j++) {
				for(int k=0; k<=j; k++) {
					if(map[j][k] == 0) {
						break;
					}
					System.out.print(map[j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
