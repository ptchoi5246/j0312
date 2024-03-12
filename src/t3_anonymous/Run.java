package t3_anonymous;

public class Run {
	public static void main(String[] args) {
		Car car = new Car();
		car.roll(); //추상타이어
		car.roll2(); //일반 타이어
		System.out.println();
		
		car.mod1();
		System.out.println();
		
		car.mod2();
		System.out.println();
		
		car.mod3();
		System.out.println();
		
		car.companyName("금호타이어");
		System.out.println();
		
		car.mod4();
	}
}
