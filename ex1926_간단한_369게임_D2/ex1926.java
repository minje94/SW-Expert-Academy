package ex1926_간단한_369게임_D2;
import java.util.Scanner;

public class ex1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		
		for(int i=1; i<=Integer.parseInt(number); i++) {
			String num = i + "";
			
			String [] numArr = num.split("");
			String result = "";
			
			for(int j=0; j<numArr.length; j++) {
				if(numArr[j].equals("3") || numArr[j].equals("6") 
						|| numArr[j].equals("9")) {
					result = result + "-";
				}
			}
			
			if(result.equals("")) {
				result = num;
			}
			
			System.out.print(result + " ");
		}
	}
}
