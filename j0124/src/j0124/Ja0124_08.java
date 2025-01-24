package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ja0124_08 {

	public static void main(String[] args) {
		
		//FileInputStream
//		try {
//			FileInputStream fis = new FileInputStream("C://save/bbb.txt");
//			int read = 0;
//			while((read = fis.read()) != -1) {
//				System.out.print((char)read); // 한글은 깨짐(한글은 2바이트가 아니라 3바이트이기 때문)
//			}
//			System.out.println();
//			fis.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	
		//FileOutputStream
		try {
			//폴더 확인
			String folder = "C://save3";
			File f = new File(folder);
			if(!f.exists()) {f.mkdirs();}
			
			//파일 확인
			File file = new File(folder+"/ccc.txt");
			file.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(file);		
//			FileOutputStream fos = new FileOutputStream("C://save/bbb.txt");
			String str = "1,hong홍,100,100,100,300,100.0,0";
			str += "2,yu유,90,90,90,270,90.0,0";
			//String을 byte 단위로 분리를 해야함
			byte[] bytes = str.getBytes();
			for(byte b:bytes) {
				fos.write(b);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("프로그램 종료");
	}

}
