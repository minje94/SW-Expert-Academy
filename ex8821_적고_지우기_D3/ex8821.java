package ex8821_����_�����_D3;
import java.util.Scanner;

public class ex8821 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String num = sc.next();
			int [] numArr = new int [num.length()];
			int [] numCount = new int [num.length()];
			int count = 0;
			
			for(int j=0; j<num.length(); j++) {
				numCount[j] = 0;
			}
			
			
			for(int j=0; j<num.length(); j++) {
				 int temp = num.charAt(j)-'0';
				 
				 for(int k=0; k<num.length(); k++) {
					 //�迭�� �ߺ��� ���� ������ �� �迭��ġ�� Count�� ����
					 if(numArr[k] == temp) {
						 numCount[k]++;
						 numArr[j] = temp;
					 	 break;
				 	 }
					 //�迭 ������ Ȯ���ص� ���� ���� ���� ���� count�� ���� �Է�
					 else if(k == num.length()-1 && numArr[k] != temp){
						 numArr[j] = temp;
						 numCount[j]++;
						 break;
					 }
					 else
						 continue;
				 }
			}
			
			//numCount�� ���� Ȧ���� ��츸 ���
			for(int j=0; j<num.length(); j++) {
				if(numCount[j] != 0 && numCount[j]%2 != 0) {
					count++;
				}
			}
			System.out.println("#" + (i+1) + " " + count);
		}
	}
}
