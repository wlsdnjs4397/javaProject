package day11;

import java.util.StringTokenizer;

public class StringAPI_Test2 {

	public static void main(String[] args) {
//		id : "hds9638", pw : "1234", name : "한동석"
		String str = "hds9638,1234,,14살,";
		String[] arData = str.split(",", -1);
				
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i].equals("") ? "정보없음" : arData[i]);
		}
		/*StringTokenizer token = new StringTokenizer(str, ",");
		
		while (token.hasMoreElements()) {
			System.out.println(token.nextToken());;
		}*/
	}

}
