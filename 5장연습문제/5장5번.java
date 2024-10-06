class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void moveUp(int z) {
		this.z += z;
	}

	public void moveDown(int z) {
		this.z -= z;
	}

	public void move(int x, int y) {
		super.move(x, y); //무한대로 자기자신을 호출하여 오류가 발생한다.
	}
//super 키워드로 슈퍼클래스의 move함수를 호출할 수 있도록하자.
	public void move(int x, int y, int z) {
		super.move(x, y); //무한대로 자기자신을 호출하여 오류가 발생한다.
		this.z = z;
	}
	public int getZ() {
		return this.z;
	}
	public String toString() {
		String string = "(" + getX() + "," + getY() + "," + getZ() + ")의 점";
		return string;
	}
}

public class StudyEx {
	public static void main(String[] args) {
		Point3D p = new Point3D(3, 2, 1);
		System.out.println(p.toString() + "입니다.");

		p.moveUp(3);
		System.out.println(p.toString() + "입니다.");
		p.moveDown(2);
		System.out.println(p.toString() + "입니다.");
		p.move(5, 5);
		System.out.println(p.toString() + "입니다.");
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}
}
