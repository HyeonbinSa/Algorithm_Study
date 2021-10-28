package algorithm.programmers;

// 최소 직사각형
public class MinimumRactangle {
	// 모든 명함을 담을 수 있는 사이즈 
	public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        int w = 0;
        int h = 0;
        for(int i=0; i<sizes.length;i++) {
        	w = sizes[i][0];
        	h = sizes[i][1];
        	if(w < h) {
        		if(maxWidth < h) {
        			maxWidth = h;
        		}
        		if(maxHeight < w) {
        			maxHeight = w;
        		}
        	}else {
        		if(maxWidth < w) {
        			maxWidth = w;
        		}
        		if(maxHeight < h) {
        			maxHeight = h;
        		}
        	}
        }
        answer = maxHeight * maxWidth;
        return answer;
    }
}
