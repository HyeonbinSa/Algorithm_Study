package algorithm.programmers;

public class MutualEvaluation {
	
	// 상호 평가 점수 중 본인이 준 점수가 가장 높을 경우 제외하고 평균.
	public String solution(int[][] scores) {
        String answer = "";
        int size = scores[0].length;
        double avg;
        for(int i=0;i<size;i++) {
        	avg = this.getAverage(i, scores);
        	System.out.println(avg);
        	answer += this.getGrade(avg);
        }
        return answer;
    }
	
	// 학생 번호와 해당 학생의 저수 
	public double getAverage(int num, int[][] score) {
		int size = score.length;
		// 최고점 
		int max = 0;
		int max_idx = -1;
		int maxCount = 0;
		// 최저점 
		int min = 101;
		int min_idx= -1;
		int minCount = 0;
		// 합계
		int sum = 0;
		
		for(int i=0; i<size;i++) {
			sum += score[i][num];
			if(max < score[i][num]){
				max = score[i][num];
				max_idx = i;
			}
			if(min > score[i][num]) {
				min = score[i][num];
				min_idx = i;
			}
		}
		for(int i=0; i<size;i++) {
			if(score[i][num] == max) {
				maxCount++;
			}
			if(score[i][num] == min) {
				minCount++;
			}
		}
		if(max_idx == num && maxCount == 1) {
			sum -= max;
			size -= 1;
		}
		if(min_idx == num && minCount == 1) {
			sum -= min;
			size -= 1;
		}
		return (double)sum/(double)size;
	}
	public String getGrade(double score) {
		if(score >= 90) {
			return "A";
		}else if(score >= 80) {
			return "B";
		}else if(score >= 70) {
			return "C";
		}else if(score >= 50) {
			return "D";
		}else {
			return "F";
		}
	}
}
