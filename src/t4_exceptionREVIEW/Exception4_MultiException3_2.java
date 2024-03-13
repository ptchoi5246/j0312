package t4_exceptionREVIEW;

public class Exception4_MultiException3_2 {
	public static void main(String[] args) {
		
		try {
			String data0 = args[0];
			System.out.println("args[0] : " + data0); //args 값 넣기
			String data1 = args[1];
			System.out.println("args[1] : " + data1);
			String data2 = args[2];
			System.out.println("args[2] : " + data2);
			
			int res = Integer.parseInt(data0) + Integer.parseInt(data2);
			System.out.println("res : " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("index 첨자 변수 체크 : " + e.getMessage());
		} catch (NumberFormatException e) { //NumberFormatException //Exception 가장 나중에
			//e.printStackTrace();
			System.out.println("수치 변수 체크 : " + e.getMessage());
		}
			catch (Exception e) { //추가 //Exception 가장 나중에
				e.printStackTrace();
		System.out.println("작업 끝");
		}
	}
}	
//이해 안됨