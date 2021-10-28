package algorithm.boj.dfs;

import java.util.Scanner;

public class Q1012 {
	private static int count = 0;
	public void solution() {
		Scanner sc = new Scanner(System.in);
		// 1. Test Case
		int tCase = sc.nextInt();
		// 2. 가로, 세로, 배추 개수 
		for(int i=0;i<tCase;i++) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			int num = sc.nextInt();
			int[][] map = new int[h][w];
			boolean[][] visited = new boolean[h][w];
			
			// 3. 배추 좌표 
			for(int j=0;j<num;j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[y][x] = 1;
			}
			this.count(map, visited);
			count = 0;
		}
	}
	
	
	// 4. 흰지렁이는 인접한 배추에서 이동할 수 있음.
	public void count(int[][] map, boolean[][] visited) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				if(map[i][j] == 1 && visited[i][j] == false) {
					count++;
					this.dfs(map, visited, i, j);
				}
			}
		}
		System.out.println(count);
	}
	
	// 5. 인접한 배추 체크 
	public void dfs(int[][] map, boolean[][] visited, int x, int y) {
		visited[x][y] = true;
		// Case 1. 상 
		if(x-1>=0 && map[x-1][y] == 1 && visited[x-1][y] == false) {
			dfs(map, visited, x-1, y);
		}
		// Case 2. 하
		if(x+1<map.length && map[x+1][y] == 1 && visited[x+1][y] == false) {
			dfs(map, visited, x+1, y);
		}
		// Case 3. 좌  
		if(y-1>=0 && map[x][y-1] == 1 && visited[x][y-1] == false) {
			dfs(map, visited, x, y-1);
		}
		// Case 4. 우  
		if(y+1<map[x].length && map[x][y+1] == 1 && visited[x][y+1] == false) {
			dfs(map, visited, x, y+1);
		}
	}
}
