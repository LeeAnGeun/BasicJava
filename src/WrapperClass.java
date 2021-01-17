
public class WrapperClass {

	public static void main(String[] args) {
		/*
	    Wrapper Class
	    일반 자료형(char, int)을 객체(class)화 한 것.
	    
	    일반 자료형              wrapper class
	    boolean               Boolean
	    
	    byte                  Byte
	    short                 Short
	    int                   Integer ---------
	    long                  Long
	    
	    float                 Float
	    double                Double ----------
	    
	    char                  Character
	    char[]                String ----------
	 */
	
		// Integer == int
		int i = 123;
		
		Integer in = 234; 
		
		System.out.println(i);
		System.out.println(in);
		
	//	Integer iobj = new Integer(345);
		Integer iobj = 345;
		
	//	String str = new String("Hello");
		String str = "Hello";
	
		/*
		   class : 변수 + 함수
		   동적할당을 무조건 해야한다.
		 */
		
		// 숫자 (Number) -> 문자열(String)
		    // int n = 123;
		// String s = "" + n; 
		Integer n = 234; 
		String s = n.toString();
		System.out.println(s);
		
		Double d = 123.456;
		String s2 = d.toString();
		System.out.println(s2);
		
		// 문자열(String) -> 숫자(Number)
		String s1 = "1234";
		int num = Integer.parseInt(s1);  // parseInt 메소드 기본 자료형 int를 반환
		                                 // 오버로딩 메소드 내부적으로 parseInt(s, 10) 호출 10은 진수형태
		System.out.println(num);
		
		String s4 = "456.789";
		double d2 = Double.parseDouble(s4);
		System.out.println(d2);
	}

}
