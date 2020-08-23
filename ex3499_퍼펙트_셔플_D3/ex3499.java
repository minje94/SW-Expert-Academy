package ex3499_∆€∆Â∆Æ_º≈«√_D3;
import java.util.Scanner;

public class ex3499 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int length = sc.nextInt();
			String [] numArr= new String [length];
			String [] firstArr = new String [length - length/2];
			String [] secondArr = new String [length/2];
			
			for(int j=0; j<length; j++) {
				if(j<length-length/2) {
					firstArr[j] = sc.next();
				}
				else {
					secondArr[j-(length-length/2)] = sc.next();
				}
			}
			int smallIndex = 0, bigIndex = 0 ;
			
			while(true) {
				if(length-length/2 == length/2) {
					numArr[bigIndex++] = firstArr[smallIndex];
					numArr[bigIndex++] = secondArr[smallIndex];
					smallIndex++;
					
					if(smallIndex == length/2) {
						break;
					}
				}
				else {
					numArr[bigIndex++] = firstArr[smallIndex];
					numArr[bigIndex++] = secondArr[smallIndex];
					smallIndex++;
					
					if(length-length/2-1 == smallIndex) {
						numArr[length-1] = firstArr[smallIndex];
						break;
					}	
				}
			}

			System.out.print("#" + (i+1) + " ");
			for(int j=0; j<length; j++) {
				System.out.print(numArr[j] + " ");
			}
			System.out.println("");
		}
	}
}
