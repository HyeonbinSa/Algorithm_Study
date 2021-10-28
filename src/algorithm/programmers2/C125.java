package algorithm.programmers2;

public class C125 {
	public String solution(int n) {
        String answer = "";
        int[] str =  {4,1,2};
        while(n>0) {
            answer += str[n%3];
            n = n/3;
        }
        System.out.println(answer);
        return answer;
    }
	
}
