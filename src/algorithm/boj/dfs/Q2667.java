package algorithm.boj.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2667 {
	private static int count =0;
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean[][] visited = new boolean[N][N];
		for(int i=0;i<N;i++) {
			String line = sc.next();
			String[] strArr = line.split("");
			for(int j=0;j<N;j++) {
				arr[i][j] = Integer.parseInt(strArr[j]);
			}
		}
		for(int x=0;x<N;x++) {
			for(int y=0;y<N;y++) {
				if(arr[x][y] == 1  && visited[x][y] == false) {
					dfs(x, y, arr, visited);
					list.add(count);
					count=0;
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i: list) {
			System.out.println(i);
		}
	}
	public void dfs(int x, int y, int[][]arr , boolean[][] visited) {
		visited[x][y] = true;
		count++;
		// 상 
		if(x-1>=0) {
			if(arr[x-1][y] == 1 && visited[x-1][y] == false) {
				dfs(x-1, y, arr, visited);
			}
		}
		// 하 
		if(x+1<arr.length) {
			if(arr[x+1][y] == 1 && visited[x+1][y] == false) {
				dfs(x+1, y, arr, visited);
			}
		}
		// 좌 
		if(y-1>=0) {
			if(arr[x][y-1] == 1 && visited[x][y-1] == false) {
				dfs(x, y-1, arr, visited);
			}
		}
		// 우 
		if(y+1<arr.length) {
			if(arr[x][y+1] == 1 && visited[x][y+1] == false) {
				dfs(x, y+1, arr, visited);
			}
		}
	}
}
