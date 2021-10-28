package algorithm.boj.string;

import java.util.Scanner;

public class Q10809 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int[] alphabet = new int[26];
		String str = sc.next();
		sc.close();
		for(int i=0;i<26;i++) {
			alphabet[i] = -1;
		}
		// 'a' = 97 , 'z'=122
		for(int i=0;i<str.length();i++){
			int idx = (int)str.charAt(i)-97;
			if(alphabet[idx] != -1) {
				continue;
			}
			alphabet[idx] = i;
		}
		for(int i=0;i<26;i++) {
			System.out.print(alphabet[i]+" ");
		}
	}
}
