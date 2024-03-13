package t2_nested2;

// 중첩클래스 : 정적 static 멤버 클래스
public class Test1 {
	int su = 300;
	
	public Test1() { //기본 생성자
		System.out.println("이곳은 Test1클래스 입니다.");
	}
	
	public void modTest1() { 
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다.");
	}
	
	public static class Aa { //Test1의 내부 클래스 Aa
		//static class - static method 가능
		//static : 메소드 저장 - 접근할 때 클래스명. 으로 접근
		int suA = 400;
		static int suB = 450;
		//내부 클래스 Aa에서만 출력 가능
		
		public Aa() {
			System.out.println("이곳은 중첩(내부)클래스 Aa클래스 입니다.");
		}
		
		public void modTest1A() {
			System.out.println("이곳은 중첩(내부) Aa클래스의 modTest1A메소드 입니다.");
		}
		
		public static void modTest1B() {
			System.out.println("이곳은 중첩(내부) Aa클래스의 modTest1B메소드 입니다.");
		}
		
	}
}

class Aa { //또 다른 외부 클래스
	public Aa() {
		System.out.println("이곳은 외부 Aa클래스 입니다.");		
	}
}

