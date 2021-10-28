package algorithm.programmers2;

public class JoyStick {
	// 기본 AAA 
	// 최소 이동으로 원하는 숫자 
	public int solution(String name) {
        int answer = 0;
//        System.out.println(this.changeChar('W'));
        char c;
        // 1. 각 문자별 이동횟수 
        for(int i=0;i<name.length();i++) {
        	c = name.charAt(i);
        	System.out.print(this.changeChar(c)+" ");
        	answer += this.changeChar(c);
        }
        
        // 2. 좌우 이동 거리 계산
        
        System.out.println(answer);
        return answer;
    }
	public int changeChar(char alpha) {
		int down = 'Z' - alpha + 1;
		int up = alpha - 'A';
		if(up>=down) {
			return down;
		}else {
			return up;
		}
	}
}
