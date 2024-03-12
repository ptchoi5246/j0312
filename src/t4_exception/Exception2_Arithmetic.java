package t4_exception;

//실행 예외 처리 
public class Exception2_Arithmetic {
	public static void main(String[] args) {
		int su1 = 10, su2 = 0;
		//연산 오류
		try {
			System.out.println("10 / 2 = " + (su1 / su2));
			System.out.println("정상 처리");
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("예외 처리" + e.getMessage());
		}
		System.out.println("작업 끝~~!!!");
	}
}
