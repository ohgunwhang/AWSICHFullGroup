public class FlowEx4 {

	public static void main(String[] args) {

//		if-else if문
//		
//		if(조건식1) {
//			조건식1의 연산결과가 true일때 수행될 문장들
//		}else if(조건식2){
//			조건식2의 연산결과가 true일때 수행될 문장들
//		}else if(조건식3){
//			조건식3의 연산결과가 true일때 수행될 문장들
//		}else {
//			위의 어느조건식도 만족하지 않을 때 수행될 문장들
//		}

		int score = 0;
		String gradeStr = "";

		score = 80;
		
		if(score >= 90) {
			gradeStr = "A";
		}else if(score >= 80) {
			gradeStr = "B";
		}else {
			gradeStr = "F";
		}
		
		System.out.println("당신의 학점은 " + gradeStr + " 입니다.");
	}

}
