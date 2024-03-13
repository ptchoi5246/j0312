package t2_nested3;

public class Test1Run {
	public static void main(String[] args) {
		System.out.println("이곳은 main 메소드 입니다.");
		System.out.println();
		
		Test1 t1 = new Test1(); //기본 생성자 출력
		System.out.println("Test1 클래스 안의 su : " + t1.su); //500출력
		System.out.println("===============================");
		t1.modTest1(); //메소드의 내용 실행 :: 생성자는 생성하지 않았다.
		// 이곳은 Test1클래스의 modTest1메소드 입니다. 출력
		t1.modClass();
		//이곳은 Test1 클래스의 modClass() 메소드 입니다. //출력
	}
}
