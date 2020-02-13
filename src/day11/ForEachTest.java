package day11;

public class ForEachTest {

	public static void main(String[] args) {
		int [][] arrScore = {
				{10, 20, 30},
				{11, 25, 39},
				{12, 26, 38},
				{13, 27, 37},
				{14, 28, 36}
		};
		
		//�� �л��� ������ ���(2���� �ڸ�����) ����ϱ�
		//���� for ���� ����ϱ�
		int cnt = 0;
		double avg = 0.0;
		
		for(int[] arScore : arrScore) {
			cnt++;
			int total = 0;
			for(int score : arScore) {
				total += score;
			}
			
			avg = Double.parseDouble(String.format("%.2f", (double)total / arScore.length));
			System.out.println(cnt + "�� �л� ���� : " + total + "��");
			System.out.println(cnt + "�� �л� ��� : " + avg + "��");
		}

	}

}
