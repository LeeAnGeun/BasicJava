import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// 계산기
		Scanner sc = new Scanner(System.in);
		// 1.입력
		// 숫자1
		int num1;
		while(true) {
			String numStr1;             // 입력용
			System.out.print("num1 = ");
			numStr1 = sc.next();
	
			boolean b = true;
			for(int i=0; i<numStr1.length(); i++) {
				char ch= numStr1.charAt(i);                    // int asc = (int)numStr1.charAt(i) => 두줄을 한줄로 대체 할수 있다.
				int index = (int)ch-48;                        
				if(index<0 || index>9) {      // 숫자가 아닌 범위   // asc>47 || asc<57
					b= false;
					break;
				}
			}
			if(b==true) {   // 숫자를 정상적으로 입력했음
				num1 = Integer.parseInt(numStr1);       // 문자열을 숫자로 바꿔준다.
				break;      // while문을 빠져나온다.
			}
			System.out.println("숫자가 아닌 문자가 포함되어 있습니다.");
		}
		
		// 연산자(+ - * /)
		String op1;
		while(true) {
			String op;
			System.out.print("Operator = ");
			op = sc.next();
			
			if( op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
				op1 = op;
				break;
			}
			System.out.println("연산자를 입력해 주십시오.");
		}
		
		// 숫자2                       // 숫자2는 나누기를 할 경우 '0'이 입력되면 오류가 발생하므로 막아줘야한다.
		int num2;
		while(true) {
			String numStr2;
			System.out.print("num2 = ");
			numStr2 = sc.next();
			
			boolean b = true;
			for(int i=0; i< numStr2.length(); i++) {
				int asc = (int)numStr2.charAt(i);
				if(asc<47 || asc>57) {
					b=false;
					break;
				}
			}
			if(b==true) {
				num2 = Integer.parseInt(numStr2);        // 문자열을 숫자로 바꿔준다.
				break;
			}
			System.out.println("숫자를 아닌 문자가 포함되어 있습니다.");
		}
		
		/*
		// 2.출력
		System.out.println(num1 + "+" + num2 + "=" + (num1_1+num2_2)); // +
		System.out.println(num1 + "-" + num2 + "=" + (num1_1-num2_2)); // -
		System.out.println(num1 + "*" + num2 + "=" + (num1_1*num2_2)); // *
		System.out.println(num1 + "/" + num2 + "=" + (num1_1/num2_2)); // /
		System.out.println(num1 + "%" + num2 + "=" + (num1_1%num2_2)); // %
		*/
		
		switch(op1) {
		case "+": System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		       break;
		case "-":System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		       break;
		case "*":System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		       break;
		case "/":System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		       break;
		}
		
		// 문자열을 비교할 경우 equlas 문을 사용해야한다.
		if(op1.equals("+"))
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2)); // +
		else if(op1.equals("-"))
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2)); // -
		else if(op1.equals("*"))
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));// *
		else if(op1.equals("/"))
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));// /
		else
			System.out.println("연산자가 잘못됐다.");
	}

}
