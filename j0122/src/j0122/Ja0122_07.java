package j0122;

import java.util.ArrayList;

public class Ja0122_07 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Time t = new Time(1,1,1);
		// 20개를 생성해서 20개를 출력하시오.
		
		// 생성 후 추가
		for(int i=0;i<20;i++) {
			int hour = (int)(Math.random()*24);
			int minute = (int)(Math.random()*60);
			int second = (int)(Math.random()*60);
//			list.add(new Time(hour,minute,second));
			list.add(new Time(i+1,i+1,i+1));
		}
		
		// 삭제
		list.remove(1);
		list.remove(7);
		list.remove(10);
		
		// 출력
		for(int i=0;i<list.size();i++) {
			Time t1 = (Time)(list.get(i));
			System.out.printf("%d.  %02d:%02d:%02d \n",i+1,t1.getHour(),t1.getMinute(),t1.getSecond());
		}
	}

}
