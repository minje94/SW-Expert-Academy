package ex8457_�˵��׽��İ�Ƽ_D3;
import java.util.Scanner;

public class ex8457 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int clockNum = sc.nextInt();
			int boilTime = sc.nextInt();
			int range = sc.nextInt();
			int count = 0;
			
			for(int j=0; j<clockNum; j++) {
				int clock = sc.nextInt();
				int changeClock = boilTime/clock;
				
				if((clock*(changeClock+1)) <= boilTime+range) {
					count++;
				}
				else if((clock*changeClock) >= boilTime-range) {
					count++;
				}
			}
			System.out.println("#" + (i+1) + " " + count);
		}
	}
}

//n-�𷡽ð��� ���� , B- �� ��� �ð� , E- ��������
// �𷡽ð� ���� 
//��� -> �����ص� �Ǵ� �𷡽ð��� ����

