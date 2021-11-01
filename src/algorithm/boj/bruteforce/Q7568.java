package algorithm.boj.bruteforce;

import java.util.Scanner;

public class Q7568 {
	class Person{
		int weight;
		int height;
		int rank;
		public Person(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] p = new Person[n];
		for(int i=0;i<n;i++) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			p[i] = new Person(w,h);
		}
		for(int i=0;i<n;i++) {
			int rank = 1; 
			for(int j=0;j<n;j++) {
				if(i==j)
					continue;
				if(p[i].height < p[j].height && p[i].weight < p[j].weight) {
					rank++;
				}
			}
			p[i].rank = rank;
		}
		for(int i=0;i<n;i++) {
			System.out.print(p[i].rank +" ");
		}
	}
}
