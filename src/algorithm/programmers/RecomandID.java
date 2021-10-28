package algorithm.programmers;

// 신규 아이디 추천 
public class RecomandID {
	// 규칙 1. 3~15자 
	// 규칙 2. 소문자 알파벳, 숫자, -, _, .  사용 가능
	// 규칙 3. "." 은 연속사용이 불가능하며 처음과 끝에 사용할 수 없음.
	
	/*
	 * 처리과정
	 * 1. 대문자 -> 소문자
	 * 2. 규칙 2에 해당하지 않는 값 제거
	 * 3. "."이 연속일 경우 하나로 치
	 * 4. "."이 처음과 끝에 있을 경우 제거 
	 * 5. 빈 문자열일 경우 "a"
	 * 6. 16자 이상일 경우 15자로 제거 (마지막이 "."일 경우 제거 )
	 * 7. 2자 이하일 경우 마지막 문자를 3이 될때까지 반복 
	 */
	public String solution(String new_id) {
        String answer = "";
        int size = new_id.length();
        char c;
        for(int i=0;i<size;i++) {
        	// 1단계 소문자로 치환 
        	c = Character.toLowerCase(new_id.charAt(i));
        	// 2단계 규칙 2
        	// 아스키 97~122 까지가 알파벳 소문자 
        	if(((int)c >= 48 && (int)c <= 57) ||((int)c >= 97 && (int)c <= 122) ||  c == '-' || c == '_' || c=='.') {
        		// 3단계 "."이 두번 연속 "." 일 경우 
        		// 4단계 처음이나 끝이 "." 일 경
        		if(c == '.') {
        			if(answer.length() == 0) {
        				continue;
        			}
        			if(i < size-1 && new_id.charAt(i+1) == '.') {
        				continue;
        			}
        			// 직전 값이 "."일 경우 
        			if(answer.charAt(answer.length()-1) == '.') {
        				continue;
        			}
        		}
        		answer += c;
        	}
        }
        
        if(answer.length() == 0) {
        	answer = "a";
        }
        if(answer.length() > 15) {
        	answer = answer.substring(0, 15);
        }
        answer = this.removeLastPoint(answer);
        if(answer.length() <=2) {
        	while(answer.length() <3) {
        		answer += answer.charAt(answer.length()-1);
        	}
        }
        System.out.println(answer);
        return answer;
    }
	public String removeLastPoint(String str) {
		int size = str.length();
		for(int i=size-1;i>=0;i--) {
    		if(str.charAt(i) == '.') {
    			str = str.substring(0, i);
    		}else {
    			break;
    		}
    	}
		return str;
	}
}
