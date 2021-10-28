package algorithm.programmers2;

public class GetLand {
	int solution(int[][] land) {
        int answer = 0;
        int row = land.length;
        int col = land[0].length;
        this.dfs(0, 0, land);
        return answer;
    }
	// 1. 완전탐색 (DFS) 
	public void dfs(int start, int sum, int[][] land) {
		
	}
	
}
