import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		// 입력
		//Scanner scan = new Scanner(System.in);
		
		// console 입력
		// boolean true/false
		boolean b;
		System.out.print("b = ");
		b = scan.nextBoolean();
		System.out.println(b);
		
		// interger 정수
		int number;
		System.out.print("number = ");
		number = scan.nextInt();
		System.out.println(number);
		
		// double 실수
		double d;
		System.out.print("d = ");
		d = scan.nextDouble();
		System.out.println(d);
		
		// String 문자열
		String str;
		System.out.print("str = ");
		str = scan.next();
		System.out.println(str);
		
	
		// java 문자열 입력
		
		// 또 다른 문자열 입력 하는 방법
		// BufferedReader 문자열 입력 방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		String str1;
		
		System.out.println("BufferedReader test"); 
		System.out.print("str = ");
		str1 = br.readLine(); // 띄어쓰기를 인정
		System.out.println(str1);
		
    
	}

}
