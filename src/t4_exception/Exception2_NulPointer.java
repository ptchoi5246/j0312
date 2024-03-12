package t4_exception;

public class Exception2_NulPointer { //정말 많이 본다
	public static void main(String[] args) {
		
		String str = "Seoul";
		String str2 = null;;
		
		System.out.println("o : " + str.charAt(2)); //String 낱개 
		try {
			System.out.println("o : " + str2.charAt(2)); 
			System.out.println("정상 처리");
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("Null 값 체크 : " +e.getMessage());
		}		
	}
}
