package algorithm.boj.basicmath1;

import java.util.Scanner;
import java.util.Stack;

public class Q10757 {
	public void solution() {
		Scanner sc=  new  Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String answer ="";
		sc.close();
		Stack<Integer> result = new Stack<Integer>();
		Stack<Integer> aStack = this.changeStack(a);
		Stack<Integer> bStack = this.changeStack(b);
		if(a.length()>=b.length()) {
			result =  this.calc(aStack, bStack);
		}else {
			result  = this.calc(bStack, aStack);
		}
		while(!result.isEmpty()) {
			answer += result.pop();
		}
		System.out.println(answer);
	}
	public Stack<Integer> changeStack(String str){
		Stack<Integer> st = new Stack<Integer>();
		int size = str.length();
		for(String s : str.split("")) {
			st.add(Integer.parseInt(s));
		}
		return st;
	}
	
	// 길이가 긴 것이 a 
	public Stack<Integer> calc(Stack<Integer> a, Stack<Integer> b) {
		Stack<Integer> result = new Stack<Integer>();
		int aNum, bNum;
		while(!a.isEmpty()) {
			// 짧은 것이 비어 있을 경우 
			if(b.isEmpty()) {
				aNum = a.pop();
				if(aNum >= 10) {
					result.add(aNum - 10);
					if(a.isEmpty()) {
						a.add(1);
					}else {
						a.add(a.pop()+1);
					}
				}else {
					result.add(aNum);
				}
			// 짧은 것에 값이 있을 경우 	
			}else {
				aNum = a.pop();
				bNum = b.pop();
				if(aNum+bNum < 10) {
					result.add(aNum+bNum);
				}else {
					result.add(aNum+bNum-10);
					if(a.isEmpty()) {
						a.add(1);
					}else {
						a.add(a.pop()+1);
					}
				}
			}
		}
		return result;
	}
}
	
