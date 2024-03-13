package t2_nested1;

//import t2_nested1.Test1.Aa;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();  //Test1 클래스의 생성 Test1 = t1
		//기본 생성자 출력
		System.out.println("Test1클래스의 su필드 : " + t1.su); //100
		t1.modTest1(); //Test1 의 modTest1 메소드 출력
		System.out.println();
		
		Aa aa = new Aa(); //외부 Aa 클래스의 생성 Aa = aa //원래 하던대로 생성
		//외부 기본 생성자 출력
		System.out.println(); //외부 Aa 클래스 출력
		
		//Aa t1a = t1.new Aa();
		//내부 클래스 생성할 때는 외부 클래스.new 내부 클래스 
		//import를 걸면 클래스 이름을 생성자 위치에 적을 수 있다.
		Test1.Aa t1a = t1.new Aa(); //중첩된 클래스.내부 클래스 변수 = 중첩클래스.new 내부 클래스
		//Test1의 내부 클래스 Aa : t1a
		//내부 Aa 클래스 기본 생성자 출력
		System.out.println("중첩클래스안의 suA필드 : " + t1a.suA); //200
		t1a.modTest1A();
		//Test1의 내부 클래스 Aa의 modTest1A의 메소드 출력
	}
}
