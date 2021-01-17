
public class StringClass {

	public static void main(String[] args) {

		/*
		     String : wrapper class
		              char[]
		              문자열 저장, 편집, 정보취득
		 */
		
		String str;
		// String : class명
		// str    : 변수(== 객체(object))
		
		str = "Hello";
		System.out.println("str = "+ str);
		
		String str1 = new String("Hello"); // String의 최초 이용방법
		String str2 = "반갑습니다";
		
		// 문자열의 결합
		String str3 = str1 + str2;
		System.out.println("str3 = " + str3);
		
		str3 = str3 + "건강하세요";
		System.out.println("str3 = " + str3);
		
		/*
		    함수
		    
		    나오는 값 = 함수명(들어가는값) // 매개변수가 1개일 경우
		    나오는 값 = 함수명(들어가는값, 들어가는값, 들어가는값, ...) // 매개변수가 여려개일 경우
		    
		 */
		
		// 비교 함수
		// equals
		String str4 = "world";
		String str5 = "worl";
		
		str5 = str5 + "d";
		
		System.out.println(str5);
		System.out.println(str4 == str5); // 연산처리값이 아닌 초기값으로 비교
		                                  // -> 그래서 나온 함수가 equals이다.
		boolean b = str4.equals(str5);
		System.out.println("b = " + b);
		
		// 문자 위치 탐색 함수
		// indexOf
		// lastIndexOf
		String str6 = "abcdeabcde";
		int index = str6.indexOf("e");  // 앞에서 부터
		System.out.println("index = " + index);
	
		int lastIndex = str6.lastIndexOf("a");  // 뒤에서 부터
		System.out.println("lastIndex = "+ lastIndex);
		
		// 문자열의 길이 출력 함수
		// length
		// 배열 array.length    // 함수x
		// 문자열 str.length()
		
		int len = str6.length();   // 문자열 길이 반환
		System.out.println("len = "+ len); 
		
		
		// 수정 함수
		// replace
		String str7 = "A*B*C*D";
		String reStr = str7.replace("*", "-"); // * -> - 로 수정
		System.out.println(reStr);
		
		String reStr1 = str7.replace("*", "");
		System.out.println(reStr1);
		
		str7 = "나는 반드시  성공할 수 있  습니다"; // 사용의 예
		reStr = str7.replace("  ", " ");
		System.out.println(reStr);
		
		// 문자열을 자르는 함수
		// 1.
		// 특정 문자를 기준으로 자르는 함수
		// split
		/*
		    초기문자 : aaaa-bbb-ccccc     '-' : token
		    원하는 문자 : aaaa, bbb, ccccc
		 */
		
		String str8 = "홍길동-24-2001/12/26-서울시";
		
		String split[] = str8.split("-"); // split의 반환값은 배열
		// '-'을 기준으로 문자을 자른 값
		System.out.println(split.length);
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		// 2.
		// 문자열의 범위로 자르는 함수
		// substring
		String str9 = "안녕 반가워요 건강해요";
		String subStr = str9.substring(0, 2); // (0, 2) -> 0 ~ 1 까지 자른다
		System.out.println(subStr);
		
		subStr = str9.substring(3, 7); // (3, 7) -> 0 ~ 6 까지
		System.out.println(subStr);
		
		
		// 문자열 --> 대문자
		String str10 = "abcDEF";
		String upStr = str10.toUpperCase();
		System.out.println(upStr);
		
		// 문자열 --> 소문자
		String lowStr = str10.toLowerCase();
		System.out.println(lowStr);
		
		// 문자열의 앞뒤의 공백을 삭제 함수
		// trim : 웹 검색창에 모두 들어가 있는 함수.
		String str11 = "   java java  java       ";  
		String trimStr = str11.trim();
		System.out.println(trimStr);
		
		// index숫자를 입력하면 문자를 돌려주는 함수
		// charAt  <-반대-> IndexOf
		String str12 = "가나다라마";
		char c = str12.charAt(1); 
		System.out.println(c);
		
		// 문자열 탐색 함수
		// contains
		String str13 = "서울시 마포구 서교동";
		boolean b1 = str13.contains("강남");
		System.out.println(b1);
	}

}
