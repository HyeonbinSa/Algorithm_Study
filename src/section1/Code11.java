package section1;

import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 정수의 개수를 입력해주세요");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		int cnt = 0;
		// 2 4 2 4 2 5
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(array[i] == array[j]) {
					cnt++;
					System.out.print("("+array[i]+","+array[j]+")");
				}
			}
		}
		System.out.println("쌍의 개수는 총 " +cnt +"개 입니다.");
		
	}

}
