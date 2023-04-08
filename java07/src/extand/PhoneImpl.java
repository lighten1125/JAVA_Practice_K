package extand;

//Impl: 구현부
public class PhoneImpl {
	public static void main(String[] args) {
		Phone5G p1= new Phone5G();
		p1.bigdata();	
	}

}

class Phone2G implements Phone{
	//전화+문자
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다");
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다");
		
	}
}

class Phone3G implements Phone{
	//전화+문자+인터넷
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다");
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다");
		
	}
	
	public void internet() {
		System.out.println("인터넷을 합니다");
	}
}

class Phone4G implements Phone{
	//전화+문자+인터넷+속도
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다");
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다");
		
	}
	
	public void internet() {
		System.out.println("인터넷을 합니다");
	}
	public void speed() {
		System.out.println("속도를 높입니다");
	}
}

class Phone5G implements Phone{
	//전화+문자+인터넷+속도+빅데이터
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다");
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다");
		
	}
	
	public void internet() {
		System.out.println("인터넷을 합니다");
	}
	public void speed() {
		System.out.println("속도를 높입니다");
	}
	public void bigdata() {
		System.out.println("빅데이터 사용이 가능합니다");
	}
}