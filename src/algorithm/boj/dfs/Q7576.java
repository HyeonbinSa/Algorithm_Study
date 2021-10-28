package algorithm.boj.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7576 {	
	class Tomato{
		int x;
		int y;
		public Tomato(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static Queue<Tomato> q = new LinkedList();
	public void solution() {
		// 1 = 익은 토마토
		// -1 = 비어있는 칸
		// 0 = 익지 않은 토마토 
		Scanner  sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		// 1. 토마토 박스 생성 
		int[][] map = new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 1) {
					q.add(new Tomato(i,j));
				}
			}
		}
		System.out.println(this.bfs(map));
	}
	public void print(int[][] map) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	public int bfs(int[][] map) {
		while(!q.isEmpty()) {
			Tomato t = q.poll();
			int x = t.x;
			int y = t.y;
			if(x-1>=0 && map[x-1][y] == 0) {
				q.add(new Tomato(x-1, y));
				map[x-1][y] = map[x][y] + 1;
			}
			if(x+1<map.length && map[x+1][y] == 0) {
				q.add(new Tomato(x+1, y));
				map[x+1][y] = map[x][y] + 1;
			}if(y-1>=0 && map[x][y-1] == 0) {
				q.add(new Tomato(x, y-1));
				map[x][y-1] = map[x][y] + 1;
			}
			if(y+1<map[x].length && map[x][y+1] == 0) {
				q.add(new Tomato(x, y+1));
				map[x][y+1] = map[x][y] + 1;
			}
		}
//		this.print(map);
		return this.getDay(map);
	}
	public int getDay(int[][] map) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				if(map[i][j] == 0) {
					return -1;
				}
				if(map[i][j] > max) {
					max =  map[i][j];
				}
			}
		}
		if(max == 1) {
			return 0;
		}
		return max-1;
	}
}
