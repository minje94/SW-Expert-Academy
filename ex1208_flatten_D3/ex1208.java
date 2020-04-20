package ex1208_flatten_D3;
import java.util.Arrays;
import java.util.Scanner;

public class ex1208 {
	public static void main(String[] args0) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int dump = sc.nextInt();
			int [] map = new int [100];
			int count = 0;
			
			for(int j=0; j<100; j++) {
				map[j] = sc.nextInt();
			}
			
			while(count < dump) {
				Arrays.sort(map);
				map[0] = map[0]+1;
				map[99] = map[99]-1;
				count++;
			}
			
			Arrays.sort(map);
			System.out.println("#" + (i+1) + " " + (map[99] - map[0]));
		}
	}
}
