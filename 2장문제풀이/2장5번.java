import java.util.Scanner;
public class Study{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String student1, student2;
		int late, miss;
		
		System.out.println("학생1>>");
		student1 = scanner.next();
		late = scanner.nextInt();
		miss = scanner.nextInt();
		int student1_score = 100-((3*late) + (8*miss));
		int student1_minus = (3*late)+(8*miss);
		
		System.out.println("학생2>>");
		student2 = scanner.next();
		late = scanner.nextInt();
		miss = scanner.nextInt();
		int student2_score = 100-((3*late)+(8*miss));
		int student2_minus = (3*late)+(8*miss);
		
		System.out.println(student1 + "의 감점은 " + student1_minus + ", " +
		student2 + "의 감점은 " + student2_minus);
		
		if(student1_score > student2_score) {
			System.out.println(student1 + "의 출석 점수가 더 높음." + student1 +
					"의 출석 점수는 " + student1_score);
		}
		else {
			System.out.println(student2 + "의 출석 점수가 더 높음." + student2 + 
					"의 출석 점수는 " + student2_score);
		}
		scanner.close();
	}
}
