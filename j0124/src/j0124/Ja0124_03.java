package j0124;

public class Ja0124_03 {

	public static void main(String[] args) {

		//멀티쓰레드
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		th1.start();
		th2.start();
		
		
//		for(int i=0;i<300;i++) {
//			System.out.println("i : "+i);
//		}
//		for(int j=0;j<300;j++) {
//			System.out.println("j : "+j);
//		}
	}

}
