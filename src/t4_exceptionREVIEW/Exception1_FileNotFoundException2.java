package t4_exceptionREVIEW;
//일반 예외
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1_FileNotFoundException2 { //파일을 읽는다.
	//파일을 찾을수 없을 때 발생시키는 오류
	public static void main(String[] args) {		
		
		try {
			//FileInputStream is = new FileInputStream("test.txt");
			FileInputStream is = new FileInputStream("D:\\javaclass\\java\\works\\j0312\\src\\t4_exception\\Exception1_ClassNotFount.java");
			//FileInputStream import
			//오류 발생 - Surround try/catch
			System.out.println("text.txt 파일이 존재합니다.");
		} catch (FileNotFoundException e) {
			System.out.println("!!오류 발생!! text.txt 파일이 없습니다.");
			e.printStackTrace();
		}
		System.out.println("복습 완료 :)");
	}
}
