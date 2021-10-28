package section1;

public class Code14 {

	public static void main(String[] args) {
		// Bubble Sort
		// 가장 큰 값을 찾아서 맨 마지막으로 이동
		
		int[] arr = {8, 4, 1, 7, 11, 13, 5, 2};
		
		int tmp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
