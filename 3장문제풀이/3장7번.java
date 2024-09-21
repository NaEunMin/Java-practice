import java.util.Random; //random클래스 사용을 위한 선언
public class Study{
	public static void main(String [] args) {
		Random random = new Random();
		int sum=0;
		int n[]=new int[10];
		System.out.print("랜덤한 정수들 >>");
		for(int i=0;i<10;i++) {
			int num = random.nextInt(9)+11; //랜덤정수뽑기
			System.out.print(num + " ");
			n[i]=num;
			sum +=num;
		}
		double avg = (double)sum/n.length;
		System.out.print("평균은 >> " + avg);
	}
}
