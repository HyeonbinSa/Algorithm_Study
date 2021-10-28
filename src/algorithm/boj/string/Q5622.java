package algorithm.boj.string;

import java.util.Scanner;

public class Q5622 {
	public void solution() {
		int[] dial = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int time = 0;
		for(int i=0;i<str.length();i++) {
			time += dial[str.charAt(i)-65] + 1;
		}
		
		System.out.println(time);
	}
}
