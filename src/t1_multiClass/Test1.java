package t1_multiClass;

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa 클래스 입니다."); //출력순서 2 : public class 출력 후 위에서부터 순서대로 출력
	}
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println("이곳은 Test1 클래스의 main메소드 입니다."); //출력순서 1 : public class = main 메소드
		
		new Aa();
		
		new Bb();
		
		System.out.println("작업을 마칩니다.");
	}
}

class Bb {
	public Bb() {
		System.out.println("이곳은 Bb 클래스 입니다."); //출력순서 3 : public class 출력 후 위에서부터 순서대로 출력
	}
}
//메인 클래스 먼저 - 위에서 아래로 클래스
