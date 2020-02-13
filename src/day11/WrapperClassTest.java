package day11;

public class WrapperClassTest {

	public static void main(String[] args) {
		int num = 10;
		
		//¹Ú½Ì
		Integer w_num = new Integer(num);
		
		//¾ğ¹Ú½Ì
		num = w_num.intValue();
		
		//¿ÀÅä ¹Ú½Ì
		Integer w_num2 = 20;
		
		//¿ÀÅä ¾ğ¹Ú½Ì
		num = w_num2;
	}

}
