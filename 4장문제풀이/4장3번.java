import java.util.Scanner;

/**
 * study
 */
public class 4장3번 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>>");
        String name = scanner.next();
        int java = scanner.nextInt();
        int web = scanner.nextInt();
        int os = scanner.nextInt();
        Grade st= new Grade(name, java, web, os);
        System.out.println(st.getName() + "의 평균은 " + st.getAverage());
        scanner.close();
    }
}
//하나의 파일에 포함되어 있는 경우에는 반드시 하나의 클래스가 public이어야 하고, 그 클래스의 이름과 파일 이름이 동일해야 합니다.
class Grade {
    private String name;
    private int java;
    private int web;
    private int os;

    public Grade(String name, int java, int web, int os){
        this.name = name;
        this.java = java;
        this.web = web;
        this.os = os;
    }
    public String getName(){
        return this.name;
    }
    public int getAverage(){
        return (java+web+os)/3;
    }
    
}
