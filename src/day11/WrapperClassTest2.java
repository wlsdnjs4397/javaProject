package day11;

public class WrapperClassTest2 {
	public void function(Object obj) {
		System.out.println("������Ʈ �޼ҵ�");	}
	
	public void function(int data) {
		System.out.println("�Ϲ�Ÿ�� �޼ҵ�");
	}
	
	public static void main(String[] args) {
		WrapperClassTest2 w = new WrapperClassTest2();
		
//		w.function(3); //�Ϲ�Ÿ��
		w.function(new Integer(3));	// ������Ʈ
	}
}
