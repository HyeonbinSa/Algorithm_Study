package section2;


// 1 ~ 100000 사이의 소수를 찾아 출력
public class Code17 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(check(i))
				System.out.println(i);
		}

	}
	
	public static boolean check(int num) {
		if(num < 2) 
			return false;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
}
