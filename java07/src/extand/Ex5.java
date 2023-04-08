package extand;

public class Ex5 {
	public static void main(String[] args) {
		MyStr_deco m1 = new MyStr_deco("나나");
		m1.printStr();
		
	}

}
class MyStr{
	protected String str;
	
	public MyStr(String str) {
		this.str=str;
	}
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str=str;
	}
	public void printStr() {
		System.out.println(str);
	}
}

class MyStr_deco extends MyStr{

	public MyStr_deco(String str) {
		super(str);
	}
	
	public void printStr() {
		System.out.println("=="+str+"==");
	}
	
	
	
}