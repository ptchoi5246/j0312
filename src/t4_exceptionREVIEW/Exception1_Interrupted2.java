package t4_exceptionREVIEW;
//일반 예외 - 컴파일러 캐치 // 로또 번호 HW0305+1 로또 참조
import java.util.Arrays;

public class Exception1_Interrupted2 {
	//Thread.sleep(숫자) 시간 끌기
	public static void main(String[] args) {
		int[] lotto = new int[6]; //로또 배열
		System.out.println("금주의 로또 번호는 : ");
		atom: for(int i=0; i<6; i++) { //for(int i=1; i<=6; i++)
			int rand = (int)(Math.random()*45) + 1; //정수형 난수 발생 *(~까지의 숫자) +(~부터의 숫자)
			for(int j=0; j<i; j++) { //이중 for문
				if(lotto[j] == rand) { 
					i--; //j와 랜덤 숫자 같을 경우 1을 감소시켜 다시 랜덤수 생성 //중복 배제
					continue atom; // continue : 반복문의 현재 단계 중단, break : 반복문 전체 중단
				}
			}
			for(int j=0; j<5; j++) {
				System.out.print("♡");
				try { Thread.sleep(300); } catch (InterruptedException e) {}
			}
			System.out.println(rand);
			lotto[i] = rand;
		}
		try { Thread.sleep(500); } catch (InterruptedException e) {}
		Arrays.sort(lotto);
		System.out.print("\n행운을 잡으세요 : ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("♡복습 완료♡");
	}
}
