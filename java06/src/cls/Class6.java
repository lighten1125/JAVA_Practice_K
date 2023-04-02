package cls;

public class Class6 {
	public static void main(String[] args) {
		Car dadcar = new Car();
		// 아빠차.name =""; 	//private로 인하여 직접 사용이 불가능해짐
		dadcar.setName("그랜저");
		System.out.println(dadcar.getName());
		
	}
	

}

// 멤버변수는 private, 메서드는 public
/* 
  접근권한 제어자
  private : 다른 클래스에서 접근 불가능
  default(아무것도 안적었을 경우) : 다른 패키지에서 접근 불가능
  protected: 다른 패키지에서 접근 불가능하지만 상속했을 경우에는 가능
  public : 접근가능 (같은 프로젝트) 
 */

class Car{
	private String name; //private가 되면 다른 클래스에서 사용 불가능
	private String color;
	private int num;
	
	//대입을 위해선 set
	public void setName(String name) {
		this.name=name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setNum(int num) {
		this.num=num;
	}
	
	//사용을 위해선 get
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getNum() {
		return num;
	}
	
	
}
