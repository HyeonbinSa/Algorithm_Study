package algorithm.programmers2;

public class StockPrice {
	
	// 해당 시간의 가격 : prices 
	public int[] solution(int[] prices) {
		int size = prices.length;
		int[] answer = new int[size];
       
		for(int i=0;i<size;i++) {
			int count = 0;
			for(int j=i+1;j<size;j++) {
				count++;
				if(prices[i]>prices[j]) {
					break;
				}
			}
			answer[i] = count;
		}
//		for(int i=0;i<size;i++) {
//			System.out.println(answer[i]);
//		}
        return answer;
    }
}
