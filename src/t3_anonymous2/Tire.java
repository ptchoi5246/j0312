package t3_anonymous2;

// 부모 객체 - 추상 클래스
public abstract class Tire {
	//추상 메소드
	public abstract void roll();
	//일반 메소드
	public void roll2() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
