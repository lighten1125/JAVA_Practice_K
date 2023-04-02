package cls;

public class KrController {
	public static void main(String[] args) {
		KrModel mm= new KrModel();
		mm.setNum(100);
		mm.setStr("자바 클래스");
		
		KrService ks = new KrService();
		
		Krview mv = new Krview();
		ks.decoEquals(mm);
		ks.decoPlus(mm);
		mv.printNum(mm);
		mv.printStr(mm);
	}
	

}

//KrModel 클래스(num,str)
class KrModel{
	int num; String str;
	
	void setNum(int num) {
		this.num=num;
	}
	
	int getNum() {
		return num;
	}
	
	void setStr(String str) {
		this.str=str;
	}
	
	String getStr() {
		return str;
	}
	
}

//Krview 클래스(출력용)

class Krview{
	void printNum(KrModel mm) {
		System.out.println(mm.num);
	}
	void printStr(KrModel mm) {
		System.out.println(mm.str);
	}
}

//KrService 클래스 (자바 기능)
class KrService{
	//출력하기 전에 꾸며주기
	void decoEquals(KrModel km) {
		//양 옆에 == 표시
		km.setStr("=="+km.getStr()+"==");
	}
	
	void decoPlus(KrModel km) {
		//양 옆에 == 표시
		km.setStr("+"+km.getStr()+"+");
	}
	
}
