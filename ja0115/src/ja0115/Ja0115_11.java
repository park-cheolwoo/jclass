package ja0115;

public class Ja0115_11 {

	public static void main(String[] args) {
		// 1차원 배열
		// 1. 배열 선언 후 직접 입력
		int[] num = new int[10];
		num[0] = 10;
		num[1]=9;
		
		//2. 배열바로 입력
		int[] n = {1,2,3,4,5};
		//3. for 문으로 입력
		int[] n2 = new int[10];
		for(int i=0;i<10;i++) {
			n2[i]=i+1;
		}
		
		// 2차원 배열
		//1. 배열 선언 후 직접 입력
		int[][] score = new int[5][3];
		score[0][0]=1;
		score[0][1]=2;
		score[0][2]=3;
		score[1][0]=4;
		score[1][1]=5;
		score[1][2]=6;
		// 2. 배열바로 입력
		int[][] s = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		//3. for 문으로 입력
		//1차원 배열은 for문 1개만 사용
		//2차원 배열은 for문 2개만 사용
		//3차원 배열은 for문 3개만 사용
		int[][] s2 = new int[5][3];
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				s2[i][j] = (5*i)+j+1;
				System.out.println(s2[i][j]);
			}
		}
	}

}
