/**
 * study
 */ //class명과 파일명은 편의상 같지 않게 함 원래 같아야함
public class Study {

    public static void main(String[] args) {
        Cube cube = new Cube(1,2,3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        cube.increase(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        if(cube.isZero()){
            System.out.println("큐브의 부피는 0");
        }
        else{
            System.out.println("큐브의 부피는 0이 아님");
        }
    }
}
class Cube{
    private int horizontality;
    private int vertical;
    private int height;

    public Cube(int horizontality, int vertical, int height){
        this.horizontality=horizontality;
        this.vertical= vertical;
        this. height = height;
    }
    public int getVolume(){
        return horizontality*vertical*height;
    }
    public void increase(int x, int y, int z){
        this.horizontality +=x;
        this.vertical +=y;
        this.height +=z;
    }
    public boolean isZero(){
        if(getVolume()==0) return true;
        else return false;
    }
}
