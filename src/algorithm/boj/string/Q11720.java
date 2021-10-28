package algorithm.boj.string;

import java.util.Scanner;

public class Q11720 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		sc.close();
		int sum =0;
		for(String s : str.split("")) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
	}
}
