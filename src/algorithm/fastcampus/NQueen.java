package algorithm.fastcampus;
import java.util.ArrayList;

public class NQueen {
	
	public boolean isAvailable(ArrayList<Integer> candidate, int currentCol) {
		int currentRow = candidate.size();
		for(int i = 0;i<currentRow; i++) {
			// Promising
			if((candidate.get(i) == currentCol) || (Math.abs(candidate.get(i) - currentCol) == currentRow - i)) {
				return false;
			}
		}
		return true;
	}
	
	public void dfcFunc(int N, int currentRow, ArrayList<Integer> currentCandidate) {
		if(currentRow == N) {
			System.out.println(currentCandidate);
			return;
		}
		
		for(int i=0; i<N ;i++) {
			if(this.isAvailable(currentCandidate, i)==true) {
				currentCandidate.add(i);
				this.dfcFunc(N, currentRow+1, currentCandidate);
				currentCandidate.remove(currentCandidate.size()-1); // Pruning 
			}
		}
		
	}
	
}
