package t3_anonymous2;

//부모 Tire 상속 자식 Car
public class Car extends Tire{

	@Override
	public void roll() {
		System.out.println("추상 타이어가 굴러갑니다.");
	}
	
	public void mod1() {
		System.out.println("이곳은 Car(자식객체) 클래스의 mod1메소드 입니다.");
	}
	
	//익명 구현 객체 - 항상 자식 객체에서 만들기
	Tire tire1 = new Tire() {

		@Override
		public void roll() { //추상 메소드 재정의 하기 위해서 익명 구현 객체 사용
			System.out.println("익명 객체에서의 타이어가 굴러갑니다.");
		}		
	};
	
	public void mod2() {
		tire1.roll(); //익명객체에서의 타이어가 굴러갑니다. - 오버라이드
		tire1.roll2(); //일반 타이어 - 부모
	}
	
	public void mod3() {
		//메소드 안에서 익명 클래스 만들기
		Tire tire2 = new Tire() {

			@Override //추상메소드 오버라이딩
			public void roll() {
				System.out.println("메소드 안의 익명 객체에서 타이어가 굴러갑니다");				
			}			
		};		
		tire2.roll(); //메소드 안의 메소드 부를 때 생성된 클래스.메소드 이름 - 이렇게 해야 호출해서 출력 가능
	}			
}
