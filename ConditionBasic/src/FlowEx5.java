import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {

		
//		중첩 if문
//		if(조건식1) {
//			조건식1의 연산결과가 true일때
//			
//			if(조건식2) {
//				조건식2의 연산결과가 true일때
//			}else {
//				조건식1의 결과가 true이고, 조건식2가 false일때
//			}
//		}else {
//			조건식1이 false일때
//		}
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String gradeStr = "";

		System.out.println("점수를 입력해주세요.");
		score = scan.nextInt();
		

//		유효성
//		if(score > 100) {
//			System.out.println("점수는 100점을 넘을 수 없습니다.");
//		}
		
		if (score >= 90) {
			gradeStr = "A";
			if(score >= 95) {
				gradeStr = gradeStr + "+";
			}else if(score <= 92) {
				gradeStr = gradeStr + "-";
			}
		}else if (score >= 80) {
			gradeStr = "B";
			if(score >= 85) {
				gradeStr = gradeStr + "+";
			}else if(score <= 82) {
				gradeStr = gradeStr + "-";
			}
		}else if (score >= 70) {
			gradeStr = "C";
			if(score >= 75) {
				gradeStr = gradeStr + "+";
			}else if(score <= 72) {
				gradeStr = gradeStr + "-";
			}
		}else if (score >= 60) {
			gradeStr = "D";
			if(score >= 65) {
				gradeStr = gradeStr + "+";
			}
		}else {
			gradeStr = "F";
		}

		System.out.println("당신의 점수는 " + score + " 이고 등급은 "
			+ gradeStr + " 입니다.");
		
		scan.close();
	}

		
	}


