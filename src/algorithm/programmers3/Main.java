package algorithm.programmers3;

public class Main {
	public static void main(String[] args) {
		Network ne = new Network();
		int n =  3;
		int[][] computers =  {{1,1,0},{1,1,1},{0,1,1}};
		ne.solution(n, computers);
	}
}
