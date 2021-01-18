
public class BreakClass {

	public static void main(String[] args) {
		/*
		   break == 탈출
		   
		   loop문과 함꼐 사용한다(for, while, do while)
		   
		   switch(변수){
		    	case 값1:
		    		처리1;
		    		break;
		   		case 값2:
		    		처리2;
		    		break;
		   }
		   
		   형식:
		   	   for(int i = 0; i<10; i++){
		   	        if(조건){
		   	        	break;        // if문의 조건이 만족되면 break를 통해 for문을 탈출한다.
		   	        }
		   	   }
		   	   
		   	   int w = 0;
		   	   while(w<5){
		   	   		if(조건){
		   	   			break;		// if문의 조건이 만족되면 break를 통해 while문을 탈출한다.
		   	   		}
		   	   		w++;
		   	   }
		 */
		
		for(int i = 0; i<10; i++) {
			System.out.println("for loop "+ i);
			if(i == 5) {   // i=5 일때 for문 탈출
				break;
			}
		}
		
		char array[] = { 'a', 'b', 'c', 'd', 'e' };
		for(int i=0; i < array.length; i++) {
			System.out.println("for i = "+ i);
			if(array[i] == 'd') {
				break;
			}
		}
		
		// 정수 배열 5 ~ 6개 초기화 -> -n  
		
		int array1[] = { 11, 22, 33 , -22, 32};
		
		for(int i=0; i<array1.length; i++) {
			System.out.println("array[] = " + array1[i]);
			if(array1[i]<0)
				break;
			System.out.println("array[] = " + array1[i]);
			System.out.println();
		}
		
		// 2중 loop문 탈출
		for(int i=0;i<10;i++) {
			System.out.println("i = "+ i);
			for(int j=0;j<5;j++) {
				System.out.println("\tj = "+ j);
				
				if(i == 3 && j == 2) {
					break;  				// break문 하나당 loop문 하나만 탈출
				}
			}
		}
		
		// 1. loop문 수에 맞게 break문 사용
		boolean b = false;
		
		for(int i=0;i<10;i++) {
			System.out.println("i = "+ i);
			for(int j=0;j<5;j++) {
				System.out.println("\tj = "+ j);
				
				if(i == 3 && j == 2 ) {
					b = true;
				}
				if(b == true) {
					break;
				}
			}
			
			if(b == true) {
				break;
			}
		}
		
		// 2. break를 설정
		out:for(int i=0;i<10;i++) {                  
			System.out.println("i = "+ i);
			for(int j=0;j<5;j++) {
				System.out.println("\tj = "+ j);
				
				if(i == 3 && j == 2 ) {
					break out;          // out으로 정해진 loop문을 break를 설정해서 탈출
				}
			}
		}
		
		// foreach문
		int arr[] = { 11, 22, 33, 44, 55 };
		for(int n : arr ) {			// n = arr[0~4]의 값이 대입
			System.out.println(n);
		}
		
	}

}
