
public class MainClass {

	public static void main(String[] args) {
		
		// 삼항 연산자*
		/*
		  값 = ( 조건 ) ? 값1 : 값2;  // 조건이 true 일시 값=값1, false 면 값=값2
		 */
				
		int num=-1;
				
		int n;
		n=(num>0)?100:200;
		System.out.println("n="+n);
				
		char c;
		c = (num<0)?'Y':'N';
		System.out.println("c="+c);
				
		/*
		    bit 연산 : 0, 1  -> 2진수
		    		    
		    &   AND 연산
		    |   OR 연산
		    ^   XOR 연산
		    <<  LEFT SHIFT
		    >>  RIGHT SHIFT
		    ~   NOT
		    
		    2 진수
		    1   1   0   1       = 13
		   2^3 2^2 2^1 2^0 
		    
		    
		    1100 1010
		    8421 8421
		     12   10   => 12 * 16 + 10 * 1 = 192 + 10 = 202
		    16^1 16^0
		     C    A      // 16진수
		     
		    1110 0011    // 2진수
		    8421 8421
		     14   3      // ->
		     E    3      // 16진수
		     
		      0X7A       // 16진수
		    8421 8421    // ->
		    0111 1010    // 2진수 
		     
		 */
		
		
		// AND
		int number;
		
		number = 0x71 & 0x85;
		/*
 		    0x71   -> 0111 0001
		                  &            = 0000 0001 = 1
		    0x85   -> 1000 0101
		 */
		System.out.println("number="+number);
		System.out.printf("0x%x \n", number);
		
		// OR
		number = 0xD2 | 0x3B;
		/*
		     0xD2   -> 1101 0010
		                   |           = 1111 1011 = 0xFB
		     0x3B   -> 0011 1011
		 */
		System.out.println("number="+number);
		System.out.printf("0x%x \n", number);
		
		// XOR 실무에서 활용도가 높다 (XOR연산은 두 bit가 다를 시 true를 반환)
		number = 0xAB ^ 0x74; // 암호화
		/*
		      0xAB   -> 1010 1011
		                    ^          = 1101 1111 = 0xDF
		      0x74   -> 0111 0100 
		                          -> 0xAB를 연산을 통해 0xDF로 바꾸는 과정을 '암호화'라고 한다.
		                                 1101 1111
		                                     ^      = 0xAB
		                                 0111 0100        
		                                  -> 암호화 된 0xDF 값을 다시 0xAB 값으로 바꾸는 과정을 '복구화'라고 한다.  
		*/
		System.out.println("number="+number);
		System.out.printf("0x%x \n", number);
		
		number = 0xDF ^ 0x74; // 복구화
		System.out.println("number="+number);
		System.out.printf("0x%x \n", number);
		
		// shift 연산은 연산속도가 빠르다
		// left shift == *2값
		/*
		    0001    -> 1
		    0010    -> 2
		    0100    -> 4
		    1000    -> 8
		 */
		
		byte by;
		by = 0x1 << 2;
		System.out.println(by);
		
		// right shift == /2값
		/*
	    1000    -> 8
	    0100    -> 4
	    0010    -> 2
	    0001    -> 1
	    0000    -> 0
	    
	      ex) 1010(10) -> 0101(5)
	    */
	
		by = 0x8 >> 3;
		System.out.println(by);
		
		// ~ 반전연산   0->1, 1->0
		by = ~0x55;
		/*
		    0x55 -> 0101 0101 
		                ~          => 1010 1010 = 0xAA
		 */
		System.out.printf("0x%x \n", by);
		
		// Work
		// AND
		int num = 0xF3 & 0xDC;   // 1111 0011 & 1101 1100 = 1101 0000 = 0xd0
		System.out.printf("0x%x \n", num);
		
		// OR
		num = 0x43 | 0xAC;   // 0100 0011 | 1010 1100 = 1110 1111 = 0xEF
		System.out.printf("0x%x \n", num);
		
		// XOR
		num = 0x57 ^ 0x4F;   // 0101 0111 ^ 0100 1111 = 0001 1000 = 0x18
		System.out.printf("0x%x \n", num);
	}

}
