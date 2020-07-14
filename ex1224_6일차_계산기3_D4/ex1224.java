package ex1224_6일차_계산기3_D4;

import java.util.Scanner;
import java.util.Stack;

public class ex1224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int length = sc.nextInt();					//입력받는 숫자의 길이 (사실상 필요x)
			String [] calculate = sc.next().split("");
			String postfix = "";
			Stack st = new Stack();
			
			//입력받은 식을 후위 표기식으로 변경하는 부분.
			for(int j=0; j<calculate.length; j++) {
				
				//스택에 쌓여있는게 없다면 연산자를 스택에 넣는다.
				if(st.size() == 0 && (calculate[j].equals("+") || calculate[j].equals("(")) ||calculate[j].equals("*") ) {
					st.push(calculate[j]);
				}
				
				//괄호는 우선 순위가 제일 낮다
				else if(calculate[j].equals("(")) { 
					st.push(calculate[j]);
				}
				
				else if(calculate[j].equals("+") && !(st.peek().equals("+") ||st.peek().equals("*"))) {
					st.push(calculate[j]);
				}
				
				//현재 연산자가 +고 스택에 +, *가 있는 경우 스택에 +, * 연산자가 없을 때 까지 pop 하고 현재 연산자를 push 한다. 
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

				//닫는 괄호가 나오면 스택에 여는 괄호가 나올 때 스택을 pop한다. 
				else if(calculate[j].equals(")")) {
					while(true) {
						if(st.peek().equals("(")){
							st.pop();
							break;
						}
						postfix = postfix+(String)st.pop();
					}
				}
				//피연산자는 그냥 입력
				else
					postfix = postfix+calculate[j];
			}
			while(st.size() != 0) {
				postfix = postfix+(String)st.pop();
			}
			String [] postfixArr = postfix.split("");

			//계산하는 부분.
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
	
	//int형 변수를 String으로 변경하는 메소드
	private static String toString(int num) {
		return num + "";
	}
}
