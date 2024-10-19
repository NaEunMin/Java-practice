import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyEx {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = 0;
			int m = 0;
			System.out.print("곱하고자 하는 정수 2개 입력 >>");
			try {
				n = scanner.nextInt();
				m = scanner.nextInt();
			} catch (InputMismatchException e) {
				String str = scanner.nextLine();
				System.out.println("정수를 입력하세요!");
			}
			System.out.println(n + "x" + m + "=" + n * m);
		}
	}
}
