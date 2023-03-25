package loop;

public class Continue1 {
	public static void main(String[] args) {
		// continue : 반복문의 시작점으로 돌아감, ()로 돌아감, 밑에 코드를 무시하고 위로
		// 거를 때 많이 사용함
		
		
		int i =0;
		while(i<10) {
			i++;
			if(i%2==1) {continue;}
			System.out.println("while: "+i);
		}
		//while의 continue는 무조건 ()로 이동
		
		for(int j=0; j<10;j++) {
			if(j%2==1) {continue;}
			System.out.println("for: "+j);
		}
		//for의 continue는 ()로 이동해서 증감량부터 먼저 계산하고 조건식을 검사
	}
	

}
