package ex9778_카드게임_D3;
import java.util.Scanner;

public class ex9778 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int [] cardArr = {4,4,4,4,4,4,4,4,16,4};
			
			int myNum = sc.nextInt();
			int sum = 0, stopCount=0, gazuaCount=0;
			
			for(int j=0; j<myNum; j++) {
				int num = sc.nextInt();
				sum = sum+num;
				
				cardArr[num-2]--;
			}
			
			for(int j=0; j<cardArr.length; j++) {
				if(sum + (j+2) <= 21) {
					gazuaCount = gazuaCount + cardArr[j];
				}
				else {
					stopCount = stopCount + cardArr[j];
				}
			}
			
			if(gazuaCount >= stopCount) {
				System.out.println("#" + (i+1) + " GAZUA");
			}
			else {
				System.out.println("#" + (i+1) + " STOP");
			}
		}
	}
}
