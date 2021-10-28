package algorithm.boj.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Q1316 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		// 1. Stack을 통해서 연속된 문자 제거 후 문자열 생성
		// 2. HashSet를 통해 중복 제거 
		// 3. 두개의 길이 비교 
		Stack<String> st = new Stack<String>();
		HashSet<String> set = new HashSet<String>();
		int n = sc.nextInt();
		int result = 0;
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			str[i] = sc.next();
		}
		for(int i=0;i<n;i++) {
			st.clear();
			set.clear();
			for(String s : str[i].split("")) {
				set.add(s);
				if(st.isEmpty()) {
					st.add(s);
				}else {
					if(st.get(st.size()-1).equals(s)) {
						continue;
					}else {
						st.add(s);
					}
				}
			}
			if(st.size() == set.size()) {
				result++;
			}
		}
		System.out.println(result);
	}
}
