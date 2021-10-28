package algorithm.section1;

public class StringLength {

	public static void main(String[] args) {
		String str = "Unhappy";
		System.out.println(length(str));
		printStr(str);
		reverse(str);
		binary(10);
		System.out.println();
		int[] arr = {1,2,3,4,5};
		System.out.println(sumOfArray(arr.length, arr));
		// 순차 탐색
		System.out.println(search(arr, 0, arr.length-1, 4));
		System.out.println(findMax(arr, 0, arr.length-1));
		
		String[] items = {"abc","bcd","cde","efg","gee"};
		String target = "bcd";
		System.out.println(binarySearch(items, target, 0, items.length-1));
	}
	// 문자열 길이 출력 (재귀) 
	public static int length(String str) {
		if(str.equals(""))
			return 0;
		else {
			return 1 + length(str.substring(1));
		}
	}
	// 문자열 출력 (재귀) 
	public static void printStr(String str) {
		if(str.equals("")) {
			System.out.println();
			return ;
		}
		else {
			System.out.print(str.charAt(0));
			printStr(str.substring(1));
		}
	}
	// 문자열 뒤집어 출력 (재귀)
	public static void reverse(String str) {
		if(str.length()==0) {
			System.out.println();
			return;
		}else {
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length()-1));
		}
	}
	// 2진수 출력
	public static void binary(int number) {
		if(number <= 1) {
			System.out.print(number);
			return;
		}
		else {
			binary(number/2);
			System.out.print(number%2);
		}
	}
	// 배열의 합 
	public static int sumOfArray(int n, int[] array) {
		if(n<=0) {
			return 0;
		}
		else 
			return sumOfArray(n-1, array) + array[n-1];
	}
	
	// 순차 탐색
	public static int search(int [] data, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		}
		else if(target == data[begin]) {
			return begin;
		}
		else {
			return search(data, begin+1, end, target);
		}
	}
	
	// 최대값 찾기
	public static int findMax(int[] data, int begin, int end) {
		if(begin == end)
			return data[begin];
		else {
			return Math.max(data[begin], findMax(data, begin+1, end));
		}
	}
	
	// 이진 검색 
	public static int binarySearch(String[] items, String target, int begin, int end) {
		if(begin > end) {
			return -1;
		}
		else {
			int middle_idx = (begin+end)/2;
			int compare = target.compareTo(items[middle_idx]);
			if(compare==0) {
				return middle_idx;
			}else if(compare < 0) {
				return binarySearch(items, target, begin, middle_idx-1);
			}else {
				return binarySearch(items, target, middle_idx+1, end);
			}
			
		}
	}
}
