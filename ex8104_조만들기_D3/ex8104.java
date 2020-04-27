package ex8104_조만들기_D3;
import java.util.Scanner;

public class ex8104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int memberNum = sc.nextInt();
			int groupNum = sc.nextInt();
			int num = 0;
			int [][] map = new int [memberNum][groupNum];
			
			for(int j=0; j<memberNum; j++) {
				if(j%2==0) {
					for(int k=0; k<groupNum; k++) {
						map[j][k] = ++num;
					}
				}
				else {
					for(int k=groupNum-1; k>=0; k--) {
						map[j][k] = ++num;
					}
				}
			}
			System.out.print("#" + (i+1) + " ");
			for(int j=0; j<groupNum; j++) {
				int sum = 0;
				for(int k=0; k<memberNum; k++) {
					sum = sum + map[k][j];
				}
				System.out.print(sum + " ");
			}
			System.out.println("");
		}
	}
}
