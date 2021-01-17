
public class RandomClass {

	public static void main(String[] args) {
		/*
	    Random : 무작위, 난수
	             1 ~ 5 -> ?
	 */
	
	int r;
	
	// 0 ~ 9
	r=(int)(Math.random() * 10);  // Math random()은 
	                              // 0.0 <= Math.random() < 1.0 사이값을 return 한다.
	System.out.println(r);
	
	// 10 20 30 40 50
	r=(int)((Math.random() * 5) + 1) * 10;
	System.out.println(r);

	}

}
