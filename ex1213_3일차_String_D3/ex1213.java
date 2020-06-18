package ex1213_3ÀÏÂ÷_String_D3;
import java.util.Scanner;

public class ex1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			
			int testCase = sc.nextInt();
			String searchText = sc.next();
			String text = sc.next();
			String [] count = text.split(searchText);
			String recoveryText = "";
			System.out.println(count.length);
			
			for(int j=0; j<count.length; j++) {
				count[j] = count[j] + searchText;
			}

			for(int j=0; j<count.length; j++) {
				recoveryText = recoveryText + count[j];
			}
			
			if(recoveryText.equals(text)) {
				System.out.println("#"+ (i+1) + " " + (count.length));
			}
			else
			System.out.println("#"+ (i+1) + " " + (count.length-1));
			
		}
	}
}
