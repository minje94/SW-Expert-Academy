package ex8457_알덴테스파게티_D3;
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

//n-모래시계의 갯수 , B- 면 삶는 시간 , E- 오차범위
// 모래시계 종류 
//출력 -> 구입해도 되는 모래시계의 개수

