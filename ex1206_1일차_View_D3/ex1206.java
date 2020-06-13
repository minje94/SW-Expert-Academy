package ex1206_1일차_View_D3;

import java.util.Arrays;
import java.util.Scanner;

public class ex1206 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) { 			   //테스트케이스 10개 입력
			int num = sc.nextInt();
			int count = 0;
			int [][] map = new int[num][255];  //배열 크기 조절
			 
			 for(int j=0; j<map.length; j++) {
				 int height = sc.nextInt();    //높이 입력
				 
				 for(int k=0; k<height; k++) { //높이 만큼 map에 1로 표현
					 map[j][k] = 1;
				 }
			 }
			 
			 for(int j=2; j<map.length-2; j++) {
				 for(int k=0; k<map[j].length; k++) {
					 if(map[j][k] == 1) {
						 if(map[j-2][k] == 0 && map[j-1][k] == 0 && map[j+1][k] == 0 && map[j+2][k] == 0) {
							 count++;
						 }
							 
					 }
				 }
			 }
			 System.out.println("#" + i + " " + count);
	    }
	}
}
