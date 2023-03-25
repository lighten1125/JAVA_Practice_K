package condition;

public class Switch01 {
	public static void main(String[] args) {
		// 제어문 : if, switch, while, for, break, continue
		// 조건문 : if, switch
		// if가 기본 조건문, switch는 같은 경우만 (가독성)
		
		int num =2;
		if(num==0) {
			System.out.println("num은 0이다.");
		}else if(num==1) {
			System.out.println("num은 1이다.");
		}else if(num==2) {
			System.out.println("num은 2이다.");
		}
		
		
		switch(num) {
		case 0:
			System.out.println("0이다");
			break;
		case 1:
			System.out.println("1이다");
			break;
		case 2:
			System.out.println("2이다");
			break;
		default:
			System.out.println("그밖에");
		}
		
		switch(num) {
		case 1:
			System.out.println("안녕하세요");
			break;
		case 2:
			System.out.println("반가워요");
			break;
		case 3:
			System.out.println("잘있어요");
			break;
		case 4:
			System.out.println("다시 만나요");
			break;
		default:
			System.out.println("그밖에");
		}
	
	}

}
