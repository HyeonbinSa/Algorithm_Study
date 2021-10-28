package algorithm.boj.basicmath2;

import java.util.Scanner;

public class Q1978 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for(int i=0; i<n ;i++) {
			int number = sc.nextInt();
			if(this.check(number)) {
				answer++;
			}
		}
		System.out.println(answer);
	}
	public boolean check(int n) {
		if(n<=1) {
			return false;
		}else {
			if(n == 2 || n == 3) {
				return true;
			}else {
				for(int i = 2;i<=Math.sqrt(n);i++) {
					if(n%i==0) {
						return false;
					}
				}
				return true;
			}
		}
	}
}
