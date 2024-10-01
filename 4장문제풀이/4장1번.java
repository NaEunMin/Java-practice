class TV{
    private int inch;
    private int price;
    private String manufacturer;
    public TV(String manufacturer, int inch, int price){
        this.manufacturer = manufacturer;
        this.inch=inch;
        this.price=price;
    }
    public void show(){
        System.out.println(this.manufacturer + "에서 만든" + price + "만원짜리의" + inch + "인치 TV");
    }
}
public class 4장1번 {
    public static void main(String[] args) {
        TV tv = new TV("samsung", 50, 300);
        tv.show();
    }
}
