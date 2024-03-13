package t4_exceptionREVIEW;
//던지기
public class Exception5_throw2_2 {
	public static void main(String[] args) {
		
			try {
				findMethod();//Surround with try/catch
				System.out.println("찾는 클래스가 있습니다.");
			} catch (ClassNotFoundException e) {
				//e.printStackTrace();
				System.out.println("찾는 클래스가 없습니다." + e.getMessage());
			} finally {
				System.out.println("복습 완료 :)");
			}
	}

	private static void findMethod() throws ClassNotFoundException { //create findMethod()
		Class.forName("java.lang.String"); //Add throws Declaration
		System.out.println("계속 진행 중~!");
	}
}