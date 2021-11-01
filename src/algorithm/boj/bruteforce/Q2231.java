package algorithm.boj.bruteforce;

import java.util.Scanner;

public class Q2231 {
	public void solution() {
		// N의 분해합 : N + N의 각 자리수의 합 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = this.makeStartNumber(n);
		int answer = 0;
		for(int i=start;i<=n;i++) {
			int divSum  = this.div(i);
			System.out.println("i : "+i+", divdum : " + divSum);
			if(divSum + i  == n) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}
	
	public int div(int n) {
		int sum = 0;
		while(n>0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	
	public int makeStartNumber(int num) {
		String s = Integer.toString(num);
		int startNumber = num - s.length()*9;
		return startNumber;
	}
}
