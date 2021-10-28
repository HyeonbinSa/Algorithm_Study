package algorithm.programmers3;

public class WordChange {
	public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        return answer;
    }
	// 2개의 문자열 비교하는 메소드 
	public boolean wordCheck(String s1, String s2) {
		int count = 0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}else {
			return false;
		}
	}
	public void bfs(String begin, String[] words) {
		
	}
}
