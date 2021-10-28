package algorithm.programmers;

// Clear
public class MakeDecimal {
	public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length;
        int num = 0;
        int count = 0;
        for(int i=0;i<size-2;i++) {
        	for(int j=i+1;j<size-1;j++) {
        		for(int k=j+1;k<size;k++) {
                	num = nums[i] + nums[j] + nums[k];
                	System.out.println("num = " + num +" : " +nums[i] +", "+ nums[j] +", "+ nums[k]);
                	if(this.check(num)) {
                		count++;
                	}
                }
            }
        }
        if(count != 0) {
        	answer = count;
        }
        System.out.println(answer);
        return answer;
    }
	// 소수인제 체크하는 함수 
	public boolean  check(int num) {
		// 
		int sqrt = (int)Math.sqrt(num);
		if(sqrt*sqrt == num) {
			return false; // 소수가 아님. 
		}
		for(int i=2;i<=sqrt;i++) {
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
}
