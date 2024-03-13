package t4_exceptionREVIEW;
//Null 값 체크
public class Exception2_NulPointer2 { //정말 많이 본다
	//null을 가지고 있는 객체/변수 호출할 때 발생
	public static void main(String[] args) {
		
		String str = "Seoul";
		String str2 = null;;
		
		System.out.println("o : " + str.charAt(2)); // o : o
		//String 낱개 charAt() 공부하기
		try {
			System.out.println("o : " + str2.charAt(2)); //오류 발생
			System.out.println("정상 처리");
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("Null 값 체크 : " +e.getMessage());
		}		
	}
}
