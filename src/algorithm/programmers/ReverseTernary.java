package algorithm.programmers;

import java.util.ArrayList;

public class ReverseTernary {
	public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        while(n>0) {
        	a.add(n%3);
        	n /= 3;
        }
        System.out.println(a);
        int size = a.size();
        int sq = 1;
        
        for(int i=size-1;i>=0;i--) {
        	answer += a.get(i)*sq;
        	sq *= 3;
        }
        System.out.println(answer);
        return answer;
    }
}
