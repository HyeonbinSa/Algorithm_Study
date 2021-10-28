package algorithm.programmers2;

public class BracketChange {
	// 1. 균형잡힌 괄호 
    // >> 개수가 맞을 때
    // 2. 올바른 괄호 
    // >> 짝도 모두 맞을 때 
	// 3. '(' 와 ')'의 개수는 항상 같음. 
    public String solution(String p) {
        String answer = "";
        String u = "";
        String v = "";
        String[] tmp;
        // 1. 빈 문자열일 경우 빈 문자열 반환.
        if(p.equals("")){
            return answer;
        }else {
        // 2. 균형잡힌 u, v로 분리
        	tmp = this.getUV(p);
        	u = tmp[0];
        	v = tmp[1];
        }
        System.out.println("u : " + u);
        System.out.println("v : " + v);
        return answer;
    }
    public String[] getUV(String p) {
    	String[] result = new String[2];
    	result[0] = "";
    	result[1] = "";
    	int count = 0;
    	for(String s : p.split("")) {
    		if(!result[0].equals("") && count == 0) {
    			result[1] += s;
    		}else {
    			result[0] += s;
    			if(s.equals("(")) {
        			count++;
        		}else if(s.equals(")")){
        			count--;
        		}
    		}
    	}
    	return result;
    }
    /*
     *  1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다. 
		2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다.
		 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다. 
		3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
		  3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다. 
		4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다. 
		  4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다. 
		  4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다. 
		  4-3. ')'를 다시 붙입니다. 
		  4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다. 
		  4-5. 생성된 문자열을 반환합니다.
     */
}
