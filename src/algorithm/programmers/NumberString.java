package algorithm.programmers;


// Clear
public class NumberString {
	public int solution(String s) {
        String answer = "";
        String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int size = s.length();
        char c ;
        String str = "";
        for(int i=0; i<size; i++) {
        	c = s.charAt(i);
        	if(c >= '0' && c <= '9') {
        		answer += c;
        	}else {
        		str += c;
        		// 영단어와 비교해서 숫자 Return 해주는 함수 
        		if(this.changeNumber(word, str) != -1) {
        			answer += this.changeNumber(word, str);
        			str = "";
        		}else {
        			
        		}
        	}
        }
        
        return Integer.parseInt(answer);
    }
	
	public int changeNumber(String[] word, String str) {
		int idx = -1;
		for(int i=0; i<word.length;i++) {
			if(str.equals(word[i])){
				idx = i;
				break;
			}
		}
		return idx;
	}
}
