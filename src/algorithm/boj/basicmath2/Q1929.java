package algorithm.boj.basicmath2;

import java.util.Scanner;

public class Q1929 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int start  = sc.nextInt();
		int end = sc.nextInt();
		
		int[] arr = new int[end+1];
		arr[0] = 0;
		arr[1] = 0;
		// 배열 초기화 
		for(int i=2;i<=end;i++) {
			arr[i] = i;
		}
		for(int i=2;i*i<=end;i++) {
			for(int j=i*i; j<=end;j+=i) {
				arr[j] = 0;
			}
		}
		
		for(int i=start;i<=end;i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
