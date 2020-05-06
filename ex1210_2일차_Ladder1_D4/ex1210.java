package ex1210_2일차_Ladder1_D4;

import java.util.Scanner;

public class ex1210 {
	static int[][] map;
	static boolean[][] visited;
	static int[] ax = { -1, 1 };

	public static void searchStartPoint(int x, int y) {
		visited[x][y] = true;

		if (y == 0) {
			System.out.println(x);
		} else {
			for (int i = 0; i < 2; i++) {
				int nx = x + ax[i];
				int change = 0;

				if (nx < 100 && nx >= 0 && y < 100 && y > 0) {

					// x축으로 이동!
					if (visited[nx][y] == false && map[nx][y] == 1) {
						searchStartPoint(nx, y);
						change++;
						break;
					}

				}

				// y축으로 이동!
				if (i == 1 && change == 0) {
					searchStartPoint(x, y - 1);
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			int testCase = sc.nextInt();
			int startX = 0, startY = 0;
			map = new int[100][100];
			visited = new boolean[100][100];

			for (int j = 0; j < 100; j++) {
				for (int k = 0; k < 100; k++) {
					map[k][j] = sc.nextInt();
					visited[k][j] = false;

					if (map[k][j] == 2) {
						startX = k;
						startY = j;
					}
				}
			}
			System.out.print("#" + (i + 1) + " ");
			searchStartPoint(startX, startY);
		}
	}
}
