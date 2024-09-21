import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("양의 정수 입력>>");
			int num = scanner.nextInt();
			if (num < 0)
				System.out.print("양의 정수를 입력해주세요\n");
			else if (num == 0) {
				System.out.println("시스템을 종료합니다\n");
				return;
			}
			else {
				for (int i = num; i > 0; i--) {
					for (int j = i; j >= 1; j--) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
			}
		}
	}
}
