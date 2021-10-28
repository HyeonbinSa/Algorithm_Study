package algorithm.programmers2;

import java.util.ArrayList;


// Clear
public class NewsClustering {
	public int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> arr1 = this.getArr(str1);
        ArrayList<String> arr2 = this.getArr(str2);
        System.out.println("getArr :" + arr1);
        System.out.println("getArr :" + arr2);
        int inter = this.getIntersection(arr1, arr2);
        int union = this.getUnion(arr1, arr2);
        if(union == 0 && inter == 0) {
        	return 65536;
        }
        answer = (int)(((double)inter / (double)union)*65536);
        System.out.println(answer);
        return answer;
    }
	public ArrayList<String> getArr(String str) {
		ArrayList<String> result = new ArrayList<String>();
		str = str.toLowerCase();
		for(int i=0; i<str.length()-1;i++) {
			if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') &&
					(str.charAt(i+1) >= 'a' && str.charAt(i+1) <= 'z')) {
				result.add(str.substring(i,i+2));
			}
		}
		return result;
	}
	public int getIntersection(ArrayList<String> a1, ArrayList<String> a2) {
		ArrayList<String> result = new ArrayList<String>();
		ArrayList<String> arr1 = a1;
		ArrayList<String> arr2 = a2;
		int size = arr1.size();
		String str;
		int idx;
		for(int i=0;i<size;i++) {
			str = arr1.get(i);
			idx = arr2.indexOf(str);
			if(idx != -1) {
				result.add(str);
				arr2.remove(idx);
			}
		}
		System.out.println("getIntersection : "+ result);
		
		return result.size();
	}
	public int getUnion(ArrayList<String> arr1, ArrayList<String> arr2) {
		ArrayList<String> result = new ArrayList<String>();
		result.addAll(arr1);
		int size = arr1.size();
		String str;
		int idx;
//		for(int i=0;i<size;i++) {
//			str = arr1.get(i);
//			idx = arr2.indexOf(str);
//			if(idx != -1) {
//				arr2.remove(idx);
//			}
//		}
		
		result.addAll(arr2);
		System.out.println("getUnion : " + result);
		return result.size();
		
	}
}
