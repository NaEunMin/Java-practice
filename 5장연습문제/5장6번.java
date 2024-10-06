class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = 0;
		this.y = 0;
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

class PositivePoint extends Point {
	public PositivePoint(int x, int y) {
		super(x,y);
		if(getX()<0 || getY() <0) {
			super.move(1, 1);
		}
	}

	public void move(int x, int y) {
		if (x > 0 || y > 0) {
			super.move(x, y);
		} else {
			super.move(1, 1);
		}
	}

	public String toString() {
		String string = "(" + getX() + "," + getY() + ")의 점.";
		return string;
	}
}

public class StudyEx {
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint(10, 10);
		p.move(5, 5);
		System.out.println(p.toString() + "입니다");
		p.move(2, -2);
		System.out.println(p.toString() + "입니다");

		PositivePoint q = new PositivePoint(-10, -10);
		System.out.println(q.toString() + "입니다");
	}
}
