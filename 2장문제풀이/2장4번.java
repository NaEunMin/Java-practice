import java.util.Scanner;
public class TravelCost {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("여행지>>");
		String travel = scanner.nextLine();
		System.out.print("인원수>>");
		int people = scanner.nextInt();
		System.out.print("숙박일>>");
		int day = scanner.nextInt();
		System.out.print("1인당 항공료>>");
		int airplaneCost = scanner.nextInt();
		System.out.print("1방 숙박비>>");
		int roomCost = scanner.nextInt();
		int room;
		if( (people/2) == 0) {
			room = people/2; //짝수라면 방을 추가로 예약하지 않아도됨
		}
		else {
			room = (people/2)+1; //홀수라면 방을 1개 추가로 예약함
		}
		System.out.print(people + "명의 " + travel + 
				" " + day + "박 " + (int)(day+1) +"일 여행에는" +
				"방이" + room +"개 필요하며, 경비는 " +
				(int)((int)(airplaneCost*people)+(int)(room*roomCost*day))+ "원입니다.");
		
		scanner.close();
	}
}
