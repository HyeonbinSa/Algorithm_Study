package algorithm.boj.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1697 {
	
	static int visited[];
	public void solution() {
		/**
		 * 수빈의 위치 : N
		 * 동생의 위치 : K  
		 * 이동 방식 : 걷기 or 순간이동 
		 *    - 걷기 : x-1 or x+1 
		 *    - 순간이동 : 2*x
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		visited = new int[100001];
		bfs(N, K);
		System.out.println(visited[K]);
		
	}
	
	public void bfs(int start, int destination) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		while(!q.isEmpty()) {
			int position = q.poll();
			if(position == destination) {
				break;
			}
			if(position-1>=0 && visited[position-1]==0) {
				q.add(position-1);
				visited[position-1] = visited[position]+1;
			}
			if(position+1<visited.length  &&  visited[position+1]==0) {
				q.add(position+1);
				visited[position+1] = visited[position]+1;
			}
			if(position*2 <= 100000  && visited[position*2] == 0 ) {
				q.add(position*2);
				visited[position*2] = visited[position]+1;
			}
			
			
		}
		
	}
	
}
