package j0124;

public class MyThread2 extends Thread{
	public void run() {
		for(int j=0;j<300;j++) {
			System.out.println("j : "+j);
		}
	}
}
