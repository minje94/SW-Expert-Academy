package ex4751_�ټ�����_���̾Ƹ��_���_D3;
import java.util.Scanner;

public class ex4751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String test = sc.next();
			
			for(int j=0; j<5; j++) { //��
				
				if(j==0 || j==4) { //1,5��° ��
					int temp = 3;
					
					for(int k=1; k<=test.length()*4 + 1; k++) { 
						
						if( k == temp || k == temp + 4) {
							System.out.print("#");
							temp = k;
						}
						else
							System.out.print(".");
					}
					System.out.println();
				} 
				
				else if(j==1 || j==3) { //2,4��° ��
					
					for(int k=1; k<=test.length()*4 + 1; k++) { 
						if(k%2==1) {
							System.out.print(".");
						}
						else
							System.out.print("#");
					}
					System.out.println();
				}
				
				else { //3��° ��
					String subTest = test;
					int length = test.length();
					int temp = 3;
				
					for(int k=1; k<=length*4 + 1; k++) { 
						
						if(k == temp || k == temp + 4 ) {
							System.out.print(test.substring(0,1));
							test = test.substring(1,test.length());
							temp = k;
						}
						
						else if(k%2==1) {
							System.out.print("#");
						}
						else
							System.out.print(".");
					}
					System.out.println();
					test = subTest;
				}
			}
		}
	}
}
