package day11;

public class GnrMain {
	public static void main(String[] args) {
		GnrTest<Integer> gt = new GnrTest<>();
		
		gt.setData(10);
		System.out.println(gt.getData());
		
		System.out.println(GnrTest2.function(10));
		System.out.println(GnrTest2.function("¹®ÀÚ¿­"));
		System.out.println(GnrTest2.function('A'));
		System.out.println(GnrTest2.function(0.0F));
		
	}
}
