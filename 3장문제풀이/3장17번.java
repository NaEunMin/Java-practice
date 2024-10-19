import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyEx {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String coffee[] = { "핫아메리카노", "아이스아메리카노", "카푸치노", "라떼" };
		int price[] = { 3000, 3500, 4000, 5000 };
		System.out.println("핫아메리카노, 아이스아메리카노, 카푸치노, 라뗴 있습니다");
		while (true) {
			String order;
			int check = 0;
			int count = 0;
			System.out.print("주문>>");
			order = scanner.next();
			if(order.equals("그만")) {
				return;
			}
			try {
				count = scanner.nextInt();
			} catch (InputMismatchException e) {
				String str = scanner.nextLine();
				System.out.println("잔 수는 양수로 입력해주세요");
				continue;
			}
			for (int i = 0; i < coffee.length; i++) {
				if (coffee[i].equals(order)) {
					System.out.println("가격은 " + price[i] * count);
					check = 1;
					break;
				}
				else {
					check = 0;
				}
			}
			if (check == 0) {
				System.out.println(order + "메뉴는 없습니다.");
			}
		}
	}
}
