package ex1204_1����_�ֺ�����ϱ�_D2;
import java.util.Scanner;

public class ex1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		int [] testCaseArr = new int [testCase+1];
		
		for(int i=1; i<=testCase; i++) {
			int [] numArr = new int [101];
			int [] countArr = new int [101];
			int maxCount = 0, maxNum = 0, sum=0;
			int index =sc.nextInt();
			
			
			for(int j=0; j<=100; j++) {
				numArr[j] = j;			//numArr �迭��  num�� ä���
				countArr[j] = 0;		//count 0���� �ʱ�ȭ
			}
			
			for(int j=0; j<1000; j++) {
				int num = sc.nextInt(); //�����Է¹ޱ�
				
				// ���� ���� �߽߰�
				if(num == numArr[num]) {
					countArr[num]++; 	//�ش��ڸ��� �ε��� count ����
				}
			}
			
			for(int j=0; j<=100; j++) {
				if(maxCount < countArr[j]) {
					maxCount = countArr[j];
					maxNum = j;
					testCaseArr[index] = maxNum;
					}
				else if(maxCount == countArr[j] && maxNum < j) {
					maxNum = j;
					testCaseArr[index] = maxNum;
					}
			}
		}
		
		for(int i=1; i<=testCase; i++) {
			System.out.println("#" + i + " " + testCaseArr[i]);
		}
	}
}
