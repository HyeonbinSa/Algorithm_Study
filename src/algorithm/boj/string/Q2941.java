package algorithm.boj.string;

import java.util.Scanner;

public class Q2941 {
	public void solution() {
		String[] cr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0;i<cr.length;i++) {
			str = str.replaceAll(cr[i], ""+i);
		}
		System.out.println(str.length());
	}
}
