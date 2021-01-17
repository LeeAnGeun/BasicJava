
public class ForClass {

	public static void main(String[] args) {
			/*
		    반복문, 순환문, loop문
		    
		    for* 문 : 지정 횟수에 따라서 반복하는 제어문
		    
		    형식: 
		        for((선언)초기화;조건식;연산식){
		                  
		        }
		        
		        for( (1) ; (2),(5),... ; (4),(7),... ){
		             
		               처리(3),(6),...
		             
		        }
		        
		        
		    while 문
		    
		    do while 문
		 */
		int n;
		
		for( n=0; n<3; n++) {
			System.out.println("for문 처리" + (n+1) + "번");
		}
		
		// 0~9
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println();
		//for(int a=1; a<=100; a++) {
		//	System.out.println("a="+a);
		//}
		//System.out.println();
		for(int b=10; b>0; b--) {
			System.out.println("b="+b);
		}
		System.out.println();
		for(int i=0; i<10; i= i+2) {
			System.out.println("i="+i);
		}
		
	/*	// for문의 무한 loop  -> 조건을 지정하지 않음
		for(int i =0; ;i++) {
			System.out.println(i);
		} */
		
		// for문 안에 for문 = 이중 for문 -> 2차원 배열에서 사용을 많이함
		for(int i=0; i<10; i++) {
			
			System.out.println("i= "+ i); // 0~9
			for(int j=0; j<5; j++) {
				System.out.println("    j= "+ j); // 0~4
			}
		}
		
		int array2[][] = {
				{ 1, 2, 3, 4},
				{ 5, 6, 7, 8},
				{ 9, 10, 11, 12}
		};
		
		for(int i=0; i< array2[1].length; i++) {
			System.out.print(array2[1][i] + " ");
		}
		System.out.println("\n");
		
		// 2차원 배열을 출력하는 방식 
		for(int i=0; i < 3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(array2[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
