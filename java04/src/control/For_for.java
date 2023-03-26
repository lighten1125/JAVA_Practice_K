package control;

public class For_for {
	public static void main(String[] args) {
		//반복문 안에 반복문 사용할 수 있음
		// 한번 반복할 때마다 안쪽에 있는 반복문을 수행
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) { //안쪽 for문에서 j변수를 만들고 있음 즉! 
				//다시 안쪽for가 실행될 때마다 j=0으로 초기화됨
				System.out.println("i"+i+", j="+j);
			}
			System.out.println();
		}
	}

}
