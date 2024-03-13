package t4_exceptionREVIEW;

class Grand {
}

class Son extends Grand {
}

class Son2 extends Grand {
}

public class Exception3_final2 {
	//마지막에 반드시 실행시켜야 하는 코드
	public static void main(String[] args) {
		System.out.println("작업시작");
		//Son son = new Son();
		Grand son = new Son(); //up casting
		Son sss = (Son) son; //down casting
		System.out.println();
		
		Grand grand = new Grand();
		try {
			Son2 sss2 = (Son2) grand; //down casting 오류
			System.out.println("정상처리");
		} catch (ClassCastException e) {
			//e.printStackTrace();
			System.out.println("형변환 오류(down casting) : " + e.getMessage());
		}
		
			String data = null;
			System.out.println(data);
			System.out.println(data + 100);
			System.out.println((String) data + 100);
		try {
			System.out.println(data.toString() + 100); //오류 발생
			System.out.println("정상처리2");
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("Null 값 체크 : " + e.getMessage());
		} finally { 
			System.out.println("복습 완료 :)"); //반드시 실행
		}
	}
}
// 수업시간 try 32~  복습  try 33~ 아무런 문제 없나요?