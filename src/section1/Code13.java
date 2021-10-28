package section1;

import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한자리 정수를 입력하세요.");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print(i+1 + " : ");
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for(int i=0;i<n;i++) {
			int sum = arr[i];
			for(int j=i+1;j<n;j++) {
				sum = sum*10 + arr[j];
				if(isPrime(sum) && max<sum)
					max = sum;
			}
		}
		
		System.out.println(max);
	}
	public static boolean isPrime(int n) {
		for(int k=2;k< Math.sqrt(n);k++) {
			if(n%k==0 || n == 1) {
				return false;
			}
		}
		return true;
	}
}
