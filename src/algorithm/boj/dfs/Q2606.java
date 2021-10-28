package algorithm.boj.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2606 {
	public void solution() {
		Scanner sc = new Scanner (System.in);
		int computer = sc.nextInt();
		int network = sc.nextInt();
		int[][] arr = new int[computer+1][computer+1];
		boolean[] visited = new boolean[computer+1];
		for(int i=0;i<network;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = arr[y][x] = 1;
		}
		sc.close();
		bfs(arr, visited);
	}
	public void bfs(int[][] arr, boolean[] visited) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		visited[1] = true;
		while(!q.isEmpty()) {
			int idx = q.poll();
			for(int i=1;i<arr[idx].length;i++) {
				if(arr[idx][i] == 1 && visited[i] == false) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
//		this.printArr(arr);
		System.out.println(this.printVisted(visited));
	}
	public void printArr(int[][] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
	public int printVisted(boolean[] visited) {
		int count = -1;
		for(int i=1; i<visited.length;i++) {
			if(visited[i]) {
				count++;
			}
//			System.out.println(i+" : "+visited[i]);
		}
		return count;
	}
}
