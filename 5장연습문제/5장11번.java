import java.util.Scanner;

interface IStack {
	int capacity();

	int length();

	boolean push(String val);

	String pop();
}

class StringStack implements IStack {
	private int stackSize;
	private int top;
	private String stack[];

	public StringStack(int stackSize) {
		this.stackSize = stackSize;
		this.top = -1;
		stack = new String[stackSize];
	}

	public int capacity() {
		return stackSize;
	}

	public int length() {
		return (top + 1);
	}

	public boolean push(String val) {
		if ((top + 1) >= stackSize) {
			System.out.println("스택 포화 상태입니다.");
			return false;
		} else {
			stack[++top] = val;
			return true;
		}
	}

	public String pop() {
		return stack[top--];
	}
}

public class StudyEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("스택 용량 입력>>");
		int size = scanner.nextInt();
		StringStack s = new StringStack(size);
		while (true) {
			System.out.print("문자열 입력>>");
			String str = scanner.next();
			if (str.equals("그만")) {
				System.out.println("스택에 저장된 문자열 팝 : ");
				int length = s.length(); // for문에 s.length()로 적으면 top의 변화가 생겨 정상적인 프로그램작동이 되지 않음
				for (int i = 0; i < length; i++) {
					System.out.println(s.pop() + " ");
				}
				System.out.println("프로그램 종료");
				return;
			}
			s.push(str);
		}
	}
}
