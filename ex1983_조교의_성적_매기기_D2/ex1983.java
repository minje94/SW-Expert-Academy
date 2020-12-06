package ex1983_조교의_성적_매기기_D2;
import java.util.Arrays;
import java.util.Scanner;

public class ex1983 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int people = sc.nextInt();
			int num = sc.nextInt()-1;
			double scoreArr [] = new double[people];
			double copyArr [] = new double[people];
			
			for(int j=0; j<people; j++) {
				int middleTest = sc.nextInt();
				int finalTest = sc.nextInt();
				int homework = sc.nextInt();
				
				double sum = middleTest*0.35 + finalTest*0.45 + homework*0.20;
				
				scoreArr[j] = sum;
				copyArr[j] = sum;
			}
			
			Arrays.sort(copyArr);
			
			int index = 0;
			double checkNum = scoreArr[num];
			
			for(int j=0; j<copyArr.length; j++) {
				if(copyArr[j] == checkNum) {
					index = j;
					break;
				}
			}
			System.out.print("#" + (i+1) + " ");
			switch ((people-index-1)/(people/10)) {
				case 0:
					System.out.println("A+");
					break;
				case 1:
					System.out.println("A0");
					break;
				case 2:
					System.out.println("A-");
					break;
				case 3:
					System.out.println("B+");	
					break;
				case 4:
					System.out.println("B0");
					break;
				case 5:
					System.out.println("B-");
					break;
				case 6:
					System.out.println("C+");
					break;
				case 7:
					System.out.println("C0");	
					break;
				case 8:
					System.out.println("C-");
					break;
				case 9:
					System.out.println("D0");
					break;
			}
		}
	}
}
