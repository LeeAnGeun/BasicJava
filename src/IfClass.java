
public class IfClass {

	public static void main(String[] args) {
			/*
		    제어문
		    
		    - 조건문
		    if*
		    
		    if
		    else
		    
		    if
		    else if
		    else
		    
		    switch
		    
		    
		    형식:
		        if(조건){    // 조건 -> 논리연산(true/false)
		           (처리)
		        }
		        
		        조건 -> == > < >= <= != 을 사용
		               논리 연산자 : &&, ||, ! 을 사용
		               
		    - 반복문, loop문, 순환문
		    
		    - 탈출구문
		 */
		// if문 사용
		int number = 5;
		
		if(number > 0) {
			System.out.println("number는 0보다 크다");
		}
		
		if(number > 0 && number < 10)  // 처리할 문장이 하나면 {} 체거 가능 
			System.out.println("number는 0보다 크고 10보다 작다");
		
		if(number == 5) {
			System.out.println("number는 5입니다.");
		}
		
		if(number != 9) {
			System.out.println("number는 9가 아닙니다.");
		}
		
		/*
		    // 파이썬
		    if 조건 : 
		         처리1
		         처리2   // 줄 맞춤이 중요
		 */
		
		/*
		   // if else 문
		    형식: 
		        if(조건){
		            처리1
		        }
		        else{
		            처리2
		        }              // 삼항연산자와 비슷
			        
		 */
		
		if(number > 5) {
			System.out.println("number는 5보다 크다");
		}
		else {  
			System.out.println("number는 5보다 작거나 같다");	
		}
		
		/*
		   // 조건분기
		      if(조건1){
		          처리1
		      }
		      else if(조건2){
		          처리2
		      }
		      else if(조건3){
		          처리3
		      }
		      else{       <-- 사용자의 선택
		           처리4
		      }
		 */
		
		number = 65;
		// 1.
		if(number == 100) {
			System.out.println("A+입니다");
		}
		else if(number >= 90) {
			System.out.println("A입니다");	
		}
		else if(number >= 80) {
			System.out.println("B입니다");	
		}
		else if(number >= 70) {
			System.out.println("C입니다");	
		}
		else {
			System.out.println("F입니다");
		}
		
		// 2.
		if(number == 100) {
			System.out.println("A입니다");	
		}
		else if(number >= 90 && number < 100) {
			System.out.println("B입니다");	
		}
		else if(number >= 80 && number < 90) {
			System.out.println("C입니다");	
		}
		
		/*
		   조건 안에 조건
		   if(조건1){
		       
		       if(조건2){
		           처리1
		       }
		       else{
		           처리2
		       }
		   } 
		 */
		
		number = 95;
		
		// 95 <= A+
		// 95 > A
		if(number >= 90) {
			if(number >= 95) {
				System.out.println("A+입니다");
			}
			else {
				System.out.println("A입니다");
			}
		}
		else {
			System.out.println("A이하 입니다");
		}
		
		// 
		boolean b; // true(1)/false(0)
		b = false;
		
		if(b==false) {
			System.out.println("b는 false입니다");
		}
		
		if(!b) {
			System.out.println("b는 false입니다");
		}
		
		b = true;
		
		if(b==true) {
			System.out.println("b는 true입니다");
		}
		
		if(b) {
			System.out.println("b는 true입니다");
		}
		
		String str1 = "안녕하세요";
		String str2 = "안녕";
		str2 = str2 + "하세요";
		
	//	System.out.println(str2);
		
		// 판별이 안됨
		if(str1 == str2) {
			System.out.println("같은 문자열입니다");
		}
		else {
			System.out.println("다른 문자열입니다");
		}
		
		// 정확하게 판별하게 위해 equals를 써야한다.
		if(str1.equals(str2)) {
			System.out.println("같은 문자열입니다");
		}
		else {
			System.out.println("다른 문자열입니다");
		}
		
		// 문자열 비교
		String str3 = "나는 성공할 수 있습니다";
		
		if(str3.contains("성공")) {
			System.out.println("해당 문자열을 포함하고 있습니다");
		}
		else {
			System.out.println("해당 문자열은 없습니다");
		}
	}

}
