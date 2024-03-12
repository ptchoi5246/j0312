package t2_nested2;

public class Test1Run {
	public static void main(String[] args) {
		System.out.println("이곳은 Test1Run 클래스 main 메소드 입니다."); //메인 클래스
		System.out.println();
		
		Test1 t1 = new Test1();
		System.out.println("su : " + t1.su); //300
		t1.modTest1(); //Test1 클래스의 modTest1 메소드 출력
		System.out.println();
		
		new Aa(); //또 다른 외부 클래스 //외부 클래스 Aa 출력
		System.out.println();
		
		Test1.Aa t1a = new Test1.Aa(); //내부 클래스 - 정적 멤버 클래스
		//Test1의 내부 클래스 Aa = t1a
		//static : 메소드에 저장 - 접근할 때 클래스명. 으로 접근
		System.out.println("suB : " + t1a.suB);
		t1a.modTest1A(); //일반 메소드
		//내부 Aa 클래스의 modTest1A 메소드 출력
		t1a.modTest1B(); //static 메소드
		//내부 Aa 클래스의 modTest2B 메소드 출력
		System.out.println();
		
		System.out.println("suB : " + Test1.Aa.suB ); //클래스 이름에서 접근 - 메소드
		//450출력
		Test1.Aa.modTest1B();
		//static 선언
	}
}

//공부하기
