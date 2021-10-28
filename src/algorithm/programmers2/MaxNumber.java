package algorithm.programmers2;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumber {
	public String solution(int[] numbers) {
        String answer = "";
        String[] arr = this.changeString(numbers);
        // 1. 숫자의 맨 앞이 가장 큰 수가 오게 정렬
        // 2. 맨앞이 같은 경우 뒤에가 큰 숫자가 오게 정렬 
        Arrays.sort(arr,new Comparator<String>() {
        	
        	// o2.compare 내림차순(음수가 return 어야함) 
        	// o1.compare 오름차순 
			@Override
			public int compare(String o1, String o2) {
				// 앞자가 같은 경우 
				if(o2.length() == 1 && o2.equals(o1.substring(0, 1))) {
//					System.out.println(o2 + ", " + o1.substring(1, 2));
//					System.out.println(o2.compareTo(o1.substring(1, 2)));
					for(int i=1;i<o1.length();i++) {
						if(o2.compareTo(o1.substring(i, i+1)) > 0) {
							return o2.compareTo(o1.substring(i, i+1));
						}
					}
				}
				System.out.println(o2+".compareTo("+o1+") : " + o2.compareTo(o1));
				return o2.compareTo(o1);
			}

        });
        this.printer(arr);
        for(int i=0;i<arr.length;i++) {
        	answer += arr[i];
        }
        System.out.println(answer);
        return answer;
    }
	
	// 문자 배열로 변환 함수 
	public String[] changeString(int [] numbers) {
		String[] result = new String[numbers.length];
		
		for(int i=0;i<numbers.length;i++) {
			result[i] = Integer.toString(numbers[i]);
		}
		
		return result;
	}
	
	// 출력 함수 
	public void printer(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
