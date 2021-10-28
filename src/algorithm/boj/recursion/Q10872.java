package algorithm.boj.recursion;

import java.util.Scanner;

public class Q10872 {
	public void solution() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(this.factorial(n));
	}
	public int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*this.factorial(n-1);
	}
}
