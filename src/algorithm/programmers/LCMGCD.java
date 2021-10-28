package algorithm.programmers;

public class LCMGCD {
	public int[] solution(int n, int m) {
        int[] answer = {};
        int big;
        int small;
        if(n>m) {
        	big = n;
        	small = m;
        }else {
        	big = m;
        	small = n;
        }
        int gcd = gcd(big, small);
        int lcm = n*m/gcd;
        System.out.println(lcm);
        answer = new int[] {gcd, lcm};
        return answer;
    }
	public int gcd(int n, int m) {
		int mod = n%m;
		if(mod == 0) {
			return m;
		}
		return gcd(m, mod);
	}
}
