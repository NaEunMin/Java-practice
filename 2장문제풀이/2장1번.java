import java.util.Scanner;
public class Study {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("$1=1200원입니다. 달러를 입력하세요>>");
		int doller = scanner.nextInt();
		System.out.println("$" + doller + "는 " + (doller*1200) + "원입니다");
	}

}
