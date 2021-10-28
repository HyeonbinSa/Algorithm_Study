package algorithm.section1;

public class Maze {
	
	public static void main(String[] args) {
		// n*n 미로
		int N = 8;
		int[][] maze = {
				{0,0,0,0,0,0,0,1},
				{0,1,1,0,1,1,0,1},
				{0,0,0,1,0,0,0,1},
				{0,1,0,0,1,1,0,0},
				{0,1,1,1,0,0,1,1},
				{0,1,0,0,0,1,0,1},
				{0,0,0,1,0,0,0,1},
				{0,1,1,1,0,1,0,0}};
		// x, y 
		boolean result = findPath(maze, 0, 0, N);
		System.out.println(result);
	}
	
	// 미로를 탈출할 수 있는 경로가 있으면 yes 없으면 no 인 문제 
	public static boolean findPath(int[][] maze, int x, int y, int N) {
		if(x < 0 || y < 0 || x >= N || y >= N) { // 범위를 벗어나는 크기 
			return false;
		}else if(maze[x][y] != 0) { // 경로가 아닐 경우 
			return false;
		}else if(x == N-1 && y == N-1) {
			maze[x][y] = 3;
			printMaze(maze, N);
			return true;
		}else {
			maze[x][y] = 3;
			if(findPath(maze, x-1, y, N) || findPath(maze, x, y+1, N) || findPath(maze, x+1, y, N) || findPath(maze, x, y-1, N)) {
				return true;
			}
			maze[x][y] = 2;
			return false;
		}
	}
	
	public static void printMaze(int[][] maze, int N) {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
	}
}

//  010-2887-8734 