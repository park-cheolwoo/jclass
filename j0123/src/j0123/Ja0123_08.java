package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0123_08 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("aaa"); //순서 X, 중복 X
		set.add("ccc");
		set.add("aaa"); // 안됨
		set.add("ggg"); 
		
		System.out.println(set.size()); // 중복은 안들어가므로 4개
		
		Iterator i1 = set.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next()); // 순서 없음
		}
		System.out.println("--------------");
		// Iterator는 1회용이므로 한번 더 선언해야함
		Iterator i2 = set.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next()); // 순서 없음
		}
		
//		for(int i=0;i<set.size();i++) {
//			System.out.println(set.get(i));
//		}
		
		
		
		
		
//		ArrayList list = new ArrayList();
//		
//		for(int i=0;i<10;i++) {
//			list.add(i+1);
//		}
//		
//		//기본형태
//		Iterator i1 =list.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		
//		//편하게 사용하는 형태
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
	}

}
