public class Study {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		// while문으로 작성
		while (true) {
			if (i > 50)
				break;
			sum += i;
			i += 3;
		}
		System.out.println(sum);

		// for문으로 작성
		int sum1 = 0;
		int i1 = 1;
		for (i1 = 1; i1 < 50; i1 = i1 + 3) {
			sum1 += i1;
		}
		System.out.println(sum1);

		// do-while문으로 작성
		int sum2 = 0;
		int i2 = 1;
		do {
			sum2+=i2;
			i2+=3;
		}while(i2<50);
		System.out.println(sum2);
	}
}
