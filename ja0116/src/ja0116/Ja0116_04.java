package ja0116;

import java.util.Scanner;

public class Ja0116_04 {

	public static void main(String[] args) {
		// 0. 변수선언
		Scanner scan = new Scanner(System.in);
		String [][] arr= new String[5][5]; // 뽑기, 당첨, 꽝
		String [][] arr2= new String[5][5];// 0,1
		int temp = 0;
		int n=0;
		int cnt = 0;
		int money = 0;
		// 1. 5,5 배열 만들기 // 2. 뽑기 글자 생성 // 3. 5,5 베열 생성 - arr 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = "뽑기";
			}
		}
		
		
		
		// 4. 25개 1차원 배열 생성 //5. 1차원 배열값 넣기
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		//6. 배열섞기		
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ranNum];
			num[ranNum] = temp;
		}
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = num[5*i+j]+"";
			}
		}

		// 7. 뽑기 배열 출력
		loop:while(n<10) {
		System.out.println(" [ 뽑기 게임 ] ");
		System.out.println("------------------------------------------");
		System.out.printf("좌표 |\t %s\t %s\t %s\t %s\t %s\t \n","0","1","2","3","4");
		System.out.println("------------------------------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d   | \t",i);
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 8. 번호입력
				
			System.out.println("(행) X좌표를 입력하세요. (종료 : -1)>>");
			int x = scan.nextInt();
			if(x==-1) {
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
			System.out.println("(열) Y좌표를 입력하세요. >>");
			int y = scan.nextInt();
			if(x<0 || x>4 || y<0 || y>4) {
				System.out.println("숫자를 잘못 입력하셨습니다. 다시 시도해주세요.");
			}else {
			//9. 당첨확인
			System.out.printf("입력하신 번호 : [%s, %s] \n",x,y);
			if(arr2[x][y].equals("0")) {
				System.out.println("결과 : 꽝!");
				arr[x][y] = "꽝!";
				n++;
			}else if(arr2[x][y].equals("1")) {
				System.out.println("결과 : 당첨");
				arr[x][y] = "당첨";
				n++;
				switch(cnt) {
					case 0:
						money += 100000000;
						cnt ++;
						break;
					case 1:
						money += 100000000;
						cnt ++;
						break;
					case 2:
						money += 200000000;
						cnt ++;
						break;
					case 3:
						money += 400000000;
						cnt ++;
						break;
					case 4:
						money += 800000000;
						cnt ++;
				}
			}
			System.out.printf("당첨금 : %,d \n",money);
		}
	}
		//10. 최종확인
	}

}