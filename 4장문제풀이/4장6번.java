/**
 * study
 */
public class 4장6번 {

    public static void main(String[] args) {
        Rectangle a = new Rectangle(3,3,6,6);
        Rectangle b = new Rectangle(4,4,2,3);

        a.show();
        if(a.isSquare()) System.out.println("a는 정사각형입니다.");
        else System.out.println("a는 직사각형입니다.");
        if(a.contains(b)) System.out.println("a는 b를 포함합니다.");
    }
}
class Rectangle{
    private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle(int x, int y, int width, int height){
        this.x=x;
        this.y= y;
        this.width=width;
        this.height=height;
    }
    public void show(){
        System.out.println("(" + x + "," + y +")에서 크기가" + width + "x" + height + "인 사각형");
    }
    public boolean isSquare(){
        if(this.width==this.height) return true;
        else return false;
    }
    public boolean contains(Rectangle r){ //현재 사각형 내부에 매개변수로 받은 사각형 r이 있으면 true, 없으면 false 리턴
        if( (this.x<r.x) && ( (this.x+this.width)>(r.x+r.width)) && ((this.y+this.height)>(r.y+r.height)) && (this.y<r.y)) return true;
        else return false;
    }
}
