public class Study {
	public static void main(String[] args) {
		int n[] = { 1, -2, 6, 20, 5, 72, -16, 256 };

		// for문으로 작성
		for (int i = 0; i < n.length; i++) {
			if (n[i] > 0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
		}

		System.out.print("\n");
		// while문으로 작성
		int i1 = 0; //while문 안에 작성하지 않도록 주의
		while (true) {
			if (i1 >= n.length) //>=가 아닌 >로 작성하면 배열의 크기를 넘어섰다는 예외주의 코드가 발생함
				break;
			if (n[i1] > 0 && n[i1] % 4 == 0) {
				System.out.print(n[i1] + " ");
			}
			i1++;
		}

		System.out.print("\n");
		// do-while문으로 작성
		int i2=0;
		do {
			if (n[i2] > 0 && n[i2] % 4 == 0) {
				System.out.print(n[i2] + " ");
			}
			i2++;
		} while (i2 < n.length);
	}
}
