package algorithm.section1;

public class CountingCells {

	public static void main(String[] args) {
		// n*n 미로
		int N = 8;
		// 1 = Image Pixel
		// 0 = Background Pixel
		int[][] image = {
				{1,0,0,0,0,0,0,1},
				{0,1,1,0,0,1,0,0},
				{1,1,0,0,1,0,1,0},
				{0,0,0,0,0,1,0,0},
				{0,1,0,1,0,1,0,0},
				{0,1,0,1,0,1,0,0},
				{1,0,0,0,1,0,0,1},
				{0,1,1,0,0,1,1,1}};
		
		System.out.println(countingBlob(image, 1, 5, 8));
		printBlob(image, 8);
	}
	// 입력 : 2차원 Grid, (x,y) 좌표
	// 출력 필섹 (x,y)가 포함된 blob의 크기 
	
	public static int countingBlob(int[][] image, int x, int y, int N) {
		// 이미지픽셀이 아닐 경우 
		if(x < 0 || y < 0 || x >= N || y >= N) {
			return 0;
		}
		else if(image[x][y] != 1) {
			return 0;
		// 이미지픽셀인 경우 
		}else{
			image[x][y] = 2;
			return 1 + countingBlob(image, x-1, y, N) + countingBlob(image, x-1, y+1, N) + 
					countingBlob(image, x, y+1, N) + countingBlob(image, x+1, y+1, N) +
					countingBlob(image, x+1, y, N) + countingBlob(image, x+1, y-1, N) + 
					countingBlob(image, x, y-1, N) + countingBlob(image, x-1, y-1, N);
		}
	}
	public static void printBlob(int[][] image, int N) {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(image[i][j]+" ");
			}
			System.out.println();
		}
	}
}
