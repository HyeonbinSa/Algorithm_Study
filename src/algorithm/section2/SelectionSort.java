package algorithm.section2;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {29, 10, 14, 37, 13};
		int size = array.length;
		for(int i=size-1;i>=0;i--) {
			System.out.println(i);
			sort(array, i);
			printArr(array);
		}
		printArr(array);
	}
	
	public static void sort(int[] array, int n) {
		// 가장 큰값을 찾아서 맨뒤로 보내는 방식
		int max = array[0];
		int idx = 0;
		for(int i=1;i<n;i++) {
			if(max < array[i]) {
				max = array[i];
				idx = i;
			}
		}
		int tmp = array[n];
		array[n] = array[idx];
		array[idx] = tmp;
		
	}
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
