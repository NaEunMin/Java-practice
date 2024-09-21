import java.util.Random;

public class Study {
	public static void main(String[] args) {
		System.out.print("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.\n");
		int n[][] = new int[4][4];
		Random random = new Random();
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j]=random.nextInt(256);
				System.out.print(n[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
