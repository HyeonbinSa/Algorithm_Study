package algorithm.programmers2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortFileName {
	// 1. Head 부분 사전순으로 정렬 (대소문자 구분 x)
	// 2. 숫자순으로 정
	public String[] solution(String[] files) {
        int size = files.length;
        String[] answer = new String[size] ;
//        HashMap<Integer, String[]> hm = new HashMap<Integer, String[]>();
        ArrayList<String[]> list = new ArrayList<String[]>();
        String[] head = new String[size];
        String[] number = new String[size];
        String[] tail = new String[size];
        String fileName;
        for(int i=0; i<size; i++) {
        	fileName = files[i];
        	list.add(this.splitStr(fileName));
        }
        Collections.sort(list, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				int result = o1[0].toLowerCase().compareTo(o2[0].toLowerCase());
				if(result == 0) {
					result = Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
				}
				return result;
			}
        	
        });
//        System.out.println(hm.get(0)[0]);
//        System.out.println(list.get(0)[1]);
        for(int i=0;i<list.size();i++) {
        	answer[i] = list.get(i)[0] + list.get(i)[1] +list.get(i)[2];
        	System.out.println(answer[i]);
        }
        return answer;
    }
	public String[] splitStr(String fileName) {
		String[] result = new String[3];
		boolean flag = false;
		int startIdx=0; // 숫자 시작점 
		int endIdx=0; // 숫자 끝점 
		for(int i=0; i<fileName.length();i++) {
			// 숫자일 때 
			if(!flag && fileName.charAt(i) >= '0' && fileName.charAt(i) <= '9') {
				startIdx = i;
				flag = true;
			}else if(flag){
				if(fileName.charAt(i) >= '0' && fileName.charAt(i) <= '9'){
					continue;
				}else {
					endIdx = i;
					break;
				}
			}
		}
		result[0] = fileName.substring(0, startIdx);
		// 숫자가 마지막글자일 경우 
		if(endIdx == 0) {
			result[1] = fileName.substring(startIdx);
			result[2] = "";
		}else {
			result[1] = fileName.substring(startIdx, endIdx);
			result[2] = fileName.substring(endIdx);
		}
		return result;
	}
}
