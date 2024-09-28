import java.util.Random;
import java.util.Scanner;
public class randomName {

    public static void main(String [] args) {
        String boyMiddleList [] = {"기", "민" ,"용", "종", "현","진","재","승","소","상","지"};
        String boyLastList [] = {"태","진","광","혁","우","철","빈","준","구","호","석"};
        String girlMiddleList [] = {"은","원","경","수","현","예","여","송","서","채","하"};
        String girlLastList[]={"진","연","경","서", "리","숙","미","원","린","희","수"};
        System.out.println("***** 작명프로그램이 실행됩니다. *****");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while(true){
            System.out.print("남/여 선택>>");
            String sex = scanner.next(); //성별을 입력받음
            if(sex.equals("그만")) break; //성별 입력단계에서 그만을 입력하면 프로그램 종료
            else if(sex.equals("남")){ //성별 입력단계에서 남을 입력했다면
                System.out.print("성 입력>>");
                String firstName = scanner.next();
                int index = random.nextInt(boyMiddleList.length);
                String middle = boyMiddleList[index];
                int index2 = random.nextInt(boyLastList.length);
                String last = boyLastList[index2];
                //index를 무작위로 받아와서 랜덤하게 이름을 배열에서 뽑는다
                System.out.println("추천 이름 : " + firstName + middle + last);
            }
            else if(sex.equals("여")){
                System.out.print("성 입력>>");
                String firstName = scanner.next();
                int index = random.nextInt(girlMiddleList.length);
                String middle = girlMiddleList[index];
                int index2 = random.nextInt(girlLastList.length);
                String last = girlLastList[index2];
                System.out.println("추천 이름 : " + firstName + middle + last);
            }
            else{
                System.out.println("남/여/그만 중에서 입력하세요!");
            }
        }
        scanner.close();
    }
}
