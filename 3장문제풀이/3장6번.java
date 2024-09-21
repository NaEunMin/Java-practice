import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n[] = new int[10];
		System.out.print("양의 정수 10개 입력>>");
		// 편의상 3자리수 까지만 입력함
		for (int i = 0; i < 10; i++) {
			int num = scanner.nextInt();
			n[i] = num;
		}
		System.out.print("자리수의 합이 9인것은>>");
		for (int i = 0; i < n.length; i++) {
			if ((n[i] / 100) + ((n[i] % 100) / 10) + ((n[i] % 100 % 10)) == 9) {
				System.out.print(n[i] + " ");
			}
		}
	}
}
