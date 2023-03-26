package review;

public class For3 {
	public static void main(String[] args) {
		
		//변수를 for 밖에서 만들면 for문이 종료되도 변수는 유지 됨
		int j=0;
		for(j=1;j<=10;j++) {
			System.out.print(j+" ");
		}
		System.out.println(j);
		
		//for문 ()의 초기값;조건식;증감량은 비워둘 수 있음
		//for문의 무한반복
		for(;;) {
			System.out.println("무한반복");
			break;
		}
		
		for(;j<20;) {
			System.out.println(j);
			j+=2;
		}
		
		
		
		
	}

}
