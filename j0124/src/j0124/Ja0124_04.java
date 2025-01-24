package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ja0124_04 {

	public static void main(String[] args) throws Exception {
		
//		FileInputStream
//		FileOutputStream
		
		
		
		
		//------------- 글을 파일에 저장 -------------------------
		File f = new File("C://save2");
		if(!f.exists()) {
			f.mkdirs(); // c:/save2/aaa/ mkdir - c:/save2/aaa/ 에서 save2가 없으면 에러
		}
		
		// 파일을 복사할 때 사용
		FileInputStream fis = new FileInputStream("C://save/roze.jpg");
		FileOutputStream fos = new FileOutputStream("C://save2/roze2.jpg");
		while(true) {
			int read = fis.read();
			if(read == -1) {
				break;
			}
			fos.write(read);
		}
		fis.close();
		fos.close();
		System.out.println("프로그램 종료");
		
		// ------------ 파일에 있는 글자를 읽어서 출력 ---------------
		// 파일을 읽어서 데이터 출력
		byte[] b = new byte[1024];
//		FileInputStream fis = new FileInputStream("C://save/aaa.txt");
		fis.read(b);
		System.out.println(new String(b));
		
		//글을 가져와서 출력하는 기본형태
//		try {
//			FileInputStream fis = new FileInputStream("C://save/aaa.txt");			
//			int read = 0;
//			while((read=fis.read()) != -1) { // 읽을 데이터가 있으면
//				System.out.print((char)read);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}

}
