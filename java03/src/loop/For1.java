package loop;

public class For1 {
	public static void main(String[] args) {
		// for : while의 가독성이 떨어져서
		
		// 0~9까지 출력 while
		int i =0;
		while(i<10) {
			System.out.println("while: "+i);
			i++;
		}
		// while단점 : 바깥에 플래그를 만들어줘야함, {}안에서 플래그를 증감
		// 결론으로 가독성 떨어짐
		
		// 0~9까지 출력 for
		for(int j=0; j<10; j++) {
			System.out.println("for: "+j);
		}
		
		//for문은 while만큼 자유롭지는 않음
	}

}
