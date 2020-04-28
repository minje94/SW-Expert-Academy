package ex1860_������_�ְ��_�ؾ_D3;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1860 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int member = sc.nextInt();
			int makeTime = sc.nextInt();
			int makeBread = sc.nextInt();
			
			int sumBread = 0, sumTime = makeTime;
			int [] visitArr = new int [member];
			
			for(int j=0; j<member; j++) {
				visitArr[j] = sc.nextInt();
			}
			Arrays.sort(visitArr);
			
			String result = "Possible";
			int count = 0, index = 0;
													
			while(count <= visitArr[member-1]) {	 //�ؾ�� �Ĵ� �κ�
				if(count == sumTime) {
					sumBread = sumBread + makeBread; //�ؾ�� ��������
					sumTime = sumTime + makeTime; 	 //���� �ؾ ������ �ð�
				}
				
				if(count == visitArr[index]) {
					if(sumBread == 0) { 			//�ؾ�� ���� ���
						result = "Impossible";
						break;
					}
					else { 							//�ؾ�� �ִ� ���
						sumBread--;
					}
					index++;
				}
				count++;
			}
			System.out.println("#" + (i+1) + " " + result);
		}
	}

}
