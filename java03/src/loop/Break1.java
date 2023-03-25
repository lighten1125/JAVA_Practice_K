package loop;

public class Break1 {
	public static void main(String[] args) {
		//제어문에는 같이 쓸 수 있는 break,continue가 있다.
		//break:반복문을 강제 종료(자기를 감싸고 있는)
		
		while(true) {
			System.out.println("무한반복 시작!");
			
			if(true) {
				break; // 자신을 감싸고 있는 반복문을 끝냄
			}
			System.out.println("위에서 이미 반복문이 중료되어 이곳은 도달하ㅏ지 않습니다.");
		}
		
		System.out.println("반복문 종료");
		
		for(int i=0; i<=10; i++) {
			if(i>3) {
				break;
			}
			//1~10
			System.out.println(i+" ");
		}
	}
	
	

}
