package algorithm.programmers2;

public class TargetNumber {
	static  int answer = 0;
	public int solution(int[] numbers, int target) {
        dfs(0,0,target,numbers);
        System.out.println(answer);
        return answer;
    }
	public void dfs(int level, int sum, int target, int[] numbers) {
		if(level == numbers.length && target == sum) {
			answer++;
			return;
		}else if (level == numbers.length) {
			return;
		}
		System.out.println("level : " + level + ", sum : " + sum);
		dfs(level+1, sum+numbers[level], target, numbers);
		dfs(level+1, sum-numbers[level], target, numbers);
	}
}
