package day11;

public class WrapperClassTest {

	public static void main(String[] args) {
		int num = 10;
		
		//�ڽ�
		Integer w_num = new Integer(num);
		
		//��ڽ�
		num = w_num.intValue();
		
		//���� �ڽ�
		Integer w_num2 = 20;
		
		//���� ��ڽ�
		num = w_num2;
	}

}
