package algorithm.programmers2;

import java.util.ArrayList;

// 방문 길이 
public class GetDistance {
	class Point{
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	// 10x10의 배열에서 5.5가 시작점 
	public int solution(String dirs) {
        int answer = 0;
        Point currentPoint = new Point(0,0);
        ArrayList<String> list = new ArrayList<String>();
        
        String point = "";
        String prePoint = "00";
        for(String dir : dirs.split("")) {
        	if(!point.equals("")) {
        		prePoint = point;
        	}
        	if(dir.equals("U")) {
        		if(currentPoint.y >=5 || currentPoint.x >5 || currentPoint.x < -5 ) {
        			continue;
        		}
        		currentPoint.y += 1;
        	}else if(dir.equals("D")) {
        		if(currentPoint.y <= 5 || currentPoint.x >5 || currentPoint.x < -5 ) {
        			continue;
        		}
        		currentPoint.y -= 1;
        	}else if(dir.equals("L")) {
        		if(currentPoint.y < -5 || currentPoint.y > 5 || currentPoint.x <= -5 ) {
        			continue;
        		}
        		currentPoint.x -= 1;
        	}else if(dir.equals("R")) {
        		if(currentPoint.y > 5 || currentPoint.y < -5 || currentPoint.x >= 5 ) {
        			continue;
        		}
        		currentPoint.x += 1;
        	}
        	
        	point = currentPoint.x+ "" + currentPoint.y;
        	System.out.println("point : "+ point +", pre : " + prePoint);
        	// 지난적이 있는 점일 경우 
        	int idx = list.indexOf(point);
	        if(idx != -1 && idx > 0) {	
	    		// 지나간 출발지  목적지가  모두 같을 때 
	    		if(list.get(idx-1).equals(prePoint)) {
        			continue;
        		}
        	}
        	list.add(point);
        }
        System.out.println(list);
        return answer;
    }
}
