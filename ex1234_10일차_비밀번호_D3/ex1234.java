package ex1234_10일차_비밀번호_D3;
import java.util.Scanner;

//2019.12.08 D3

public class ex1234 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int length = sc.nextInt();
			String number = sc.next();
			String [] numArr = new String[length];
			int up=0, down=0;
			
			for(int j=0; j<length; j++) {
				numArr = number.split("");
			}
			
			for(int j=0; j<number.length(); j++) {
				if( j < number.length()-1 && numArr[j].equals(numArr[j+1])) {
					down = j;
					up = j+1;
					
					loop:
					while(true) {
						
						if(down < 0 || up > length) {
							break;
						}
						
						if(numArr[up].equals(numArr[down]) && numArr[up] != "-" && numArr[down]!="-") {
							numArr[up] = "-";
							numArr[down] = "-";
						
						}
						
						for(int k = down; k <up; k++) {
							if(numArr[k] != "-") {
								break loop;
							}
						}
						while(up<length-1) {
							if(numArr[up] !=  "-" ) {
								break;
							}
							up = up+1;
						}
						while(down>=0) {
							if(numArr[down] !=  "-") {
								break;
							}
							down = down-1;
						}
					}
				}	
			}
		
			System.out.print("#" + (i+1) + " ");
			for(int j=0; j<number.length(); j++) {
			
				if(numArr[j]!="-") {
					System.out.print(numArr[j]);
				}
			}
			System.out.println("");
			
		}
	}
}
