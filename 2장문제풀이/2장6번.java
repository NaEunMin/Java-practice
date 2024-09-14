import java.util.Scanner;
public class BIrthdayCandle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요>>");
		int age = scanner.nextInt();
		int red = age/10; //빨간 초는 10살 단위로 가져와야하므로 나이를 10으로 나눈 몫을 가져온다
		int blue = (age%10)/5; //파란 초는 5살 단위로 가져오지만 최소로 가져와야하므로 빨간 초를 가져온 후 나머지 나이에서 5로 나눈 몫을 가져온다
		int yellow = (age%10)%5;//노란 초는 위 2가지 색의 초를 전부 최소로 가져오고 난 후 나머지이므로 5로 나눈 나머지를 가져온다
		int totalCandle = red + blue + yellow;
		System.out.print("빨간 초" + red + "개, ");
		System.out.print("파란 초 " + blue + "개 ");
		System.out.print("노란 초" + yellow + "개 ");
		System.out.print("총 " + totalCandle + "개가 필요합니다.") ;
		scanner.close();
	}
}
