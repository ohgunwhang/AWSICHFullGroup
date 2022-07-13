import java.util.Scanner;

public class FlowEx4_1 {

	public static void main(String[] args) {

//		
//		100-90 A
//		89-80 B
//		79-70 C
//		69-60 D
//		F
//		"당신의 점수는 " s " 이고 등급은 " g " 입니다."
//		점수는 사용자 키보드 입력

		Scanner scan = new Scanner(System.in);
		int score = 0;
		String gradeStr = "";

		System.out.println("점수를 입력해주세요.");
		score = scan.nextInt();

		if (score >= 90) {
			gradeStr = "A";
		} else if (score >= 80) {
			gradeStr = "B";
		} else if (score >= 70) {
			gradeStr = "C";
		} else if (score >= 60) {
			gradeStr = "D";
		} else {
			gradeStr = "F";
		}

		System.out.println("당신의 점수는 " + score + " 이고 등급은 "
			+ gradeStr + " 입니다.");
		
		scan.close();
	}

}
