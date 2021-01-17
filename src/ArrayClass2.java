
public class ArrayClass2 {

	public static void main(String[] args) {
		/*
		   1차원 배열
		   Array : 같은 자료형 변수들의 묶음.
		            관리는 index number로 관리된다.
		            동적으로 할당된 후에 정적을 사용된다.
		    
		   int array[] = new int[10];
		   array[0] = 1;
		   
		   int array[] = { 1, 2, 3, 4, 5 };
		   
		   2차월 배열
		   int array2[][] = new int[3][4];
		   
		   int array2[][] = {          // 세로 3, 가로 4
		      { 1, 2, 3, 4 },
		      { 5, 6, 7, 8 },		  
		      { 9, 10, 11, 12 } 
		   };   
		 */
		
		int Array2[][] = new int[3][];
		
		int Array01[] = { 1, 2, 3, 4 };
		
		Array2[0] = Array01;
		
		int Array02[] = { 5, 6, 7 };
		Array2[1] = Array02;
		
		int Array03[] = { 8, 9 };
		Array2[2] = Array03;
		
		/* 출력
		   int Array2[][] = {
		     { 1, 2, 3, 4 }, 
		     { 5, 6, 7 },
		     { 8, 9 }  
		   };
		 */
		
		System.out.println(Array2[0][0]);
		System.out.println(Array2[0][1]);
		
		int Array21[][] = new int[2][3];
		
		Array21[0][0] = 1;
		Array21[0][1] = 2;
		Array21[0][2] = 3;
		
		Array21[1][0] = 4;
		Array21[1][1] = 5;
		Array21[1][2] = 6;
	
		/* 출력
		   int Array21[][] = {
		     { 1, 2, 3 },    
		     { 4, 5, 6 }
		   };
		 */
		
		System.out.println(Array21.length); // 세로길이 출력
		System.out.println(Array21[0].length); // 가로길이 출력
		
		// Array 복습
		/*
		    Array : 배열
		            변수의 연장
		            같은 자료형 변수의 묶음
		            관리의 목적   
		            숫자(Index number)로 접근
		            
		            배열의 총수 : n=5     
		            배열의 범위 : 0 ~ n-1
                 
         생성: 
                 // 1.
                 int Array[] = new int[5];
                 Array[0] = 11;
                 Array[1] = 22;
                 Array[2] = 33;
                 Array[3] = 44;
                 Array[4] = 55;
                 
                 // 2.
                 int Array[] = null; // 초기화
                 Array = new int[5];
		 */
		                         // 동적할당이 필요한 변수는 null로 초기화
		int Array[] = null;      // null(0) -> 0x00000000 
		System.out.println(Array);
		
		Array = new int[5];
		System.out.println(Array);
		
		// 변수선언과 동시에 초기화
		int ArrayInit[] = { 1, 2, 3, 4, 5 };
		System.out.println(ArrayInit.length);
		
		// 2차월 배열 
		int Array2_3[][] = new int[2][3];
		
		Array2_3[0][0] = 11;
		Array2_3[0][1] = 22;
		Array2_3[0][2] = 33;
		
		Array2_3[1][0] = 44;
		Array2_3[1][1] = 55;
		Array2_3[1][2] = 66;
		
		// 변수선언과 동시에 초기화
		int Array21_3[][] = {
				{ 11, 22, 33 },
				{ 44, 55, 66 }
		};	
	}

}
