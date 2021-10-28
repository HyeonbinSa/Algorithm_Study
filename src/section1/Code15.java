package section1;

import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 정수의 개수 : ");
		int n = sc.nextInt();
		// 5 -> 5
		// 1 -> 1, 5
        // 3 -> 1, 3, 5
		// 1,5,7,9,12 <- 8
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print(i+1 +" 정수 입력 :");
			int tmp = sc.nextInt();
			if(i==0) {
				arr[i] = tmp;
			}else {
				for(int j=i-1;j>=0;j--) {
					System.out.println("arr[j] : "+ arr[j] + ", tmp : "+ tmp);
					if(arr[j]>tmp) { // 3, 7 
						arr[j+1] = arr[j]; // 3 5 7 
					}
					arr[j]=tmp;
				}
			}
			System.out.println("====현재 배열 =====");
			printFor(arr);
			System.out.println();
		}
		printFor(arr);
	}
	public static void printFor(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
