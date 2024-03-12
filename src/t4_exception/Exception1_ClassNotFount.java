package t4_exception;
//일반 예외
public class Exception1_ClassNotFount {
	public static void main(String[] args) {
		
		//java.lang.Object
		
		try {
			Class.forName("java.lang.Object2"); //일반 예외 오류
			System.out.println("java.lang 패키지에는 Object2 클래스가 있습니다.");
		} catch (ClassNotFoundException e) { //예외오류 
			//System.out.println("java.lang 패키지에는 Object2 클래스가 없습니다.");
			//e.printStackTrace(); //에러메세지 정확하고 보고 싶으면 작성
			System.out.println("java.lang 패키지에는 Object2 클래스가 없습니다." + e.getMessage() ); 
			//에러메세지가 너무 길게 나오면 요약한 내용을 출력하고 싶을 때 사용
		}
		System.out.println("작업 끝~!!!");		
	}	
}
