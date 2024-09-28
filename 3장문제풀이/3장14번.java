import java.util.Scanner;
import java.util.Random;
public class gamblingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("***** 갬블링 게임을 시작합니다 *****");
		while (true) {
			System.out.print("엔터키 입력>>");
			String input = scanner.nextLine();
			//Enter키 입력을 위해 nextLine()을 사용
			int num1 = random.nextInt(3);//랜덤하게 숫자 3개 0~2까지 뽑음
			int num2 = random.nextInt(3);
			int num3 = random.nextInt(3);
			System.out.println(num1 + " " + num2 + " " + num3);
			if (num1 == num2 && num2 == num3) { //숫자 3개가 모두 같다면
				System.out.println("성공! 대박났어요!");
				while (true) {
					System.out.println("계속하시겠습니까?(yes/no)>>");
					String answer = scanner.nextLine();
					if (answer.equals("no")) { //no 입력시 scanner 닫고 게임종료
						System.out.println("게임을 종료합니다");
						scanner.close();
						return;
					}
					else if(answer.equals("yes")) { //yes입력시 다시 게임시작
						break;
					}
					else { //다른 키를 입력시 yes와 no중에서 입력하라는 문구를 출력
						System.out.println("yes와 no중에서 입력해주세요");
					}
				}
			}
		}
	}
}
