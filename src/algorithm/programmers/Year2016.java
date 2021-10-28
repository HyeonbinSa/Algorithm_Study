package algorithm.programmers;

// Clear
// 2016년 
public class Year2016 {
	// 2016년 1월 1일 : 금요일 
	// 2016년 a월 b일 : ?요일 
	public String solution(int a, int b) {
        String answer = "";
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = {31, 29, 31, 30, 31,  30, 31, 31, 30, 31, 30, 31};
        int count = -1;
        // a=5 
        for(int i=0;i<a-1;i++) {
        	count += day[i];
        }
        count += b;
        System.out.println(count);
        count %= 7;
        System.out.println(count); // 4 
        answer = week[count];
        return answer;
    }
}
