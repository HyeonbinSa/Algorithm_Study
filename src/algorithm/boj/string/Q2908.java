package algorithm.boj.string;

import java.util.Scanner;

public class Q2908 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		sc.close();
		StringBuffer sb1 = new StringBuffer(num1);
		num1 = sb1.reverse().toString();
		StringBuffer sb2 = new StringBuffer(num2);
		num2 = sb2.reverse().toString();
		if(num1.compareTo(num2)>0) {
			System.out.println(num1);
		}else if(num1.compareTo(num2)<0) {
			System.out.println(num2);
		}
	}
}
