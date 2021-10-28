package algorithm.programmers2;

import java.util.ArrayList;

// 끝말잇기
public class EndToEnd {
	// n : 참여자 수 
	// words : 끝말잇기 단어 배열 
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<String>();
        char endWord = ' ';
        int leave = -1;
        for(int i=0;i<words.length;i++) {
        	if(i==0) {
        		endWord = words[i].charAt(words[i].length()-1);
        	}else {
        		if(endWord == words[i].charAt(0)) {
        			endWord = words[i].charAt(words[i].length()-1);
        		}else {
        			leave = i;
        			break;
        		}
        	}
        	if(list.indexOf(words[i]) != -1) {
        		leave = i;
        		break;
        	}else {
        		list.add(words[i]);
        	}
        }
        if(leave == -1) {
        	answer[0] = 0;
        	answer[1] = 0;
        }else { 
        	// 3번째 걸렸는데 사람은 2명. 
        	leave += 1;
        	System.out.println(leave);
        	if(leave%n == 0) {
        		answer[0] = n;
        		answer[1] = leave/n;
        	}else {
        		answer[0] = leave%n;
        		answer[1] = leave/n+1;
        	}
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
}
