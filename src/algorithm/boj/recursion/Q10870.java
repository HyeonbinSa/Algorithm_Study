package algorithm.boj.recursion;

import java.util.Scanner;

public class Q10870 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(this.fibo(n));
		
	}
	public int fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return  this.fibo(n-1)+this.fibo(n-2);
	}
}
