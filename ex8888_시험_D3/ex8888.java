package ex8888_시험_D3;
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
			
			//문제 풀이 유무를 나타내는 quizMap
			for(int j=0; j<testMem; j++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				for(int k=0; k<quizNum; k++) {
					quizMap[j][k] = Integer.parseInt(st2.nextToken());
				}
			}
			//점수를 나타내는 scoreMap
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
			
			//점수를 나타내는 score배열 작성
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
			
			//등수를 나타내는 rank배열 작성
			for(int j=0; j<testMem; j++) {
				//내 점수보다 점수가 높은 사람 +
				if(score[j] > score[myNum]) {
						rank++;
				}
				
				//같은 점수지만 나보다 문제 많이 푼사람 +
				else if(score[j] == score[myNum]	&& quiz[j] > quiz[myNum]) {
					rank++;
				}
				//점수, 문제 수가 같지만 번호가 작은사람 + 
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