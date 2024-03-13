package t4_exceptionREVIEW;
//첨자 변수 오류
public class Exception2_IndexOutOfBound2 {
	//인덱스의 범위를 벗어나는 경우 발생
	public static void main(String[] args) {
		
		int[] array = {1,2,3};
		for(int i=0; i<=array.length; i++) { //i<array.length
			try {
				System.out.println(array[i]); //오류 발생
				System.out.println("정상 처리");				
			} catch (ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("첨자 변수 오류 : " + e.getMessage()); 
			}
		}
		System.out.println("복습 완료 :)");
	}

}
