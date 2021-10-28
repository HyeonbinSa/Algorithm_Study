package algorithm.programmers2;

import java.util.Arrays;
import java.util.Comparator;

public class PhoneNumberList {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        int size = phone_book.length;
        Arrays.parallelSort(phone_book);
        for(int i=0;i<size-1;i++) {
        	if(phone_book[i+1].indexOf(phone_book[i]) == 0) {
				return false;
			}
        }
        return answer;
    }
	
}
