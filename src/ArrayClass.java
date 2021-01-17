
public class ArrayClass {

	public static void main(String[] args) {
		
		/*
		   Array(배열): 같은 자료형 변수들의 묶음. <- 변수들 
		               목적 : 변수 관리.
		   형식:
		       자료형 배열변수명[] = new 자료형[벼열의 총수];
		       
		       int Array[] = new int[5]; => int num1, num2, num3, num4, num5
		          (Stack영역)    dynamic(동적)allocation(할당)(Hip 영역에 저장)
		       정적                      
		       Array[0] = 11;
		       Array[1] = 22;
		       Array[2] = 33;
		       Array[3] = 44;
		       Array[4] = 55;                            
		             0,1,2,3,4=index number  
		   int num1, num2 .... num10;
		   
		   배열-> 동적? 정적?
		         동적-> 설정후-> 정적
		 */
		
		//  배열변수=변수들명
		int Array[] = new int[5];
		                          
		System.out.println(Array); // 28   a4  18   fc -> 4 byte
		                    //16진수  8bit 8bit 8bit 8bit  
		// 배열의 길이
		System.out.println(Array.length);
		
		// 배열에 접근
		// int num1;
		// System.out.println(num1); -> error: 초기화를 하지 않음(Stack 영역) 
		// System.out.println(Array[0]); -> dynamic allocation 한 변수의 영역은 자동 초기화
		
		// index number = [0 ~ n-1]까지 
		Array[0] = 11;
		Array[1] = 22;
		Array[2] = 33;
		Array[3] = 44;
		Array[4] = 55;
		
		System.out.println(Array[1]);
		
		// 배열 초기화(initialize)
		int Array1[] = { 11, 22, 33, 44, 55	};
		
		System.out.println(Array1.length);
		System.out.println(Array1[1]);
		
		// MiniWork
		// char 배열 "Hello" 길이, [0] ~[4]
		// char 배열 "World" 초기화
		char cA[] = new char[5];
		cA[0] = 'H';
		cA[1] = 'e';
		cA[2] = 'l';
		cA[3] = 'l';
		cA[4] = 'o';
		System.out.println(cA.length);
		System.out.print(cA[0]);
		System.out.print(cA[1]);
		System.out.print(cA[2]);
		System.out.print(cA[3]);
		System.out.print(cA[4] + "\n");
		
		char cA1[] = {'W', 'o', 'r', 'l', 'd'};
		
		System.out.println(cA1.length);
		System.out.println("" + cA1[0]+ cA1[1]+ cA1[2]+ cA1[3]+ cA1[4]);
		System.out.print(cA1[0]);
		System.out.print(cA1[1]);
		System.out.print(cA1[2]);
		System.out.print(cA1[3]);
		System.out.print(cA1[4] + "\n");
		
		System.out.println(cA1); // World로 출력
		
		char a = 'A';  // ASCII 'A'=65
		char b = 'B';  // ASCII 'B'=65
		System.out.println(a+b);
		System.out.println((int)a); // ASCII 코드값
		
		// Wrapper class 기본자료형 -> 객체화
		
		/*
		   Mini Work
		   다음은 소문자를 대문자로 변격해서 출력 대문자면 소문자로 출력
		   ex) 'A'의 코드는 65 'a'의 코드는 97이다.
		 */
		// 1.
		int gap = 'a' - 'A';
		
		char c = 'd'; // 소문자입력
		System.out.println((char)(c-gap));
		
		c = 'D'; // 대문자입력
		System.out.println((char)(c+gap));
		
		// 2.
		char ch = 'c';
		int ch1 = ch - 32;
		System.out.println((char)ch1);
		
		ch = 'D';
		ch1 = ch + 32;
		System.out.println((char)ch1);
		
		// Mini Work 
		// random 3 7 8 9 14
		int ranAy[] = {3, 7, 8, 9, 14};
		
		int ran = (int)(Math.random()*5); // 0 ~ 4 출력
		
		System.out.println("random 수 = " + ranAy[ran]);
		
		// 배열 복사
		int arrayNum[] = {111,222,333};
		int arrayCopy[] = new int[arrayNum.length];
		
		// value(값) 복사
		arrayCopy[0] = arrayNum[0];
		arrayCopy[1] = arrayNum[1];
		arrayCopy[2] = arrayNum[2];
		
		System.out.println(arrayCopy[2]);
		
	    arrayCopy[2] = 300;
	    System.out.println(arrayNum[2]); // arrayNum[]의 값에 영향을 끼치치 않는다.
		
		// adrees(주소값) 복사
		int arrayNum2[] = {111,222,333};
		int arrayCopy2[] = arrayNum2;
		
		System.out.println(arrayCopy2[1]);
		
		arrayCopy2[1] = 200;
		System.out.println(arrayNum2[1]); // arrayNum2[]의 값에 영향을 끼친다.
		
		// 배열 swap
		int number1[] = { 11, 22, 33 };
		int number2[] = { 77, 88, 99 };
		
		
		/*
		int temp;
		
		temp = number1[0];
		number1[0] = number2[0];
		number2[0] = temp;
		
		temp = number1[1];
		number1[1] = number2[1];
		number2[1] = temp;
		
		temp = number1[1];
		number1[1] = number2[1];
		number2[1] = temp;
		*/
		
		// if 배열의 수가 100개 이상인 경우는?
		// address 값을 이용
		int numAlias1[] = number1; // 주소값 대입
		int numAlias2[] = number2; // 주소값 대입
		
		int temp[];
		
		// 주소값을 이용향 swap
		temp = numAlias1; // temp는 temp[]의 주소값
		numAlias1 = numAlias2;
		numAlias2 = temp;
		
	}

}
