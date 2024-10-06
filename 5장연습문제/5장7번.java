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

class Point3DColor extends Point {
	private int z;
	private String color;

	public Point3DColor(int x, int y, int z, String color) {
		super(x, y);
		this.z = z;
		this.color = color;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		String string = "(" + getX() + "," + getY() + "," + getZ() + ")의 점" + getColor();
		return string;
	}
	public void move(Point3DColor q) {
		super.move(q.getX(),q.getY());
		setZ(q.getZ());
	}
	public boolean equals(Point3DColor r) {
		if(this.getX()==r.getX() && this.getY()==r.getY()
				&& this.getZ()==r.getZ() && this.getColor()==r.getColor())
			return true;
		else return false;
	}
}

public class StudyEx {
	public static void main(String[] args) {
		Point3DColor p = new Point3DColor(10, 20, 30, "RED");
		System.out.println(p.toString()+ "입니다.");
		
		Point3DColor q = new Point3DColor(1, 2, 3, "BLUE");
		p.move(q);
		System.out.println(p.toString() + "입니다");
		Point3DColor r = new Point3DColor(1, 2, 3, "RED");
		if(p.equals(r)) System.out.println("예");
		else System.out.println("아니오");
	}
}
