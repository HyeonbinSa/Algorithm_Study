package algorithm.boj.basicmath1;

import java.util.Scanner;

public class Q2775 {
	// k : 층 
	// n : 호
	// 아래층의  1~n호까지 사람의 수 
	// 0층 i호에는 i 명이 살고있음 
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int k,n;
		int[] result = new int[T];
		for(int i=0; i<T;i++) {
			k  = sc.nextInt();
			n  = sc.nextInt();
			result[i] =  this.calc(k, n);
		}
		for(int i=0; i<T;i++) {
			System.out.println(result[i]);
		}
	}

	public int calc(int k, int n) {
		if(n == 1) {
			return  1;
		}
		if(k == 0) {
			return  n;
		}
		return  this.calc(k-1, n) +  this.calc(k, n-1);
	}
	
}

//  4: 1 6 21 56
//  3: 1 5 15 35
//  2: 1 4 10 20
//  1: 1 3 6 10
//  0: 1 2 3 4

// 1호는 무조건  1
// 2호는 층수 +2;
// 3호는 아래층  1,2 +3 