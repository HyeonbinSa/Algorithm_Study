package algorithm.programmers;

import java.util.ArrayList;

// 키패드 누르기 
public class Keypad {
	// hand : "left", "right"
	// 거리가 같은경우 hand에 따라 다름. 
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        String tmp = "";
        int leftDist = 0;
        int rightDist = 0;
        for(int num : numbers) {
        	if(num == 0) {
        		num = 11;
        	}
        	System.out.println("L : " + left +", R : "+ right + ", num : "+ num);
        	// Case 1 : 왼손 버튼 
        	if(num == 1 || num == 4 || num == 7) {
        		left = num;
        		tmp = "L";
        	}
        	// Case 2 : 오른손 버튼 
        	else if(num == 3 || num == 6 || num == 9) {
        		right = num;
        		tmp = "R";
        	// Case 3 : 중간 버튼
        	}else {
        		if(left == 2 || left == 5 || left == 8 || left == 11) {
        			leftDist = Math.abs((num-(left))/3);
        		}else {
        			leftDist = Math.abs((num-(left+1))/3)  + 1;
        		}
        		
        		if(right == 2 || right == 5 || right == 8 || right == 11) {
        			rightDist = Math.abs((num-(right))/3);
        		}else {
        			rightDist = Math.abs((num-(right-1))/3) + 1;
        		}
        		System.out.println("rd : "+rightDist + ", ld : "+ leftDist);
    			// 왼쪽이 더 멀 경우 
    			if(leftDist > rightDist){
    				right = num;
    				tmp = "R";
    			// 오른쪽이 더 경우 
    			}else  if(leftDist < rightDist) {
    				left = num;
    				tmp = "L";
    			}else {
    				if(hand.equals("left")){
    					left = num;
        				tmp = "L";
    				}
        			else {
        				right = num;
        				tmp =  "R";
        			}
    			}
        	}

        	answer += tmp;
        	System.out.println("answer = " +answer);
        }
        System.out.println(answer);
        return answer;
    }
}
