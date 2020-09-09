package ex7102_ÁØÈ«ÀÌÀÇ_Ä«µå³îÀÌ_D3;
import java.util.Scanner;

public class ex7102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int card1 = sc.nextInt();
			int card2 = sc.nextInt();
			int [] sumArr = new int [card1+card2+1];
			
			for(int j=0; j<sumArr.length; j++) {
				sumArr[j] = 0;
			}
			
			int max = 0;
	
			for(int j=1; j<=card1; j++) {
				for(int k=1; k<=card2; k++) {
					sumArr[j+k] = sumArr[j+k] +1;
					
					if(sumArr[j+k] > max) {
						max = sumArr[j+k];
					}
				}
			}
			System.out.print("#" + (i+1) + " ");
			for(int j=0; j<sumArr.length; j++) {
				if(sumArr[j] == max) {
					System.out.print(j + " ");
				}
			}
			System.out.println("");
		}
	}
}