package t4_exceptionREVIEW;
//실행 예외 처리 : 컴파일 전에는 오류를 알 수 없다. 컴파일 후에 콘솔에 오류 출력
public class Exception2_Arithmetic2 {
	//나누기 0을 하면 발생하는 오류
	public static void main(String[] args) {
		int su1 = 10, su2 = 0;
		//연산 오류
		try {
			System.out.println("10 / 0 = " + (su1 / su2));
			//컴파일 후에 오류 출력, 제일 끝 문장 : 오류 위치
			//오류 위치 바로 위에 try/catch
			System.out.println("정상 처리");
		} catch (ArithmeticException e) {
			//catch() 콘솔에 출력된 오류 입력
			//e.printStackTrace(); 콘솔창에 빨간 글자 오류 출력, 보기 싫어서 주석 처리
			System.out.println("예외 처리" + e.getMessage());
		} //e.getMessage : 오류 이유
		System.out.println("복습 완료 :)");
	}
}
