package algorithm.programmers2;

public class Jumper {
	// K 칸 점프 or 순간이동 
	// K 칸 점프 시 건전지 사용량 K
	// 순간이동은 건전지 X (현재까지 이동거리의 2배) 
	public int solution(int n) {
        int ans = 0;
        
        while(n > 0) {
        	if(n%2 == 1) {
        		ans++;
        	}
        	n /= 2;
        }
        System.out.println(ans);
        return ans;
    }
}
// 6/2 = 3 
// 3/2 = 1 ... 1
// 1/2 = 0 ... 1
// 5000/2 = 2500
// 2500/2 = 1250
// 1250/2 = 625
// 625/2 = 312   ...  1
// 312/2 = 156 
// 156/2 = 78 
// 78/2 = 39 
// 39/2 = 19 ... 1
// 19/2 = 9 ... 1
// 9/2 = 4 ... 1
// 4/2 = 2 
// 2/2 = 1 