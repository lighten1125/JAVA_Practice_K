package condition;

public class Ifelse {

	public static void main(String[] args) {
		//else{}
		
		if(false) {
			System.out.println("조건이 맞을 때 실행할 코드");
			}
		else {
			System.out.println("조건이 틀릴 때 실행할 코드");
			}
		
		//if()조건이 틀렸을 때 그 다음 조건을 검사하고 싶으면
		if(99<10) {
			System.out.println("10보다 작습니다.");
		}
		else if(99<100) {
			System.out.println("100보다 작습니다.");
		}
		else if(99<1000) {
			System.out.println("1000보다 작습니다.");
			
		}
		// else if() {}: 위 조건이 틀렸을 경우에만 검사
		
		else {
			System.out.println("그 밖의 값");
		}

	}

}
