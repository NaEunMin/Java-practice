import java.util.Scanner;

class BaseArray {
	protected int array[];
	protected int nextIndex = 0;

	public BaseArray(int size) {
		array = new int[size];
	}

	public int length() {
		return array.length;
	}

	public void add(int n) {
		if (nextIndex == array.length) {
			return;
		}
		array[nextIndex] = n;
		nextIndex++;
	}

	public void print() {
		for (int n : array)
			System.out.println(n + " ");
		System.out.println();
	}
}

class BinaryArray extends BaseArray {
	protected int threshold;

	public BinaryArray(int size, int threshold) {
		super(size);
		this.threshold = threshold;
	}

	public void print() {
		for (int n = 0; n < array.length; n++) {
			if (array[n] > threshold) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
	}
}

public class StudyEx {
	public static void main(String[] args) {
		int threshold = 50;
		BinaryArray bArray = new BinaryArray(10, threshold);
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		for (int i = 0; i < bArray.length(); i++) {
			int n = scanner.nextInt();
			bArray.add(n);
		}
		bArray.print();
		scanner.close();
	}
}
