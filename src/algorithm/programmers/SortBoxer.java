package algorithm.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class SortBoxer {
	// 몸무게 weights 
	// 전적 head2head 
	// 정렬 순서
	// 1. 전체 승률이 높은 복서가 앞쪽으로, 전적없는 복서 0%
	// 2. 승률이 동일할 경우 자신보다 무거운 복서를 이긴횟수가 많은 복서가 앞
	// 3. 그래도 동일하면 자신의 무게가 더 무거운 복서가 앞 
	// 4. 무게까지 같다면 작은 번호가 앞으로 
	public int[] solution(int[] weights, String[] head2head) {
		int size = weights.length; // 인원수 
		int[] answer =  new int[size];
		int[][] boxer = new int[size][4];
		
		String[] match;
		int winCount; // 이긴 경기수 
		int count; // 안한 경기수 
		int winBigger; //무거운 사람 이긴 수 
		for(int i=0;i<size;i++) {
			match = head2head[i].split(""); // Boxer의 경기 내용 
			winCount = 0;
			count = 0;
			winBigger = 0;
			for(int j=0;j<match.length;j++) {
				if(i==j) { // 동일 복서의 경기 (무시)
					continue;
				}else { // 다른 복서와의 경기 
					if(match[j].equals("W")) { // 이겼을 경우 
						winCount++;
						if(weights[i] < weights[j]) { // 무거운 사람 이긴 경우 
							winBigger++;
						}
					}
					if(!match[j].equals("N")) { 
						count++;
					}
				}
			}
			// 경기수는 (match.length-1-nCount)
			
			boxer[i][0] = i+1; // 복서 번호 
			boxer[i][1] = weights[i]; // 복서 무게  
			if(count == match.length-1) {
				boxer[i][2] = 0;
			}else {
				boxer[i][2] = (int)(((double)winCount/(double)(count))*100000);
			}
			boxer[i][3] = winBigger;
		}
		Arrays.sort(boxer, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[2] != o2[2]) 
					return o2[2] - o1[2];
				if(o1[3] !=  o2[3])
					return o2[3] - o1[3];
				if(o1[1] != o2[1])
					return o1[1] - o2[1];
				return o1[0] - o2[0];
			}
			
		});
		for(int i=0;i<size;i++) {
			answer[i] = boxer[i][0];
		}
        return answer;
    }
}
