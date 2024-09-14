import java.util.Scanner;
public class Study {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");
		System.out.println("떡볶이 몇 인분>>");
		int num1 = scanner.nextInt();
		System.out.println("김말이 몇 이분>>");
		int num2 = scanner.nextInt();
		System.out.println("쫄면 몇 인분>>");
		int num3 = scanner.nextInt();
		System.out.println("전체 금액은 " + ((2000*num1)+(1000*num2)+(3000*num3))+"원입니다.");
		scanner.close();
		
	}

}
