package day11;

import java.util.Random;

public class StringTest {
	public static void main(String[] args) {
//		String name = "�ѵ���";
//		String name2 = "�ѵ���";
		
		String name = new String("�ѵ���");
		String name2 = new String("�ѵ���");
		String name3 = "�ѵ���";
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		System.out.println(name.intern() == name3);
	}
}
