package algorithm.boj.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2206 {
	class Point{
		int x;
		int y; 
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	Queue<Point> q  = new LinkedList<Point>();
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] map = new int[N][M];
		boolean[][] v = new boolean[N][M];
		int[][] visited = new int[N][M];
		// 1. 지도 초기화 
		for(int h=0;h<N;h++) {
			String str = sc.next();
			String[] strArr = str.split("");
			for(int w=0;w<M;w++) {
				map[h][w] = Integer.parseInt(strArr[w]);
			}
		}
		
	}
	public void bfs(int[][] map, int[][] visited) {
		q.add(new Point(0, 0));
		visited[0][0] = 1;
		while(!q.isEmpty()) {
			Point p = q.poll();
		}
	}
}
