
public class SwitchClass {

	public static void main(String[] args) {
		/*
		   switch : if문과 비슷하다.
		            값이 명확해야 한다.
		            실수를 사용할 수 없다.
		            범위를 지정할 수 없다.
		            속도가 빠르다.
		            깔끔하다.
		   
		   형식: 
		       switch(대상변수){
		           case 값1:     // 대상변수의 값
		               처리1
		               break;   // 탈출
		           case 값2:
		               처리2
		               break;
		               :
		           default:      // else문과 같은 역할
		               처리n
		       }
		 */
		
		int number = 0;
		
		switch(number) {
			case 1:           // => if(number == 1)
				System.out.println("number 1입니다");
				break;
			case 2:           //  => else if(number == 2)
				System.out.println("number 2입니다");
				break;
			case 3:           // => else if(number == 3)
				System.out.println("number 3입니다");
				break;
			default:          // => else
				System.out.println("해당 숫자가 없습니다");
		}
		
		/* switch문은 범위 설정이 불가능하다.
		switch(number) {
			case number >0 ;  범위를 지정할수 없다
		}
		*/
		
		// switch 는 double형 변수를 사용할수 없다
		// char는 사용 가능
		char c = 'B';
		
		switch(c){
			case 'A':
				System.out.println("A입니다");
				break;
			case 'B':
				System.out.println("B입니다");
				break;
		}
		
		String str = "He";
		str = str + "llo";
		
		// if문에서는 안되지만 switch에서는 되는 것
		// String문 비교가 가능하다
		if(str == "Hello") {     // equals를 써야한다.
			System.out.println("str은 Hello입니다");
		}
		
		switch(str) {
			case "Hello":       // => equals와 같은 방식
				System.out.println("Hello");
				break;
		}
	}

}
