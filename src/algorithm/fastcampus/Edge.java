package algorithm.fastcampus;

public class Edge implements Comparable<Edge>{
	public String nodeV;
	public String nodeU;
	public int weight;
	public Edge(int weight, String nodeV, String nodeU) {
		this.nodeU = nodeU;
		this.nodeV = nodeV;
		this.weight = weight;
	}
	
	public String toString() {
		return "(" + this.weight + ", " + this.nodeV + ", " + this.nodeU + ")";
	}
	
	@Override
	public int compareTo(Edge arg0) {
		return this.weight - arg0.weight;
	}
	
}
