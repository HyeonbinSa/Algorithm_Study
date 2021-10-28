package algorithm.boj.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1260 {
	
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int start  = sc.nextInt();
		boolean[] visited = new boolean[N+1]; // false로 초기화 
		int[][] arr = new int[N+1][N+1];
		// 간선 초기화 
		for(int i=0;i<M;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = arr[y][x] = 1;
		}
		dfs(arr, visited, start);
		System.out.println();
		visited = new boolean[N+1]; // false로 초기화 
		bfs(arr, visited, start);
	}
	public void dfs(int[][] arr, boolean[] visited, int start) {
		visited[start] = true;
		System.out.print(start + " ");
		for(int i=1;i<arr.length;i++) {
			if(arr[start][i]==1 && visited[i]==false) {
				dfs(arr,visited,i);
			}
		}
	}
	public void bfs(int[][] arr, boolean[] visited, int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		while(!q.isEmpty()) {
			int num = q.poll();
			visited[num] = true;
			System.out.print(num + " ");
			for(int i=1;i<arr.length;i++) {
				if(arr[num][i]==1 && visited[i]==false) {
					q.offer(i);
					visited[i]=true;
				}
			}
		}
		
		
	}
}
