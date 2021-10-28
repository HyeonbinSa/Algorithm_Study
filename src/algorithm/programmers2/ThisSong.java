package algorithm.programmers2;

public class ThisSong {
	// 1. 기억하고 있는 멜로디 m 
	// 2. 방송된 곡의 정보 musicinfos
	// misicinfos는 각각의 곡의 시작 시각, 끝난시각, 음악제목, 악보 정보가 ','로 구분되어 담겨져있음
	// 
	public String solution(String m, String[] musicinfos) {
        String answer = "";
//        m = this.changeSharp(m);
        m = this.changeSharp(m);
        String str;
        boolean flag = false;
        int playTime = 0;
        // 1. 기억하고 있는 멜로디의 길이 
        for(int i=0; i<musicinfos.length;i++) {
        	str = this.splitMusic(musicinfos[i]);
        	if(str.indexOf(m) >= 0) {
        		if(flag) {
        			if(playTime < this.getTime(musicinfos[i])) {
        				answer = musicinfos[i].split(",")[2];
            			playTime = this.getTime(musicinfos[i]);
        			}
        		}else {
        			answer = musicinfos[i].split(",")[2];
        			playTime = this.getTime(musicinfos[i]);
        			flag = true;
        		}
        	}
        }
        if(answer.equals("")) {
        	answer = "(None)";
        }
        System.out.println("answer : " + answer);
        return answer;
    }
	public int getTime(String misicinfo) {
		int playTime;
		String[] info = misicinfo.split(",");
		int startHour = Integer.parseInt(info[0].substring(0, 2));
		int startMin = Integer.parseInt(info[0].substring(3));
		int endHour = Integer.parseInt(info[1].substring(0, 2));
		int endMin = Integer.parseInt(info[1].substring(3));
		if(endHour - startHour == 0) {
			playTime = endMin - startMin;
		}else {
			playTime = (endHour-startHour)*60 + (endMin - startMin);
		}
		return playTime;
	}
	public String splitMusic(String misicinfo) {
		String[] info = misicinfo.split(",");
		
		info[3] = this.changeSharp(info[3]);
		int play = this.getTime(misicinfo); // 재생 시간 
		
		String music = "";
		int index = 0;
		while(play>0) {
			music += info[3].charAt(index++);
			play--;
			if(index >= info[3].length()) {
				index = 0;
			}
		}
		return music;
	}
	public String changeSharp(String s) {
		String result = "";
		for(int i=0;i<s.length();i++) {
			if(i>0 && s.charAt(i) == '#') {
				if(result.length()-2 == 0) {
					result = result.substring(0, result.length()-1) + result.substring(result.length()-1).toLowerCase();
				}else {
					result = result.substring(0, result.length()-1) + result.substring(result.length()-1).toLowerCase();
				}
			}else {
				result += s.charAt(i);
			}
		}
		return result;
	}
}
