package day11;

import java.util.StringTokenizer;

public class StringAPI_Test2 {

	public static void main(String[] args) {
//		id : "hds9638", pw : "1234", name : "�ѵ���"
		String str = "hds9638,1234,,14��,";
		String[] arData = str.split(",", -1);
				
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i].equals("") ? "��������" : arData[i]);
		}
		/*StringTokenizer token = new StringTokenizer(str, ",");
		
		while (token.hasMoreElements()) {
			System.out.println(token.nextToken());;
		}*/
	}

}
