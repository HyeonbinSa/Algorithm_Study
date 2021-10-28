package section1;

import java.util.Scanner;

public class Code12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 정수의 개수를 입력해주세요");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		
		for(int i=0;i<n;i++) {
			int sum = arr[i];
			for(int j=i+1;j<n;j++) {
				sum += arr[j];
				if(max<sum) {
					max = sum;
				}
			}
		}
		
		System.out.println("최대값은 "+max+"입니다.");
	}
}
