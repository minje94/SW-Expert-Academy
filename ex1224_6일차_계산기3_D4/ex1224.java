package ex1224_6����_����3_D4;

import java.util.Scanner;
import java.util.Stack;

public class ex1224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int length = sc.nextInt();					//�Է¹޴� ������ ���� (��ǻ� �ʿ�x)
			String [] calculate = sc.next().split("");
			String postfix = "";
			Stack st = new Stack();
			
			//�Է¹��� ���� ���� ǥ������� �����ϴ� �κ�.
			for(int j=0; j<calculate.length; j++) {
				
				//���ÿ� �׿��ִ°� ���ٸ� �����ڸ� ���ÿ� �ִ´�.
				if(st.size() == 0 && (calculate[j].equals("+") || calculate[j].equals("(")) ||calculate[j].equals("*") ) {
					st.push(calculate[j]);
				}
				
				//��ȣ�� �켱 ������ ���� ����
				else if(calculate[j].equals("(")) { 
					st.push(calculate[j]);
				}
				
				else if(calculate[j].equals("+") && !(st.peek().equals("+") ||st.peek().equals("*"))) {
					st.push(calculate[j]);
				}
				
				//���� �����ڰ� +�� ���ÿ� +, *�� �ִ� ��� ���ÿ� +, * �����ڰ� ���� �� ���� pop �ϰ� ���� �����ڸ� push �Ѵ�. 
				else if(calculate[j].equals("+") && (st.peek().equals("+") ||st.peek().equals("*"))) {
					while(true) {
						if(st.size()==0 || st.peek().equals("("))
							break;
						
						postfix = postfix+(String)st.pop();
					}
					st.push(calculate[j]);
				}
				
				else if(calculate[j].equals("*") && !st.peek().equals("*")) {
					st.push(calculate[j]);
				}

				else if(calculate[j].equals("*") && st.peek().equals("*")) {
					while(true) {
						if((st.size()==0 || !st.peek().equals("*")))
							break;
						
						postfix = postfix+(String)st.pop();
					}
					st.push(calculate[j]);
				}

				//�ݴ� ��ȣ�� ������ ���ÿ� ���� ��ȣ�� ���� �� ������ pop�Ѵ�. 
				else if(calculate[j].equals(")")) {
					while(true) {
						if(st.peek().equals("(")){
							st.pop();
							break;
						}
						postfix = postfix+(String)st.pop();
					}
				}
				//�ǿ����ڴ� �׳� �Է�
				else
					postfix = postfix+calculate[j];
			}
			while(st.size() != 0) {
				postfix = postfix+(String)st.pop();
			}
			String [] postfixArr = postfix.split("");

			//����ϴ� �κ�.
			for(int j=0; j<postfixArr.length; j++) {
				
				if(postfixArr[j].equals("*")){
					int num1 = Integer.parseInt((String)st.pop());
					int num2 = Integer.parseInt((String)st.pop());
					
					st.push(toString(num1*num2));
					
				}
				else if( postfixArr[j].equals("+")){

					int num1 = Integer.parseInt((String)st.pop());
					int num2 = Integer.parseInt((String)st.pop());

					st.push(toString(num1+num2));
				}
				else {
					st.push(postfixArr[j]);
				}
			}
			System.out.println("#" + (i+1) + " " + st.pop());
		}
	}
	
	//int�� ������ String���� �����ϴ� �޼ҵ�
	private static String toString(int num) {
		return num + "";
	}
}
