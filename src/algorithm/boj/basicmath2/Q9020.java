package algorithm.boj.basicmath2;

import java.util.Scanner;

public class Q9020 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] numbers = new int[T];
		int max = 0;
		for(int t=0;t<T;t++) {
			numbers[t] = sc.nextInt();
			if(max < numbers[t]) {
				max = numbers[t];
			}
		}
		
		
	}
	
}
