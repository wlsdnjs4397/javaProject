package day11;

public class ObjectAr {
	public static void main(String[] args) {
//		Object[] arObj = {
//				new Integer(1),
//				new Double(10.6),
//				new String("�ȳ�"),
//				new Character('C')
				
				
//		};
		
		Object[] arObj = {1, 10.6, "�ȳ�", 'C'};
		
		//����for��
		for(Object obj : arObj) {
			System.out.println(obj);
		}
		
//		for (int i = 0; i < arObj.length; i++) {
//			System.out.println(arObj[i]);
//				if(arObj[i] instanceof Integer) {
//					System.out.println(arObj[i]);
//				}
//			
//		}
	}
}
