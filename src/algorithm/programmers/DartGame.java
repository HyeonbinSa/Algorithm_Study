package algorithm.programmers;

// [1차] 다트 게임 
public class DartGame {
	// 규칙
	// 1. 총 3번의 기회
	// 2. 점수는 0 ~ 10점 획득 가능
	// 3. S = 1제곱, D = 2제곱, T = 3제곱 
	// 4. 옵션 *(스타상) = 해당 점수, 바로전 점수 2배 , # (아차상) = 해당 점수 마이너스
	// 5. * 스타상 중첩 가능 (4배)
	// 6. # 아차상 중첩 가능  (-2배)
	public int solution(String dartResult) {
        int answer = 0;
        String[] arr = dartResult.split("");
        int[] point = new int[3];
        char[] bonus = new char[3];
        char[] option = new char[3];
        int pc = 0;
        int bc = 0;
        int oc = 0;
        int calc = 0;
        char c = 0;
        for(int i=0; i<arr.length;i++) {
        	c = dartResult.charAt(i);
        	//  점수 / 제곱 / 옵션 확인 
        	// 1. 점수 
        	// 1.1 0~9 
        	if(c>='0' && c<='9') {
        		// 1.1.1 10점인 경우 
        		if(c=='1' && dartResult.charAt(i+1) == '0') {
        			calc = 10;
        			i += 1;
        		// 1.1.2 10 점이 아닌 경우 	
        		}else {
        			calc = (int)c - 48;
        		}
        		// 이전 회차에 option이 없는 경우 
        		if(pc != 0) {
        			oc++;
        		}
        		point[pc++] = calc;
        	// 보너스 점수 저장 	
        	}else if(c == 'S' || c == 'D' || c == 'T'){
        		bonus[bc++] = c;
        	// 옵션 값 저장 
        	}else {
        		option[oc] = c;
        	}
        }
        for(int i=0;i<3;i++) {
        	System.out.println("point : " + point[i]);
        	System.out.println("bonus : " + bonus[i]);
        	System.out.println("option : " + option[i]);
        }
        this.calc(point, bonus, option);
        return answer;
    }
	public int calc(int[] point, char[] bonus, char[] option) {
		for(int i=0;i<3;i++) {
			if(bonus[i] == 'T') {
				point[i] = point[i] * point[i] * point[i];
			}else if(bonus[i] == 'D') {
				point[i] = point[i] * point[i];
			}
			
			if(option[i] == '*') {
				if(i!=0) {
					point[i-1] *= 2;
				}
				point[i] *= 2;
			}else if(option[i] == '#') {
				point[i] *= -1;
			}
		}
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum += point[i];
		}
		System.out.println(sum);
		return sum;

	}
}
