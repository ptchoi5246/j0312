package t4_exception;
//던지기
public class Exception5_throw {
	public static void main(String[] args) {
		findMethod();
		System.out.println("작업 끝~!~!~!~!");
	}

	private static void findMethod() {
		try {
			Class.forName("java.lang.String");
			System.out.println("String 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("찾는 String 클래스가 없습니다." + e.getMessage());
		}
	}
	
}
