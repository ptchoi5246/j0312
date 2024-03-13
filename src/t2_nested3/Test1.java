package t2_nested3;

// 중첩클래스(instance 멤버 클래스) : 로컬 클래스 
//메소드 안에 중첩(내부)클래스 생성
public class Test1 {
	//필드
	int su = 500;
	
	//기본 생성자
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다.");
	}
	
	//메소드
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다.");
	}
	
	//메소드 생성
	public void modClass() { //메소드 블럭 안의 클래스는 메소드 안에서만사용 가능 public 클래스 :" 외부에서 호출 가능 - public 지워야한다.
		int atom = 900;
		System.out.println("이곳은 Test1 클래스의 modClass() 메소드 입니다.");
		System.out.println("이곳은 Test1 클래스의 modClass() 메소드 안의 atom 변수 입니다." + atom);
		
		class Aa { //로컬 클래스 :: 메소드 안에서 생성된 클래스
			int suA = 550;
			
			//생성자
			public Aa() {
				System.out.println("이곳은 중첩클래스 Aa클래스 입니다.");
			}
			
			public void modTest1A() {
				System.out.println("이곳은 Aa클래스의 modTest1A메소드 입니다.");
			}			
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		Aa aa = new Aa();
		//메소드 안의 클래스를 실행하기 위해서는 클래스 생성을 해야지 출력이 가능하다
		System.out.println("중첩 클래스안의 suA : " + aa.suA );
		aa.modTest1A();
	}
	
		public void modClass2() {
			class Bb{}
		}

		public void modClass3() { //서로 다른 메소드 안에서 다른 메소드 안의 같은 클래스 이름 사용 가능
			class Aa{}
			
		}
}	

class Aa { //또 다른 외부 클래스
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");		
	}
}

