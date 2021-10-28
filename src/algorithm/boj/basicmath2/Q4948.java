package algorithm.boj.basicmath2;

import java.util.Scanner;

public class Q4948 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			n = sc.nextInt();
			if(n == 0) {
				break;
			}
			System.out.println(this.count(n));
		}
	}
	public int count(int n) {
		int count = 0;
		for(int i=n+1;i<=2*n;i++) {
			if(this.check(i)) {
				count++;
			}
		}
		return count;
	}
	public boolean check(int n) {
		if(n<=1) {
			return false;
		}else {
			if(n==2 || n==3) {
				return true;
			}else {
				for(int i=2;i<=Math.sqrt(n);i++) {
					if(n%i == 0) {
						return false;
					}
				}
				return true;
			}
		}
	}
}
// 13 14 15 16 17 18 19 20 21 22 23 24 25 26
