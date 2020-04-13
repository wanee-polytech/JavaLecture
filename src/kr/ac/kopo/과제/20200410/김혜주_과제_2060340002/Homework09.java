package kr.ac.kopo.homework02;

//9. 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다. 
/*
혜주씨 이 코드 9단 출력되나요??? 안될꺼 같은데
다시한번 코드 보시고 수정해주세요

==> 수정 완료
*/

public class Homework09 {
	public static void main(String[] args) {
		int cnt = 0;
		int j;
		for(int k = 1; k <= 3 ; k++) {
			for(int i = 1 ; i <= 9; i++) {
				for(j = 2 + cnt ; j <= 4 + cnt ; j++) {
					//9단은 출력하지 않음
					if(j==10) {
						break;
					}
					System.out.printf("%d * %d = %d \t", j, i, j*i);
				}
				System.out.print('\n');
			}
			//3개의 단만 출력
			System.out.print('\n');
			cnt +=3;
		}
	}
}
