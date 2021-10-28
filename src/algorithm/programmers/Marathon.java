package algorithm.programmers;

import java.util.HashMap;

public class Marathon {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> people =new HashMap<String, Integer>();
        for(int i=0; i<participant.length;i++) {
        	// Case 1 : 동명이인이 없을 경우
        	if(people.get(participant[i]) == null) {
        		people.put(participant[i], 1);
        	}
        	// Case 2 : 동명이인이 있을 경우 
        	else {
        		people.put(participant[i], people.get(participant[i])+1);
        	}
        }
        for(int j=0; j<completion.length;j++) {
        	people.put(completion[j], people.get(completion[j]) - 1);
        }
        for(int i=0; i<participant.length;i++) {
        	if(people.get(participant[i]) != 0) {
        		answer = participant[i];
        		break;
        	}
        }
        return answer;
    }
}
