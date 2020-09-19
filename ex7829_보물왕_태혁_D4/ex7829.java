package ex7829_보물왕_태혁_D4;
import java.util.Scanner;

public class ex7829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase= sc.nextInt();
		
		//약수의 수를 입력받는 부분
		for(int i=0; i<testCase; i++) {
			int number = sc.nextInt();
			int [] arr = new int [number];
			
			//약수의 수만큼 약수를 입력받는 부분
			for(int j=0; j<number; j++) {
				int factor = sc.nextInt();
				
				if(number == 1) {
					System.out.println("#" + ((i+1) + " " + (factor*factor)));
					break;
				}
				arr[j] = factor;
			}
			
			//입력한 수 배열에 정렬
			for(int j=0; j<number; j++) {
				for(int k=j+1; k<number; k++) {
					if(arr[k] < arr[j]) {
						int temp = arr[k];
						arr[k] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			if(number%2 == 0) {
				System.out.println("#" + (i+1) + " " + arr[arr.length/2] * arr[arr.length/2 - 1]);
			}
			else if(number%2 != 0 && number != 1)
				System.out.println("#" + (i+1) + " " + arr[arr.length/2] * arr[arr.length/2]);
		}
	}
}