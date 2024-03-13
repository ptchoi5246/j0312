package t4_exceptionREVIEW;
//일반 예외 - 컴파일 전에 빨간줄
public class Exception1_ClassNotFount2 {
	//Class가 존재하지 않으면 발생하는 예외
	public static void main(String[] args) {
		
		//java.lang.Object
		
		try {
			Class.forName("java.lang.Object2"); //일반 예외 오류
			//오류 발생 - Surround try/catch
			System.out.println("java.lang 패키지에는 Object2 클래스가 있습니다.");
		} catch (ClassNotFoundException e) { //예외오류 
			e.printStackTrace(); //콘솔창에 빨간 글자 오류 출력
			System.out.println("!!오류 발생!! java.lang 패키지에는 Object2 클래스가 없습니다."); 
		}
		System.out.println("복습 완료 :)");		
	}	
}
