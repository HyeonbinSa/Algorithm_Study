package algorithm.section1;


// 재풀이 필요 ( 실패) 
public class NQeens {
	
	
	public static void main(String[] args) {
		/* [0,0,0,0,0,0,0,0]
		 * cols[index] = queen의 위치 
		 * 
		 */
		int N = 4;
		int[] cols = new int[N];
		
		queens(cols, 0, N);
	}
	
	public static Boolean queens(int[] cols, int level, int N) {
		/*
		 * [0,0,0,0,0,0,0,0] 과 0 이 들어
		 */
		if(!check(cols, level, N)) {
			return false;
		}else if(level == N-1) {
			System.out.println("마지막 level");
			return true;
		}
		for(int i=0;i<N;i++) {
			cols[level] = i;
			System.out.println("cols["+level+"] : " + i);
			if(queens(cols, level+1, N)) {
				return true;
			}
		}
		System.out.println("통과");
		return false;
	}
	private static boolean check(int[] cols, int level, int N) {
		for(int i=0; i<level;i++) {
			System.out.println("cols["+i+"] : "+cols[i] + " / cols["+level+"] : " + cols[level]);
			if(cols[i]  == cols[level]) {
				System.out.println("같은열 불가 ");
				return false;
			}
			if(cols[i]-level == cols[level]) {
				System.out.println("대각선 불가1 ");
				return false;
			}
			if(cols[i] == cols[level]+level) {
				System.out.println("대각선 불가2 ");
				return false;
			}
		}
		return true; 
	}

	public static void printCols(int[][] cols, int N) {
		
	}
}
