package ex9700_USB_�ȱ���_�̽��͸�_D3;
import java.util.Scanner;

public class Ex9700 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			double p = sc.nextDouble();
			double q = sc.nextDouble();
			double s1 = 0.0, s2 = 0.0;
			
			s1 = (1-p)*q; 	//1�� ������ ���
			s2 = p*(1-q)*q; //2�� ������ ���
			
			if(s1 <s2) {
				System.out.println("#" + (i+1) + " YES");
			}
			else {
				System.out.println("#" + (i+1) + " NO");
			}
		}
	}

}
