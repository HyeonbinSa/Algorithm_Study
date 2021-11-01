package algorithm.boj.bruteforce;

import java.util.Scanner;

public class Q1018 {
	public void solution() {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[][] ch = new String[n][m];
		for(int i=0;i<n;i++) {
			String s = sc.next();
			for(int j=0;j<m;j++) {
				ch[i][j] = s.split("")[j];
			}
		}
		for(int i=0;i<=n-8;i++) {
			for(int j=0;j<=m-8;j++) {
				
			}
		}
	}
	
	public int changeCount(int startX, int startY, String[][] arr) {
		int change = 0;
		String flag = arr[startX][startY];
		for(int i=startX;i<8+startX;i++) {
			for(int j=startY;j<8+startY;j++) {
				
			}
		}
		return change;
	}
}
