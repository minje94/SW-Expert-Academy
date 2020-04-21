package ex3347_올림픽종목투표_D4;
import java.util.Scanner;

public class ex3347 {
	public static void main(String[] args0) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int gameNum = sc.nextInt();
			int [] gameScore = new int [gameNum];
			int [] gamePoint = new int [gameNum];
			int judge = sc.nextInt();
			
			for(int j=0; j<gameNum; j++) {
				gameScore[j] = sc.nextInt();
			}
			
			for(int j=0; j<judge; j++) {
				int score = sc.nextInt();
				
				for(int k=0; k<gameNum; k++) {
					if(score>=gameScore[k]) {
						gamePoint[k]++;
						break;
					}
				}
			}
			
			int maximum = 0, index = 0;
			
			for(int j=0; j<gamePoint.length; j++) {
				if(gamePoint[j] > maximum) {
					maximum = gamePoint[j];
					index = j;
				}
			}
			System.out.println("#" + (i+1) + " " + (index+1));
		}
	}
}

/*
 package ex3347_올림픽종목투표;

import java.util.*;
import java.io.*;

public class ex3347 {
	public static void main(String[] args0) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int gameNum = Integer.parseInt(st1.nextToken());
			int [] gameScore = new int [gameNum];
			int [] gamePoint = new int [gameNum];
			int judge = Integer.parseInt(st1.nextToken());
			
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j=0; j<gameNum; j++) {
				gameScore[j] = Integer.parseInt(st2.nextToken());
			}
			
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			
			for(int j=0; j<judge; j++) {
				int score = Integer.parseInt(st3.nextToken());
				
				for(int k=0; k<gameNum; k++) {
					if(score>=gameScore[k]) {
						gamePoint[k]++;
						break;
					}
				}
			}
			
			int maximum = 0, index = 0;
			
			for(int j=0; j<gamePoint.length; j++) {
				if(gamePoint[j] > maximum) {
					maximum = gamePoint[j];
					index = j;
				}
			}
			System.out.println("#" + (i+1) + " " + (index+1));
		}
	}
}
 */