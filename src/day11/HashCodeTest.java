package day11;

import java.util.Random;

public class HashCodeTest {

	public static void main(String[] args) {
		String data1 = new String("�ѵ���");
		String data2 = "�ѵ���";
		String data3 = new String("�ѵ���");
		
		Random r1 = new Random();
		Random r2 = new Random();
		
		System.out.println(data1 == data2);
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		
		System.out.println(data1 == data3);
		System.out.println(data1.hashCode());
		System.out.println(data3.hashCode());
		
		System.out.println(r1 == r2);
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
	}

}
