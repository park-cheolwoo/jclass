package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Ja0123_06 {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Scanner scan = new Scanner(System.in);
		String a = new String("a");
		StringBuffer str = new StringBuffer("aaa");
		
		System.out.println(a+2);
		System.out.println(str.append(2));
		for(int i=0;i<10;i++) {
			a += i;
		}
		
		
		
		
		// indexOf
//		String str = "bbaabbccAABBCCaaddeeffAAaa";
//		int count = 0;
//		int temp = 0;
//		for(int i=0;i<str.length();i++) {
//			if(str.indexOf("aa",i) != -1){
//				i = str.indexOf("aa",i);
//				System.out.println("존재하는 위치 : "+i);
//				count ++;
//			}else {
//				break;
//			}
//		}
//		System.out.println("존재하는 개수 : "+count);
		
		
//		System.out.println(str.indexOf("aa"));
//		System.out.println();
		
		
		
		
		
		
		//valueOf
//		int a = 10;
//		double b = 3.14;
//		String a1 = String.valueOf(a);
//		String a2 = String.valueOf(b);
//		String a3 = ""+a;
//		String a4 = ""+b;
//		
//		String str1 = "3.14";
//		String str2 = "100";
//		
//		double a5 = Double.parseDouble(str1);
//		int a6 = Integer.parseInt(str2);
		
		
		
//		String[] arr = {"홍길동임","유관순입니다.","이순신이다.","강감찬일까요?","김구에요","홍길순","홍길자임다"};
//		// 첫글자, 맨 마지막 글자 빼고 출력
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i].substring(1,arr[i].length()-1));}	
		
		
		
		
		
//		String str = "1조1234567";
//		System.out.println(str.substring(2,6));
//		System.out.println(str.substring(2));
//		System.out.println(str.substring(0));
		
		
		
		
		
		
//		String str = "안녕하세요. 반갑습니다. 홍길동입니다.";
//		while(true) {
//			
//		System.out.println("글자를 입력하세요. >> ");
//		String input = scan.nextLine();
//		if(input.length()<10) {
//			System.out.println("글자가 저장되었습니다.");
//			break;
//		}else {
//			System.out.println("10자 이내로 글자를 입력하세요. >> ");}
//		}
//		System.out.println(str.length());
		
		
		
		
		
		
//		String str = "          안           녕         하     세                요  .";
//		System.out.println(str);
//		System.out.println(str.replace(" ",""));
//		
		
		
		
//		String str = "안녕하세요. 홍길동입니다. 성은 홍입니다.";
//		String input = "김";
//		str = str.replace("홍", "김");
//		System.out.println(str);
		
		
		
		
		
//		String str = "          안           녕         하     세                요  .";
//		System.out.println(str);
//		System.out.println(str.trim().replace(" ",""));
		
		
		
		
		
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "김";
//		System.out.println("있는 위치 : "+str.indexOf(input));
//		int no = str.indexOf(input);
		
		
		
//		//contains : 문자열이 포함되어 있는지 확인
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
//		if(str.contains(input)) {
//			System.out.println("홍 이라는 글자가 있습니다.");
//		}else{
//			System.out.println("홍 이라는 글자가 없습니다.");
//		};
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].contains(input)) {
//				System.out.printf("%d번째 배열에 홍 이 있습니다. \n",i);
//			}
//		}
		
	
		
		
//		String str = "1,홍길동,89,100,93,0,0,0,0";
//		//학번,이름,국어,영어,수학,합계,평균,등수
//		String[] arr = str.split(",");
//		int kor = Integer.parseInt(arr[2]);
//		int eng = Integer.parseInt(arr[3]);
//		int math = Integer.parseInt(arr[4]);
//		int total = kor+eng+math;
//		double avg = total/3.0;
//		System.out.println("번호 : "+arr[0]);
//		System.out.println("이름 : "+arr[1]);
//		System.out.println("국어 : "+kor);
//		System.out.println("영어 : "+eng);
//		System.out.println("수학 : "+math);
//		System.out.println("합계 : "+total);
//		System.out.println("평균 : "+avg);
//		System.out.println("등수 : "+arr[7]);
		
		
		
		
		
		
		
//		System.out.println("숫자를 입력하세요. >> 10,9");
//		//두 수의 합과 곱을 구하시오.
//		String[] arr = scan.next().split(",");
//		int n1 = Integer.parseInt(arr[0]);
//		int n2 = Integer.parseInt(arr[1]);
//		System.out.println(n1+n2);
//		System.out.println(n1*n2);
		
		
		
//		String str = "100,100,100";
//		String[] arr = str.split(",");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
//		String str = "안녕";
//		String str2 = "반가워";
//		System.out.println(str.concat(str2));
		
		
//		String str = "abcdefg";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		
		
		
		
//		String str = "abc";
//		String str2 = "aBc";
//		String str3 = "abc";
//		
//		if(str.equalsIgnoreCase(str2)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		
		
//		Point p1 = new Point(3,5);
//		Point p2 = (Point)p1.clone(); // 객체복사
////		Point p3 = new Point(p1); // 객체복사
//		
//		p1.x = 10;
//		p2.x = 100;
//		
//		System.out.println(p1);
//		System.out.println(p2);
		
		
//		Stu s = new Stu();
//		System.out.println(s);
//		
//		String a = "a";
//		String b = "b";
//		for(int i=0;i<100;i++){
//			a += b;
//		}
//		System.out.println(a);
		
//		String txt = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		String txt2 = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		String txt3 = "안녕하세요.";
//		String str1 = new String(txt);
//		String str2 = new String(txt2);
//		String str3 = new String("abc ");
//		String str4 = new String("aac");
////		str3 = str1;
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str3.hashCode());
//		System.out.println(str4.hashCode());
//		System.out.println(txt.hashCode());
//		System.out.println(txt2.hashCode());
		
		
//		Stu s1 = new Stu("홍길동",100,90,90);
//		Stu s2 = new Stu("홍길동",70,70,70);
//		
//		
//		
//		if(s1.equals(s2)) {
//			System.out.println("같은 사람입니다.");
//		}
//		
		
//		Person p1 = new Person(2001011111111L);
//		Person p2 = new Person(2001011111111L);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		if(p1.equals(p2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}
		
	}

}
