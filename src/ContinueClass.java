import java.util.Scanner;

public class ContinueClass {

	public static void main(String[] args) {
		/*
	    continue : skip(생략)
	    
	    loop문과 같이 사용한다.
	    
	    while(조건){
	    
	    	처리1
	    	
	    	처리2
	    	
	    	if(조건){
	    		continue;  // continue문이 실행되면 다음으로 오는 처리는 생략이 된다.
	    	}
	    	
	    	처리3
	    
	    }
	 */
	
		for(int i=0;i<10;i++) {
			System.out.println("for i = "+ i);
			
			System.out.println("for start");
			
			if(i>3) {
				continue;
			}
			
			System.out.println("for end");
		}
		
		// mini work
		// 숫자 입력 5개
		// 0을 포함해서 음수를 입력 받으면 다시 입력
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		for(int i=0; i<5; i++) {
			System.out.print((i+1) + "번째 수 = ");    
			num[i] = sc.nextInt();
			if( num[i] <= 0) {                       // 음수를 입력받을 시에 다시 입력받는다.
				i--;
				continue;
			}
		}
		System.out.print("출력 num[] =");
		for(int i=0;i<5;i++) {
			System.out.print(num[i]+ " ");
		}
	}

}
