package day11;

import java.util.StringTokenizer;

public class StringAPI_Test {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���,�ݰ����ϴ�.�ѵ��� �����Դϴ�!";
		
		StringTokenizer token = new StringTokenizer(str, ",.!");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken(","));
		}
	}
}
