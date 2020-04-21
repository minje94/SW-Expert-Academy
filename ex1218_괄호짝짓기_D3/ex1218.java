package ex1218_°ýÈ£Â¦Áþ±â_D3;
import java.util.Scanner;
import java.util.Stack;

public class ex1218 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int length = sc.nextInt();
			String [] bracket = sc.next().split("");
			
			Stack st = new Stack();
			
			for(int j=0; j<length; j++) {
				if(bracket[j].equals("(") || bracket[j].equals("{") 
						|| bracket[j].equals("[") || bracket[j].equals("<")) {
					st.add(bracket[j]);
				}
				else if(st.peek().equals("(") && bracket[j].equals(")")) {
					st.pop();
				}
				else if(st.peek().equals("{") && bracket[j].equals("}")) {
					st.pop();
				}
				else if(st.peek().equals("<") && bracket[j].equals(">")) {
					st.pop();
				}
				else if(st.peek().equals("[") && bracket[j].equals("]")) {
					st.pop();
				}
				else {
					System.out.println("#" + (i+1) + " 0");
					break;
				}
			}
			if(st.size() == 0) {
				System.out.println("#" + (i+1) + " 1");
			}
//			else if(st.size() != 0) {
//				System.out.println("#" + (i+1) + " 0");
//			}
		}
	}
}
