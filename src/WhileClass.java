
public class WhileClass {

	public static void main(String[] args) {
			/*
		    loop
		    
		    for(초기화;조건식;연산식){
		           처리
		    }
		    
		    // 이중for문
		    for(초기화;조건식;연산식){
		        for(초기화;조건식;연산식){
		    	     처리(배열과 조건문을 많이 사용)
		    	}
		    }
		    
		    while문
		    
		    형식:
		        초기화
		        while(조건식){
		            처리
		            
		            연산식
		        }
		    
		 */
			
			int w;   // 변수선언
			
			w = 0;   // 초기화
			while(w < 10) {  // 조건식
				System.out.println("while loop " + w);  // 처리
				
				w++;       //연산식
			}
			
			// 무한루프
			//	while(true) {    // true 대신 '1' 사용 가능
			//		System.out.println("무한 루프");
			//	}
			
			for(int i=0; i<5; i++) {
				System.out.println("i = "+i);
				for(int j=0;j<3;j++) {
					System.out.println("\tj = "+j);
				}
			}
			System.out.println();
			
			// 이중 while문
			int w1, w2;
			
			w1 = w2 = 0;   // w2 초기화 위치는 while문 안에 해야한다.
			
			while(w1<5) {
				System.out.println("w1 = "+w1);
				w2 = 0;                         // 초기화 위치가 중요!!
				while(w2 < 3) {
					System.out.println("\tw2 = "+ w2);
					w2++;
				}
				w1++;
			}
			
			/*
			    do while문  -> 처리가 1번은 무조건 일어난다
			    형식:
			    	초가화
			    	do{
			    		처리
			    		
			    		연산식
			    	}while(조긴식);
			 */
			
			int w3;
			w3 = 5;
			
			do {
				System.out.println("do while " + w3);   // 무조건 1번 실행은 된다
				
				w3++;
			}while(w3 < 5);
			

	}

}
