package algorithm.programmers2;

import java.util.ArrayList;

public class Compression {
	public int[] solution(String msg) {
        int[] answer = {};
        ArrayList<Integer> result =  new ArrayList<Integer>();
        // 1. 사전 초기화 
        ArrayList<String> dic = new ArrayList<String>();
        dic.add("0");
        for(int i=1;i<=26;i++) {
        	char c = (char)(i+64);
        	dic.add(""+c);
        }
        System.out.println(dic);
        
        String str  = ""; 
        String w = "";
        String c = "";
        // 2. msg 반복문 돌면서 사전등록 
        for(int i=0;i<msg.length();i++) {
        	w += msg.charAt(i);
        	c += msg.charAt(i+1);
        	if(dic.indexOf(w)>=1) {
        		result.add(i);
        	}else {
        		dic.add(str);
        	}
        }
        return answer;
    }
	// 길이가 1인 모든 댠어를 포함하도록 사전 초기화 
	
}
