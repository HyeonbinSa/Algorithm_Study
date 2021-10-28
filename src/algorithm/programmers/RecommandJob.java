package algorithm.programmers;

public class RecommandJob {
	public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        
        int col = table.length;
        int row = table[0].length() - 1;
        
        // 직군별 점수 담은 배열
        int[] calcJobPoint = new int[col];
        // 직군 이름 담은  배열 
        String[] jobName = new String[col];
        
        for(int i=0; i<col;i++) {
        	jobName[i] = this.getJobName(table[i]);
        	calcJobPoint[i] = this.calcPoint(table[i], languages, preference);
        }
        answer = this.getBestJob(jobName, calcJobPoint, col);
        return answer;
    }
	// 직군별 이름 가져오기
	public String getJobName(String table) {
		String[] arr = table.split(" ");
		return arr[0];
	}
	// 직군별 점수 계산 
	public int calcPoint(String table, String[] languages, int[] preference) {
		String[] points = table.split(" ");
		int languagesSize = languages.length;
		int tableSize = points.length;
		String lang;
		int point;
		int sum = 0;
		for(int i=0; i<languagesSize;i++) {
			lang = languages[i];
			for(int j=1; j<tableSize;j++) {
				if(lang.equals(points[j])) {
					point = 6-j;
					sum += point*preference[i];
					break;
				}
			}
		}
		return sum;
	}
	
	// 직군별  점수를 통한 최대값 찾는 함수
	public String getBestJob(String[] jobName, int[] calcJobPoint, int size){
		int max = 0;
		int max_idx = 0;
		for(int i=0;i<size;i++) {
			if(max < calcJobPoint[i]) {
				max = calcJobPoint[i];
				max_idx = i;
			}else if (max == calcJobPoint[i]) {
				if(jobName[i].compareTo(jobName[max_idx])<0) {
					max_idx = i;
					max = calcJobPoint[i];
				}
			}
		}
		return jobName[max_idx];
	}
}
