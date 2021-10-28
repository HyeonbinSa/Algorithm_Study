package algorithm.programmers;

// [1차] 비밀지도 
public class SecretMap {
	// 1.공백 = " " / 벽 = "#"
	// 2. n*n 배
	// 3. arr1, arr2 는 이진값으로 지도의 벽을 나타냄 
	// 4. arr1 + arr2 지도를 겹쳐 지도를 만들기 
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String row1 = "";
        String row2 = "";
        String mergeRow = "";
        for(int i=0; i<n;i++) {
        	row1 = this.getMap(arr1[i], n);
        	row2 = this.getMap(arr2[i], n);
        	mergeRow = this.merge(row1, row2, n);
        	answer[i] = mergeRow;
        }
        
        return answer;
    }
	public String getMap(int number, int n) {
		String s = "";
		for(int i=0;i<n;i++) {
			if(number == 0) {
				s += " ";
			}
			else if(number%2==0) {
				s += " ";
				number /= 2;
			}else {
				s += "#";
				number /= 2;
			}
		}
		return s;
	}
	public String merge(String s1, String s2, int n) {
		String mergeS = "";
		for(int i=0;i<n;i++) {
			if(s1.charAt(i) == '#' || s2.charAt(i) == '#') {
				mergeS += "#";
			}
			else {
				mergeS += ' ';
			}
		}
		StringBuilder strb = new StringBuilder(mergeS);
		mergeS = strb.reverse().toString();
		return mergeS;
	}
}
