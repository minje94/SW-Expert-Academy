package ex1954_´ŞÆØÀÌ_¼ıÀÚ_D2;
import java.util.Scanner;	
public class ex1954 {
	
	public static void snail(int num) {
		int [][] snailArr = new int[num][num];
		int number = 1;
		int count = 0;
		int x=0, y=0;

		int i=0, j=0;
		
		while(number <= num*num) {
			if(count == 0) {
				while(i<num) {
					if(snailArr[i][j] != 0) {
						break;
					}
					else {
						snailArr[i++][j] = number++;
					}
				}
				count = 1;
				j++;
				i--;
			}			
			else if(count == 1) {
				while(j<num) {
					if(snailArr[i][j] != 0) {
						break;
					}
					else {

						snailArr[i][j++] = number++;
					}
				}
				i--;
				j--;
				count = 2;
			}
			else if(count == 2) {
				while(i>=0) {
					if(snailArr[i][j] != 0) {
						break;
					}
					else {
						snailArr[i--][j] = number++;
					}
				}
				j--;
				i++;
				count = 3;
			}
			else if(count == 3) {
				while(j>=0) {
					if(snailArr[i][j] != 0) {
						break;
					}
					else {
						snailArr[i][j--] = number++;
					}
				}
				i++;
				j++;
				count = 0;
			}
		}
		for(y=0; y<num; y++) {
			for(x=0; x<num; x++) {
				if(x==num-1) {

					System.out.print(snailArr[x][y]);
				}
				else {
					System.out.print(snailArr[x][y] + " ");
				}
			}
			System.out.println("");
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int num = sc.nextInt();
			System.out.println("#" + (i+1));
			snail(num);
		}
	}

}
