package algorithm.programmers3;

import java.util.LinkedList;
import java.util.Queue;

public class Network {
	static  boolean[] visited;
	public int solution(int n, int[][] computers) {
        /*
         * 1 1 0
         * 1 1 0
         * 0 0 1
         */
		int answer = 0;
		visited = new boolean[computers.length];
        for(int i=0;i<visited.length;i++) {
        	if(visited[i] == false) {
        		bfs(computers, i);
        		answer++;
        	}
        }
        System.out.println(answer);
        return answer;
    }
	public void bfs(int[][] computers, int num) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(num);
		visited[num] = true;
		while(!q.isEmpty()) {
			int idx = q.poll();
			for(int i=0;i<computers[idx].length;i++) {
				if(i != idx && computers[idx][i]==1 && visited[i] == false) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}
}
