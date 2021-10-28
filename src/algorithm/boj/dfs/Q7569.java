package algorithm.boj.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7569 {	
	class Tomato{
		int x;
		int y;
		int z;
		public Tomato(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z; // 높이 
		}
	}
	static Queue<Tomato> q = new LinkedList();
	public void solution() {
		// 1 = 익은 토마토
		// -1 = 비어있는 칸
		// 0 = 익지 않은 토마토 
		Scanner  sc = new Scanner(System.in);
		int M = sc.nextInt(); // 박스의 가로  
		int N = sc.nextInt(); // 박스의 세로 
		int H = sc.nextInt(); // 박스의 높이 
		// 1. 토마토 박스 생성 
		int[][][] map = new int[H][N][M];
		for(int h=0;h<H;h++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					map[h][i][j] = sc.nextInt();
					if(map[h][i][j] == 1) {
						q.add(new Tomato(i,j,h));
					}
				}
			}
		}
		System.out.println(this.bfs(map));
	}
	public void print(int[][][] map) {
		for(int i=0;i<map.length;i++) {
			System.out.println("Level : " + i);
			for(int j=0;j<map[i].length;j++) {
				for(int k=0;k<map[i][j].length;k++) {
					System.out.print(map[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public int bfs(int[][][] map) {
		while(!q.isEmpty()) {
			Tomato t = q.poll();
			int x = t.x;
			int y = t.y;
			int z = t.z;
			// Case 1. 상 
			if(x-1>=0 && map[z][x-1][y] == 0) {
				q.add(new Tomato(x-1, y, z));
				map[z][x-1][y] = map[z][x][y] + 1;
			}
			// Case 2. 하 
			if(x+1<map[z].length && map[z][x+1][y] == 0) {
				q.add(new Tomato(x+1, y, z));
				map[z][x+1][y] = map[z][x][y] + 1;
			// Case 3. 좌 
			}if(y-1>=0 && map[z][x][y-1] == 0) {
				q.add(new Tomato(x, y-1, z));
				map[z][x][y-1] = map[z][x][y] + 1;
			}
			// Case 4. 우 
			if(y+1<map[z][x].length && map[z][x][y+1] == 0) {
				q.add(new Tomato(x, y+1,z));
				map[z][x][y+1] = map[z][x][y] + 1;
			}
			// Case 5. 위 
			if(z-1>=0 && map[z-1][x][y] == 0) {
				q.add(new Tomato(x, y, z-1));
				map[z-1][x][y] = map[z][x][y] + 1;
			}
			// Case 6. 아래 
			if(z+1<map.length && map[z+1][x][y] == 0) {
				q.add(new Tomato(x, y, z+1));
				map[z+1][x][y] = map[z][x][y] + 1;
			}
		}
//		this.print(map);
		return this.getDay(map);
	}
	public int getDay(int[][][] map) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				for(int k=0;k<map[i][j].length;k++) {	
					if(map[i][j][k] == 0) {
					return -1;
					}
					if(map[i][j][k] > max) {
						max =  map[i][j][k];
					}
				}
			}
		}
		if(max == 1) {
			return 0;
		}
		return max-1;
	}
}
