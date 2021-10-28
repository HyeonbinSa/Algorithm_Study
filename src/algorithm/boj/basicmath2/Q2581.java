package algorithm.boj.basicmath2;

import java.util.Scanner;

public class Q2581 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int count = 0; 
		int sum = 0;
		int min = 0;
		boolean flag = true;
		for(int i=start;i<=end;i++) {
			if(this.check(i)) {
				sum += i;
				count++;
				if(flag) {
					min = i;
					flag = false;
				}
			}
		}
		if(count == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	public boolean check(int n) {
		if(n<=1) {
			return false;
		}else {
			if(n==2||n==3) {
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

//2 3 5 7 11 13 17 19
