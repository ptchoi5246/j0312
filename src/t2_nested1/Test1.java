package t2_nested1;

// 중첩 클래스 nested class : 인스턴스 멤버 클래스 instance member class
public class Test1 {
	//필드
	int su = 100;	
	//생성자
	public Test1() { //기본 생성자
		System.out.println("이곳은 Test1 클래스 입니다.");
	}
	
	public void modTest1() { //메소드
		System.out.println("이곳은 Test1 클래스의 modTest1 메소드 입니다.");
	}
	
	//중첩 클래스를 만든다.
	public class Aa{ //중첩 - 내부 (Test1 $ Aa.class로 저장)
		//원래는 다른 클래스 만들 때 public 사용하면 안 되는데 중첩 클래스는 public 사용 가능
		//int su = 100; //독립된 클래스라 같은 변수도 에러는 안 난다.
		int suA = 200;
		//static int suB = 250; //static 정적 변수 사용 불가
		
		public Aa() {
			System.out.println("이곳은 중첩 클래스 Aa 클래스 입니다.");
		}
		
		public void modTest1A() {
			System.out.println("이곳은 Aa 클래스의 modTest1A 메소드 입니다.");
		}		
	//public static void modTest1B() {} //정적 메소드 사용 불가
	}
}

class Aa{ //외부 클래스
	public Aa() {
		System.out.println("이곳은 외부 Aa 클래스 입니다.");
	}
}
