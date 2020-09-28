package ex8821_적고_지우기_D3;
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
					 //배열에 중복된 값이 있으면 그 배열위치의 Count를 증가
					 if(numArr[k] == temp) {
						 numCount[k]++;
						 numArr[j] = temp;
					 	 break;
				 	 }
					 //배열 끝까지 확인해도 같은 값이 없는 경우는 count를 새로 입력
					 else if(k == num.length()-1 && numArr[k] != temp){
						 numArr[j] = temp;
						 numCount[j]++;
						 break;
					 }
					 else
						 continue;
				 }
			}
			
			//numCount의 값이 홀수인 경우만 출력
			for(int j=0; j<num.length(); j++) {
				if(numCount[j] != 0 && numCount[j]%2 != 0) {
					count++;
				}
			}
			System.out.println("#" + (i+1) + " " + count);
		}
	}
}
