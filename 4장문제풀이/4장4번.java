/**
 * study
 */
public class 4장4번 {

    public static void main(String[] args) {
        Average avg = new Average();
        avg.put(10);
        avg.put(20);
        avg.put(30);
        avg.showAll();
        System.out.println("평균은 " + avg.getAvg() + "입니다");
    }
}
class Average{
    private int scores [] = new int[10];
    private int index=0;
    public Average(){ this.index = 0;}
    public void put(int score){
        scores[index++] = score;
    }
    public void showAll(){
        for(int i=0;i<index;i++){
            System.out.print(scores[i] + " ");
        }
    }
    public double getAvg(){
        int sum=0;
        for(int i=0;i<index;i++){
            sum +=scores[i];
        }
        return sum/index;
    }
}
