package day11;

import java.util.StringTokenizer;

public class StringAPI_Test {
	public static void main(String[] args) {
		String str = "안녕하세요,반갑습니다.한동석 강사입니다!";
		
		StringTokenizer token = new StringTokenizer(str, ",.!");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken(","));
		}
	}
}
