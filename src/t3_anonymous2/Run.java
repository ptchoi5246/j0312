package t3_anonymous2;

public class Run {
	public static void main(String[] args) {
		Car car = new Car();
		car.roll(); //추상타이어
		car.roll2(); //일반타이어
		System.out.println();
		
		car.mod1();
		System.out.println();
		
		car.mod2();
		System.out.println();
		
		car.mod3();
	}
}

