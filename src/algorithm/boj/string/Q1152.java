package algorithm.boj.string;

import java.util.Scanner;

public class Q1152 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();
		if(str.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(str.split(" ").length);
		}
	}
}
