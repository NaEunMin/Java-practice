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
class ColorPoint2 extends Point{
	private String color;

	public ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public ColorPoint2(int x, int y) {
		super(x, y);
	}

	public void set(String color) {
		this.color = color;
	}

	public void set(int x, int y) {
		move(x, y);
	}

	public double getDistance(ColorPoint2 cp) {
		int x = cp.getX() - this.getX();
		int y = cp.getY() - this.getY();
		x = x * x;
		y = y * y;
		double distance = Math.sqrt(x + y);
		return distance;
	}

	public String toString() {
		String str = this.color + "색의 (" + getX() + "," + getY() + ")의 점";
		return str;
	}
}
public class StudyEx {
	public static void main(String[] args) {
		// (0,0) 위치의 "WHITE" 색 점
		ColorPoint2 zeroPoint = new ColorPoint2(10, 10, "RED");
		System.out.println(zeroPoint.toString() + "입니다.");

		// (10,10) 위치의 "RED" 색 점
		ColorPoint2 cp = new ColorPoint2(10, 10, "RED");
		cp.set("BLUE"); // 색상 변경
		cp.set(10, 20); // 위치 변경
		System.out.println(cp.toString() + "입니다.");

		// (100, 100) 위치의 "BLACK" 점
		ColorPoint2 thresholdPoint = new ColorPoint2(100, 100);
		System.out.println("cp에서 임계점까지의 거리는 " + cp.getDistance(thresholdPoint));
	}
}
