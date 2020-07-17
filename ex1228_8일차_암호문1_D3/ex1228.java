package ex1228_8일차_암호문1_D3;

import java.util.Scanner;

public class ex1228 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int cryptogramLength = sc.nextInt(); //암호문 길이
			int [] cryptogramArr = new int [cryptogramLength];
			int [] copyCryptogramArr = new int [cryptogramLength];
			
			//암호문 입력
			for(int j=0; j<cryptogramLength; j++) {
				int cryptogram = sc.nextInt();
				cryptogramArr[j] = cryptogram;
			}
			
			//암호문 변경
			int change = sc.nextInt();
			
			for(int j=0; j<change; j++) {
				String command = sc.next();
				
				if(command.equals("I")) {
					int startNum = sc.nextInt();
					int insertNum = sc.nextInt();
					
					for(int k=0; k<cryptogramLength; k++) {
						
						// 시작점이 암호문의 길이와 같거나 크면 배열을 건들이지 않는다.
						if(startNum >= cryptogramArr.length){
							for(int l=0; l<insertNum ; l++) {
								int trash = sc.nextInt();
							}
							break;
						}
						
						//삽입 배열이 k보다 작은 경우는 기존의 값 그대로 복사
						if(k<startNum) {
							copyCryptogramArr[k] = cryptogramArr[k];
						}
						
						//삽입점과 k가 같으면 삽입한다.
						else if(k==startNum){
							for(int l=startNum; l<startNum + insertNum; l++) {
								if(l < cryptogramArr.length) {
									copyCryptogramArr[l] = sc.nextInt();
								}
								//배열의 길이보다 삽입하는 수가 많은경우 버린다.
								else {
									int garbage = sc.nextInt();
								}
							}
						}
						
						//다 삽입했어도 배열이 남는 경우는 기존 암호문의 값을 붙인다.
						else if(startNum+insertNum < cryptogramArr.length) {
							
							for(int l=startNum+insertNum; l<cryptogramArr.length; l++) {
								copyCryptogramArr[l] = cryptogramArr[k-1];
								k++;
							}
							break;
						}
					}
					
					//변경한 암호문을 표준 암호문으로 변경
					for(int k=0; k<copyCryptogramArr.length; k++) {
						cryptogramArr[k] = copyCryptogramArr[k];
					}
				}
			}
			
			
			//화면 출력
			System.out.print("#" + (i+1) + " ");
			for(int j=0; j<10; j++) {
				System.out.print(cryptogramArr[j] + " ");
			}
		}
	} 
}
