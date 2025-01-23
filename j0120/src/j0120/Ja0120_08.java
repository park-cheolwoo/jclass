package j0120;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0120_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[3]; // 배열선언
		for(int i=0;i<3;i++) {
		System.out.println("학생 이름을 입력하세요. >> ");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요. >> ");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요. >> ");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요. >> ");
		int math = scan.nextInt();
		s[i] = new Stuscore(name,kor,eng,math);
		s[i].print();
		}
		
		// 4번째 학생
		Stuscore s1 = new Stuscore();
		System.out.println(s1.count); // 4
		s1.name = "강감찬";
		s1.kor = 80;
		s1.eng = 80;
		s1.math = 80;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg=s1.total/3.0;
		s1.print(); // 0
		
		
		
		
		// 1,홍길동,100,100,100,300,100.0 을 출력하시오 
//		Stuscore stu = new Stuscore(1,"홍길동",100,100,100);
//		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",stu.no, stu.name, stu.kor, stu.eng, stu.math, stu.total, stu.avg);
//		Stuscore stu2 = new Stuscore(2,"유관순",99,98,97);
//		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",stu2.no, stu2.name, stu2.kor, stu2.eng, stu2.math, stu2.total, stu2.avg);
		
//		Car c1 = new Car("red","auto",5);
//		Car c2 = new Car();
//		c2 = c1; // 얕은 복사
//		Car c3 = new Car(c1); // c3와 c1은 별개
//		
//		
//		Car c = new Car();
//		c.color = "white";
//		c.gearType = "auto";
//		c.door = 4;
		
//		//red,stick,5
//		Car c2 = new Car("red","stick",5);
//		System.out.println(c2.color);
	}

}
