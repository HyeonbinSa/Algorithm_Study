package algorithm.programmers2;

import java.util.ArrayList;

public class RemoveSame {
	public int solution(String s)
    {
        int answer = 0;
        ArrayList<String> stack = new ArrayList<String>();
        for(String tmp : s.split("")) {
        	if(stack.isEmpty()) {
        		stack.add(tmp);
        	}else {
        		if(stack.get(stack.size()-1).equals(tmp)) {
        			stack.remove(stack.size()-1);
        		}else {
        			stack.add(tmp);
        		}
        	}
        }
        if(stack.isEmpty()) {
        	answer = 1;
        }
        return answer;
    }
}
