package algorithm.boj.array;

import java.util.Scanner;

public class Q4344 {
	public void  solution() {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		// 1. Test Case만큼 반복 
		for(int tCase=0;tCase<N;tCase++){
			int num  = sc.nextInt();  // 학생 수
			int[] point = new int[num];
			double avg = 0;
			int count = 0; // 평균보다 점수가 높은 학생 수 
			// 2. 배열에 학생 점수 저장 및 합계 
			for(int i=0;i<num;i++) {
				point[i] = sc.nextInt();
				avg += point[i];
			}
			// 3. 평균 계산 
			avg /= (double)num;
			System.out.println(avg);
			// 4. 평균보다 높은 학생 수 체크 
			for(int i=0;i<num;i++) {
				if(point[i] >  avg) {
					count++;
				}
			}
			String result = String.format("%.3f", (double)count/(double)num*100.0);
			System.out.println(result+"%");
		}
	}
}
