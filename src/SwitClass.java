import java.util.Arrays;

public class SwitClass {

	public static void main(String[] args) {
		boolean swit[]= new boolean[10];  // 전부 false로 초기화
		int r, w;
		int r_num[] = new int[3];
		
		w=0;
		
		while(w<3) {
			r = (int)(Math.random()*9);  // 0 ~9
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r+1 ;          // 1~10 사이 수 저장
				w++;
			}
		}
		System.out.println(Arrays.toString(r_num));
	}

}
