package algorithm.programmers2;

public class BiggiestRactangle {
	public int solution(int [][]board)
    {
        int answer = 0;
        int max = 0;
        int row = board.length;
        int col = board[0].length;
        
        if(row == 1) {
        	return 1;
        }
        for(int i=1;i<row;i++) {
        	for(int j=1;j<col;j++) {
        		int min = Integer.MAX_VALUE;
        		if(board[i-1][j-1] < min)
        			min = board[i-1][j-1];
        		if(board[i-1][j] < min)
        			min = board[i-1][j];
        		if(board[i][j-1] < min)
        			min = board[i][j-1];
        		System.out.println("대각 : "+ board[i-1][j-1] +", 왼  : "+board[i][j-1] +", 위  : " +board[i-1][j] +", 최소 :  " +min+ " ");
        		if(board[i][j] != 0) {
        			board[i][j] = min+1;
        		}
        		if(board[i][j] > max) {
        			max = board[i][j];
        		}
        	}
        }
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		System.out.print(board[i][j] + ", ");
        	}
        	System.out.println();
        }
        answer = max * max;
        System.out.println(answer);
        return answer;
    }
}
