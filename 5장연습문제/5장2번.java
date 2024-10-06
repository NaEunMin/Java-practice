class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {
		return size;
	}
}
class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치 " + this.color + "컬러");
	}
	public int getColor() {
		return this.color;
	}
}
class SmartTV extends ColorTV{
	private String ip;
	public int size;
	public SmartTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.println("나의 Smart TV는 " + this.ip + " 주소의 " + getSize() + "인치 " + getColor() );
	}
}
public class StudyEx {

	public static void main(String[] args) {
		SmartTV smartTV = new SmartTV("192.168.0.5", 77, 2000000);
		smartTV.printProperty();
	}

}
