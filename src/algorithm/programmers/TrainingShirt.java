package algorithm.programmers;

public class TrainingShirt {
	// 바로 앞 or 바로 뒤 학생에게만 체육복을 빌려줄 수 있음, i = 3 -> 2 or 4
	// 전체 학생의 수 : n
	// 도난 학생의 배열 : lost
	// 여벌 체육복 배열 : reserve 
	// 최대 수업을 들을 수 있는 학생의 수 
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 체육복 개수 배열 
        int[] student = new int[n];
        // 잃어버린 사람 체크 
        for(int i=0;i<lost.length;i++) {
        	student[lost[i] -1] -= 1;
        }
        // 여분 있는 사람 체크 
        for(int i=0;i<reserve.length;i++) {
        	student[reserve[i] -1] += 1;
        }
        //printtest(student);
        for(int i=0;i<n;i++) {
        	// 기준 : 분실 or 여분
            // 분실한 학생일 경우 
        	if(student[i]<0) {
        		// // 뒤에 있는 학생이 여분이 있을 때 
                // 17,18,19,20 실패 
        		// if(i+1<n && student[i+1]>0) {
        		// 	student[i] += 1;
        		// 	student[i+1] -= 1;
        		// // 앞에 있는 학생이 여분이 있을 때 
        		// }else if(i-1>= 0 && student[i-1]>0) {
        		// 	student[i] += 1;
        		// 	student[i-1] -= 1;
        		//}
                
                // 앞에 있는 학생이 여분이 있을 때 
                if(i-1>= 0 && student[i-1]>0) {
                    student[i] += 1;
                    student[i-1] -= 1;
                }// 뒤에 있는 학생이 여분이 있을 때 
                else if(i+1<n && student[i+1]>0) {
                    student[i] += 1;
                    student[i+1] -= 1;
                }
            }
        }
        //printtest(student);
        for(int i=0;i<n;i++) {
        	if(student[i]>=0) {
        		answer++;
        	}
        }
        return answer;
    }
	
	public void printtest(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ ", ");
		}
		System.out.println("");
	}
}

// 2, 4에 1,3,5 
// 0 or 2에 빌려줌
// 2 or 4에 빌려줌
// 4 or 6에 빌려줌.