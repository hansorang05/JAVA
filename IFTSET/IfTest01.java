
public class IfTest01 {

	public static void main(String[] args) {
		// 조건문 - if ( )
		int score = 97;
		
		//printf	%d		%s		%f
		 
 		if (score >= 90) {
			System.out.printf("점수가 90점보다 큽니다.\n",score);
			System.out.println("등급이 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80점보다 큽니다.");
			System.out.println("등급이 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70점보다 큽니다.");
			System.out.println("등급이 C입니다.");
		} else if (score >= 60) {
			System.out.println("점수가 60점보다 큽니다.");
			System.out.println("등급이 D입니다.");
		} else {
			System.out.println("점수가 60점보다 낮습니다.");
			System.out.println("등급이 F입니다.");
		}

	}

}
