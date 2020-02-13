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
		
		//각 학생별 총점과 평균(2번쨰 자리까지) 출력하기
		//빠른 for 문만 사용하기
		int cnt = 0;
		double avg = 0.0;
		
		for(int[] arScore : arrScore) {
			cnt++;
			int total = 0;
			for(int score : arScore) {
				total += score;
			}
			
			avg = Double.parseDouble(String.format("%.2f", (double)total / arScore.length));
			System.out.println(cnt + "번 학생 총점 : " + total + "점");
			System.out.println(cnt + "번 학생 평균 : " + avg + "점");
		}

	}

}
