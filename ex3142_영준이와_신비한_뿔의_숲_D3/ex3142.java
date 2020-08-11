package ex3142_영준이와_신비한_뿔의_숲_D3;

import java.util.Scanner;

public class ex3142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int horn = sc.nextInt();
			int animal = sc.nextInt();
			
			int unicorn = animal, twinHorn = 0;
			
			for(int j=0; j<=animal; j++) {
				if((unicorn-j) + (twinHorn+j)*2 == horn) {
					unicorn = unicorn-j;
					twinHorn = twinHorn + j;
				}
			}
			System.out.println("#" + (i+1) + " " + unicorn + " " + twinHorn);
		}
	}
}
