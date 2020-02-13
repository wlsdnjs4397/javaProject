package day11;

import java.util.Random;

public class StringTest {
	public static void main(String[] args) {
//		String name = "한동석";
//		String name2 = "한동석";
		
		String name = new String("한동석");
		String name2 = new String("한동석");
		String name3 = "한동석";
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		System.out.println(name.intern() == name3);
	}
}
