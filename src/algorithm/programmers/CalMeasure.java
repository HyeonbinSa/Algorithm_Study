package algorithm.programmers;

public class CalMeasure {
	// left <= right 사이의 수 중 
	// 약수의 개수가 짝수이면 더하고
	// 약수의 개수가 홀수이면 빼고 
	
	public int solution(int left, int right) {
        int answer = 0;
        for(int number=left; number<=right;number++) {
        	if(this.check(number))
        		answer += number;
        	else
        		answer -= number;
        }
        return answer;
    }
	
	public boolean check(int n) {
		int sqrt = (int)Math.sqrt(n);
		if(sqrt*sqrt == n) {
			return false;
		}else {
			return true;
		}
		
	}
	// 1. 약수의 개수를 판단하여 Boolean 값을 리턴해주는 함수
	// 1.1 숫자를 Math.sqrt를 이용하여 for문을 돌려 약수의 개수 찾기
	// 2. 약수의 개수를 판단하여 얻은 Boolean의 값을 통해 1, -1 곱하여 계산
	// 2.1 sum이란 변수를 만들어 for문을 통해 갑 계산 
}
