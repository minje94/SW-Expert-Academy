package ex1228_8����_��ȣ��1_D3;

import java.util.Scanner;

public class ex1228 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int cryptogramLength = sc.nextInt(); //��ȣ�� ����
			int [] cryptogramArr = new int [cryptogramLength];
			int [] copyCryptogramArr = new int [cryptogramLength];
			
			//��ȣ�� �Է�
			for(int j=0; j<cryptogramLength; j++) {
				int cryptogram = sc.nextInt();
				cryptogramArr[j] = cryptogram;
			}
			
			//��ȣ�� ����
			int change = sc.nextInt();
			
			for(int j=0; j<change; j++) {
				String command = sc.next();
				
				if(command.equals("I")) {
					int startNum = sc.nextInt();
					int insertNum = sc.nextInt();
					
					for(int k=0; k<cryptogramLength; k++) {
						
						// �������� ��ȣ���� ���̿� ���ų� ũ�� �迭�� �ǵ����� �ʴ´�.
						if(startNum >= cryptogramArr.length){
							for(int l=0; l<insertNum ; l++) {
								int trash = sc.nextInt();
							}
							break;
						}
						
						//���� �迭�� k���� ���� ���� ������ �� �״�� ����
						if(k<startNum) {
							copyCryptogramArr[k] = cryptogramArr[k];
						}
						
						//�������� k�� ������ �����Ѵ�.
						else if(k==startNum){
							for(int l=startNum; l<startNum + insertNum; l++) {
								if(l < cryptogramArr.length) {
									copyCryptogramArr[l] = sc.nextInt();
								}
								//�迭�� ���̺��� �����ϴ� ���� ������� ������.
								else {
									int garbage = sc.nextInt();
								}
							}
						}
						
						//�� �����߾ �迭�� ���� ���� ���� ��ȣ���� ���� ���δ�.
						else if(startNum+insertNum < cryptogramArr.length) {
							
							for(int l=startNum+insertNum; l<cryptogramArr.length; l++) {
								copyCryptogramArr[l] = cryptogramArr[k-1];
								k++;
							}
							break;
						}
					}
					
					//������ ��ȣ���� ǥ�� ��ȣ������ ����
					for(int k=0; k<copyCryptogramArr.length; k++) {
						cryptogramArr[k] = copyCryptogramArr[k];
					}
				}
			}
			
			
			//ȭ�� ���
			System.out.print("#" + (i+1) + " ");
			for(int j=0; j<10; j++) {
				System.out.print(cryptogramArr[j] + " ");
			}
		}
	} 
}
