package algorithm.boj.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Location{
	int x;
	int y;
	Location(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Q2178 {
	
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] map = new int[N][M];
		int[][] visited = new int[N][M];
		// 1.미로 입력 
		for(int x=0; x<N;x++) {
			String str =  sc.next();
			String[] strArr = str.split("");
			for(int y=0;  y<M; y++) {
				map[x][y] =  Integer.parseInt(strArr[y]);
			}
		}
		this.bfs(map, visited);
	}
	public void print(int[][] map) {
		for(int x=0; x<map.length;x++) {
			for(int y=0;  y<map[x].length; y++) {
				System.out.print(map[x][y]);
			}
			System.out.println();
		}
	}
	public void bfs(int[][] map, int[][] visited) {
		Queue<Location> q = new LinkedList<>();
		q.add(new Location(0,0));
		visited[0][0] = 1;
		while(!q.isEmpty()) {
			Location l = q.poll();
			int x = l.x;
			int y = l.y;
			// 1. 상 
			if(x-1>=0 && map[x-1][y] == 1 && visited[x-1][y] == 0) {
				q.add(new Location(x-1, y));
				visited[x-1][y] = visited[x][y]+1;
			}
			// 2. 하 
			if(x+1<map.length && map[x+1][y] == 1 && visited[x+1][y] == 0) {
				q.add(new Location(x+1, y));
				visited[x+1][y] = visited[x][y]+1;;
			}
			// 3. 좌
			if(y-1>=0 && map[x][y-1] == 1 && visited[x][y-1] == 0) {
				q.add(new Location(x, y-1));
				visited[x][y-1] = visited[x][y]+1;;
			}
			// 4. 우 
			if(y+1<map[x].length && map[x][y+1] == 1 && visited[x][y+1] == 0) {
				q.add(new Location(x, y+1));
				visited[x][y+1] = visited[x][y]+1;;
			}
		}
//		this.print(visited);	
		int x = visited.length-1;
		int y = visited[x].length -1;
		System.out.println(visited[x][y]);

	}
}
