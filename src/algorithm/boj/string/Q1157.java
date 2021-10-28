package algorithm.boj.string;

import java.util.Scanner;

public class Q1157 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] alpha = new int[26]; // 알파벳 사용 개수 담을 배열 
		int max = -1; // 최대값 
		int idx = -1; // 최대 인덱스 
		int count = 0;
		sc.close();
		// 1. 대문자로 통일 
		str =  str.toUpperCase();
		// 2. 반복문을 통해 알파벳 사용횟수 측정 
		for(int i=0;i<str.length();i++) {
			alpha[str.charAt(i)-65]++;
		}
		
		for(int i=0;i<26;i++) {
			if(max < alpha[i]) {
				count = 1;
				max = alpha[i];
				idx = i;
			}else if(max == alpha[i]) {
				count++;
			}
//			System.out.print(alpha[i] );
		}
		if(count > 1) {
			System.out.println("?");
		}else {
			System.out.println((char)(idx+65));
		}
	}
}
