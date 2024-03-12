package t4_exception;
//일반 예외
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1_FileNotFoundException { //파일을 읽는다.
	public static void main(String[] args) {		
		
			try {
				//FileInputStream is = new FileInputStream("test.txt");
				FileInputStream is = new FileInputStream("D:\\javaclass\\java\\works\\j0312\\src\\t4_exception\\Exception1_ClassNotFount.java");
				System.out.println("text.txt 파일이 존재합니다.");
			} catch (FileNotFoundException e) {
				System.out.println("text.txt 파일이 없습니다.");
				e.printStackTrace();
			}
			System.out.println("작업 끝~!!!");
	}
}
