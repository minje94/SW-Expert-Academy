package ex1226_7일차_미로1_D4;

import java.util.Scanner;

public class ex1226 {
	
	static char [][] map = new char[16][16];
	static boolean [][] visit = new boolean [16][16];
	static int [] dx = {0, 1, 0, -1};
	static int [] dy = {1, 0, -1, 0};
	static int answer = 0;
	
	public static void bfs(int x, int y) {
		
		visit[y][x] = true;
		
		for(int i=0; i<4; i++) {
			int visitX = x + dx[i];
			int visitY = y + dy[i];
			
			
			if(x<0 || y<0 || x>15 || y>15)
				continue;
			
			if(map[visitY][visitX] == '0' && visit[visitY][visitX] == false) {

				bfs(visitX,visitY);
				
			}
			
			else if(map[visitY][visitX] == '1' || visit[visitY][visitX] == true){
				visit[visitY][visitX] = true;
			}
			
			else if(map[visitY][visitX] == '3') {
				answer = 1;
			}
		}

	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int testCase = sc.nextInt();
			int startX=0, startY=0;
			
			for(int j=0; j<16; j++) {
				String graph = sc.next();
				
				for(int k=0; k<16; k++) {
					map[j][k] = graph.charAt(k);
					visit[j][k] = false;
					
					
					if(map[j][k] == '2') {
						startX = j;
						startY = k;
					}
				}
			}
			answer = 0;
			bfs(startX,startY);
			System.out.println("#" + (i+1) + " " + answer);
		}
	}
}