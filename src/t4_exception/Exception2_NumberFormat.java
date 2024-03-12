package t4_exception;

public class Exception2_NumberFormat { //실행오류
	public static void main(String[] args) {
		String strNumber = "100a";
		System.out.println("num + 10 : " + (strNumber+10)); //10010
		
		try {
			int num = Integer.parseInt(strNumber); //String 문자열을 숫자로 변경 Integer.parseIn
			System.out.println("정상 처리");
			System.out.println("num + 10 : " + (num+10));
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("숫자 변환 오류 : " + e.getMessage());
		}

		
		System.out.println("작업 끝~~~!!!");
	}
}
