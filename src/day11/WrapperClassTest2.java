package day11;

public class WrapperClassTest2 {
	public void function(Object obj) {
		System.out.println("오브젝트 메소드");	}
	
	public void function(int data) {
		System.out.println("일반타입 메소드");
	}
	
	public static void main(String[] args) {
		WrapperClassTest2 w = new WrapperClassTest2();
		
//		w.function(3); //일반타입
		w.function(new Integer(3));	// 오브젝트
	}
}
