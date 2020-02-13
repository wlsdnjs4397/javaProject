package day11;

/**
 * 
 * @author Administrator
 * @since 1.8
 * 
 * <br>Calculator for integer.
 */
		
public class Calc {
	/**
	 * 
	 * To divide the following integers.<br>
	 * For example<br>
	 * div(10, 3) : 3<br>
	 * @param num1 : First Integer for div
	 * @param num2 : Last Integer for div
	 * @return 
	 * @return : value
	 * @exception : ArithmeticException
	 */
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		Calc c = new Calc();
		try {
			c.div(10, 0);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
