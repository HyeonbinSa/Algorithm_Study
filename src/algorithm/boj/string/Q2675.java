package algorithm.boj.string;

import java.util.Scanner;

public class Q2675 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//테스트 케이스의 개수
		int[] count = new int[n];
		String[] str = new String[n];
		String[] result = new String[n];
		for(int i=0;i<n;i++) {
			count[i] = sc.nextInt();
			str[i] = sc.next();
			result[i] = "";
			for(String s : str[i].split("")) {
				for(int j=0;j<count[i];j++) {
					result[i] += s;
				}
			}
		}
		sc.close();
		for(int i=0;i<n;i++) {
			System.out.println(result[i]);
		}
	}
}
