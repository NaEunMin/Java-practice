import java.util.Scanner;

public class getSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stringNumber[] = new String[10];
		System.out.println("양의 정수를 입력하세요. -1은 입력 끝>>");
		int sum = 0;
		int index = 0;
		int i = 0;
		while (i<10) {
			String num = scanner.next();
			if (num.equals("-1"))//-1을 입력하면 종료
				break;
			stringNumber[i] = num;
			i++;
		}
		for (int j = 0; j < i; j++) { //i는 마지막에 1이 추가된 상태이므로 j<i를 해줘야함
			try {
				int x = Integer.parseInt(stringNumber[j]);
				if (x > 0) {
					sum += x;
					index++;
				} else {
					System.out.println(stringNumber[j] + "제외");
				}
			} catch (NumberFormatException e) {
				System.out.println(stringNumber[j] + "제외");
			}
		}
		System.out.println("평균은 " + sum / index);
		scanner.close();
	}
}
