package algorithm.programmers;

public class Lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int zeroCount = 0; //  0의 개수
        int winCount = 0;
        for(int i=0;i<6;i++){
            if(lottos[i] == 0){
                zeroCount++;
            }else{
                if(this.checkNumber(win_nums, lottos[i])){
                    winCount++;
                }else{
                    continue;
                }
            }
        }
        answer[0] = this.getRank(winCount);
        answer[1] = this.getRank(winCount + zeroCount);
        return answer;
    }
    public boolean checkNumber(int[] win_nums, int lotto){
        for(int i=0;i<6;i++){
            if(lotto == win_nums[i]){
                return true;
            }
        }
        return false;
    }
    public int getRank(int count) {
    	int rank;
    	switch(count) {
    		case 6: 
    			rank = 1;
    			break;
    		case 5: 
    			rank = 2;
    			break;
    		case 4: 
    			rank = 3;
    			break;
    		case 3: 
    			rank = 4;
    			break;
    		case 2: 
    			rank = 5;
    			break;
    		default :
    			rank = 6;
    		
    	}
    	return rank;
    }
}
