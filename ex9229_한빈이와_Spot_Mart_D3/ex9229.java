package ex9229_ÇÑºóÀÌ¿Í_Spot_Mart_D3;
import java.util.Scanner;

public class ex9229 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int snackNum = sc.nextInt();
			int [] snack = new int [snackNum];
			int [][] snackMap = new int [snackNum][snackNum];
			int maximumWeight = sc.nextInt();
			int num = -1;
			
			for(int j=0; j<snackNum; j++) {
				snack[j] = sc.nextInt();
			}
			
			for(int j=0; j<snackNum; j++) {
				for(int k=0; k<snackNum; k++) {
					if(j == k) {
						continue;
					}
					else {
						snackMap[j][k] = snack[j] + snack[k];
						if(maximumWeight >= snackMap[j][k] && num < snackMap[j][k]) {
							num = snackMap[j][k];
						}
					}
				}
			}
			System.out.println("#" + (i+1) + " " +num);
		}
	}
}
