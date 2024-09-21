import java.util.Scanner;
import java.util.Random;

public class Study {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.print("정수 몇 개 저장하시겠습니까>>");
		int count = scanner.nextInt();
		int n[] = new int[count];
		int sum = 0;
		System.out.print("랜덤한 정수들 >>>");
		for (int i = 0; i < count; i++) {
			int num = random.nextInt(100) + 1;
			System.out.print(num + " ");
			n[i] = num;
			sum += num;
		}
		System.out.print("\n");
		double avg = (double)sum/n.length;
		System.out.print("평균은 " + avg);
	}
}
