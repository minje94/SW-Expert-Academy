package ex8888_����_D3;
import java.io.*;
import java.util.*;

public class ex8888 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			int testMem = Integer.parseInt(st1.nextToken());
			int quizNum = Integer.parseInt(st1.nextToken());
			int myNum = Integer.parseInt(st1.nextToken())-1;
			int [][] quizMap = new int [testMem][quizNum];
			int [][] scoreMap = new int [testMem][quizNum];
			int [] score = new int [testMem];
			int [] quiz = new int [testMem];
			
			int rank = 0;
			
			//���� Ǯ�� ������ ��Ÿ���� quizMap
			for(int j=0; j<testMem; j++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				for(int k=0; k<quizNum; k++) {
					quizMap[j][k] = Integer.parseInt(st2.nextToken());
				}
			}
			//������ ��Ÿ���� scoreMap
			for(int j=0; j<quizNum; j++) {
				int count = 0;
				
				for(int k=0; k<testMem; k++) {
					if(quizMap[k][j] == 0) {
						scoreMap[k][j] = 0;
						count++;
					}
				}
				
				for(int k=0; k<testMem; k++) {
					if(quizMap[k][j] != 0) {
						scoreMap[k][j] = count;
					}
				}
			}
			
			//������ ��Ÿ���� score�迭 �ۼ�
			for(int j=0; j<testMem; j++) {
				int scoreSum = 0;
				int count = 0;
				
				for(int k=0; k<quizNum; k++) {
					scoreSum = scoreSum + scoreMap[j][k];
					
					if(scoreMap[j][k] != 0) {
						count++;
					}
				}
				score[j] = scoreSum;
				quiz[j] = count;
			}
			
			//����� ��Ÿ���� rank�迭 �ۼ�
			for(int j=0; j<testMem; j++) {
				//�� �������� ������ ���� ��� +
				if(score[j] > score[myNum]) {
						rank++;
				}
				
				//���� �������� ������ ���� ���� Ǭ��� +
				else if(score[j] == score[myNum]	&& quiz[j] > quiz[myNum]) {
					rank++;
				}
				//����, ���� ���� ������ ��ȣ�� ������� + 
				else if(score[j] == score[myNum]	&& quiz[j] == quiz[myNum]
						&& j < myNum) {
					rank++;
				}
			}
			System.out.println("#" + (i+1) + " " + score[myNum] + " " + (rank+1));
		}

		br.close();
	}
}