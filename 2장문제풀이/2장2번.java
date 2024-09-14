import java.util.Scanner;
public class BirthDay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("생일 입력 하세요>>");
		int birthday, year, month, day;
		birthday = scanner.nextInt(); //정수형으로 입력받음
		year = birthday/10000; //입력받은 생일에서 년도를 추출하기 위해 10000으로 나눈 몫을 가져옴
		month = (birthday%10000)/100; //월은 뒷 4자리에서 앞 2자리 이므로 생일에서 10000으로 나눈 나머지에서 100으로 나눈 몫을 가져옴
		day = birthday%100; //일은 뒷 2자리를 가져오면 되므로 100으로 나눈 나머지를 가져온다
		
		System.out.println(year + "년 " + month + "월 "
		+day + "일");
		
		scanner.close();
	}

}
