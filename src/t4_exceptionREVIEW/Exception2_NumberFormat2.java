package t4_exceptionREVIEW;
//숫자 변환 오류
public class Exception2_NumberFormat2 {
	//숫자 형식 오류
	public static void main(String[] args) {
		String strNumber = "100abc";
		System.out.println("num + 10 : " + (strNumber+10)); //100abc10
		
		try {
			int num = Integer.parseInt(strNumber);
			//String 문자열을 숫자로 변경 : Integer.parseIn 공부하기
			//오류 발생
			System.out.println("정상 처리");
			System.out.println("num + 10 : " + (num+10));
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("숫자 변환 오류 : " + e.getMessage());
		}
		System.out.println("복습 완료 :)");
	}
}
