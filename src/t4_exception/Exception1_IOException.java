package t4_exception;
//일반 예외
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1_IOException { //키보드로 읽어드려라
	public static void main(String[] args) {
		
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			System.out.println("업로드할 파일명을 입력하세요~!  ");
			is.read();
			System.out.println("파일을 정상적으로 읽어들였습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽기 실패~~!");
			e.printStackTrace();
		}
		
	}
}
