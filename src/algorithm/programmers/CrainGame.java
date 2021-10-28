package algorithm.programmers;

import java.util.ArrayList;

public class CrainGame {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> stack = new ArrayList<Integer>();
        // 1. moves에서 나온 값 = col 값 
        // 2. 해당 col 값에서 가장 위에 있는 row의 값을 꺼내서 stack 넣음
        int poppedDoll;
        for(int pop : moves) {
        	// col 값은 pop-1
        	int row = this.getRow(board, pop-1);
        	// Case 1 : 해당 칸에 인형이 없을 경우 
        	if(row == -1) {
        		continue;
        	// Case 2 : 해당 칸에 인형이 있을 경우 
        	}else {
        		poppedDoll = board[row][pop-1];
        		// Case 2-1 : 바구닉가  비어있을 경우 
        		if(stack.isEmpty()) {
        			stack.add(poppedDoll);
        		}
        		// Case 2-2 : 꺼낸 인형이 바구니 맨위에 있을 경우 
        		else if(stack.get(stack.size()-1) == poppedDoll) {
        			answer += 2;
        			stack.remove(stack.size()-1);
        		}
        		// Case 2-3 : 꺼낸 인형이 바구니 맨위에 없을 경우 
        		else {
        			stack.add(poppedDoll);
        		}
        		board[row][pop-1] = 0;
        	}
        }
        System.out.println(answer);
        return answer;
    }
	
	public int getRow(int[][] board, int col) {
		for(int i=0;i<board.length;i++) {
			if(board[i][col] != 0) {
				return i;
			}
		}
		return -1;
	}
}
