package j0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0124_01 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Stu("홍길동",100,100,99)); //1명 입력
		
		//Map
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "aaa");
		map.put("userPw", "1111");
		map.put("userName", "홍길동");
//		map.put("list", list);
		
		 //키값이 존재하는지 확인
		System.out.println(map.containsKey("userId"));
		// value값이 존재하는지 확인
		System.out.println(map.containsValue("1111"));
		if(map.containsKey("userId")) {
			System.out.println(map.get("userId"));
		}
		
//		
		
		System.out.println("id : "+map.get("userId"));
		System.out.println("id : "+map.get("userId2"));
		System.out.println("id : "+map.get("userPw"));
		System.out.println("id : "+map.get("list"));
		
		Iterator i  = map.entrySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
//		ArrayList list2 = (ArrayList)(map.get("list"));
//		System.out.println(list2.get(0));
//		System.out.println(list2.get(0));
//		
//		HashSet set = new HashSet();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(2);
//		
//		Iterator i1 = set.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		i1 = set.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
		
//		ArrayList list = new ArrayList();
//		list.add(new Stu("홍길동",100,100,99)); //1명 입력
//		list.add(new Stu("유관순",90,90,99));
//		list.add(new Stu("이순신",80,80,89));
//		Stu s1 = new Stu();
//		s1.setName("강감찬");
//		s1.setKor(70);
//		s1.setEng(80);
//		s1.setMath(88);
//		list.add(s1);
//		
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)(list.get(i));
//			System.out.println(s.getNo()+","+s.getName());
//		}
	}

}
