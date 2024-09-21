import java.util.Scanner;
import java.util.Random;

public class Study {
	public static void main(String[] args) {
		System.out.print("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.\n");
		int n[][] = new int[4][4];
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = random.nextInt(256);
				System.out.print(n[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("임계값 지정");
		int limit = scanner.nextInt();
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				if(n[i][j]>limit) {
					System.out.print("255 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.print("\n");
		}
	}
}
