package algorithm.boj.basicmath1;

import java.util.Scanner;

public class Q10250 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int h, w, n;
		int [] result = new int[2];
		for(int i=0;i<N;i++) {
			h = sc.nextInt(); // 층수 
			w = sc.nextInt(); // 층별 객실 수 
			n = sc.nextInt(); // 들어온 순서 
			result[0] = n%h; // 들어갈 방의 층 수 
			result[1] = n/h + 1; // 들어갈 방의 호수 
			if(result[0] == 0) {
				result[0] = h;
				result[1] -= 1;
			}
			int len = Integer.toString(w).length();
			if(len <2) {
				len = 2;
			}
			System.out.println(result[0] + String.format("%0"+len+"d", result[1]));
		}
	}
}
