package ex1928_Base64_Decoder_D2;
import java.util.*;

public class ex1928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
	
		for(int i=0; i<testCase; i++) {
			String text = sc.next();
			
			//decode
			byte[] binary = Base64.getDecoder().decode(text);
			System.out.println("#" + (i+1) + " " + new String(binary));
			
			//encode
			//String origin = Base64.getEncoder().encodeToString(binary);
			//System.out.println("encode: " + origin);
		}
	
	}
}
