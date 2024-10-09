import java.util.Scanner;

abstract class Box {
	protected int size;

	public Box(int size) {
		this.size = size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public abstract boolean consume();

	public abstract void print();
}

class IngredientBox extends Box {
	private String name;

	public IngredientBox(String name, int size) {
		super(size);
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public boolean consume() {
		if (size > 0) {
			size--;
			return true;
		} else {

			return false;
		}
	}

	public void print() {
		System.out.print(name + " ");
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println(size);
	}
}

public class StudyEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IngredientBox coffeeBox = new IngredientBox("coffee", 5);
		IngredientBox freemBox = new IngredientBox("freem", 5);
		IngredientBox sugerBox = new IngredientBox("suger", 5);
		System.out.println("***** 청춘 커피 자판기 입니다. *****");
		while (true) {
			coffeeBox.print();
			freemBox.print();
			sugerBox.print();
			System.out.print("다방커피:1, 설탕커피:2, 블랙커피:3, 종료:4");
			int menu = scanner.nextInt();
			if (menu == 1) {
				if (coffeeBox.getSize() > 0 && freemBox.getSize() > 0 && sugerBox.getSize() > 0) {
					coffeeBox.consume();
					freemBox.consume();
					sugerBox.consume();
				} else {
					System.out.println("원료가 부족합니다.");
				}
			} else if (menu == 2) {
				if (coffeeBox.getSize() > 0 && sugerBox.getSize() > 0) {
					coffeeBox.consume();
					sugerBox.consume();
				} else {
					System.out.println("원료가 부족합니다.");
				}
			} else if (menu == 3) {
				if (coffeeBox.getSize() > 0) {
					coffeeBox.consume();
				} else {
					System.out.println("원료가 부족합니다.");
				}
			} else if (menu == 4) {
				System.out.println("청춘 커피 자판기 프로그램을 종료합니다.");
				return;
			}
		}
	}
}
