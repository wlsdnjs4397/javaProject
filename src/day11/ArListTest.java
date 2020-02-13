package day11;

import java.util.ArrayList;
import java.util.Collections;

public class ArListTest {

	public static void main(String[] args) {
		ArrayList<Integer> arData = new ArrayList<>();
		ArrayList<Integer> arData2 = null;
		
		arData.add(10);
		arData.add(90);
		arData.add(80);
		arData.add(30);
		arData.add(20);
		arData.add(50);
		arData.add(40);
		
		System.out.println(arData.size());
		arData2 = new ArrayList<>(arData.subList(2, 5));
		System.out.println(arData2);
		
		Collections.sort(arData);
		System.out.println(arData);
	}

}
