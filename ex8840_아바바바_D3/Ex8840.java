package ex8840_아바바바_D3;
import java.util.*;
import java.io.*;

public class Ex8840 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			long length = Integer.parseInt(br.readLine());
			long count = ((length-1)/2) * ((length-1)/2);
			
			System.out.println(("#") + (i+1) + " " + count);
		}
	}
}
