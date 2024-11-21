import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UseMouseListener extends JFrame{
    private JLabel[] label = new JLabel[12];
    private int firstIndex = -1; //첫번째 선택한 카드의 인덱스
    private int secondIndex = -1; //두번째 선택한 카드의 인덱스
    public UseMouseListener(){
        super("카드 스위치 게임");
        setLayout(new GridLayout(3,4, 5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i=0;i<label.length;i++){
            label[i] = new JLabel(String.valueOf(i+1));
            label[i].setBackground(Color.YELLOW);
            label[i].setOpaque(true);
            int index = i;
            label[i].addMouseListener(new MyMouselistener(i));
            add(label[i]);
        }

        setSize(300,300);
        setVisible(true);
    }
    class MyMouselistener extends MouseAdapter{
        private int index;
        public MyMouselistener(int index){
            this.index = index;
        }
        public void mouseClicked(MouseEvent e){
            if(firstIndex == -1) {
                for(int i=0;i<label.length;i++){ // 두번째 카드를 고르고 2개의 카드가 마젠타 색이 유지 되기에
                    //첫번째 카드를 누르면 먼저 모든 라벨의 색을 노란색으로 바꾸고 아래의 코드인 마젠타 색으로 변경하게 해주면
                    //문제에서 제시한 화면이 나오게 됨
                    label[i].setBackground(Color.YELLOW);
                    label[i].setOpaque(true);
                }
                firstIndex = index; //첫번째 선택한 카드의 인덱스를 저장
                label[firstIndex].setBackground(Color.MAGENTA); //해당 인덱스의 색을 마젠타로 변경
            }
            else if(secondIndex == -1 && index != firstIndex) { //두번째 카드가 선택되지 않고 두번째 선택한 카드가
                //첫 번째 카드가 아닌 경우
                String tmp;
                secondIndex = index; //두 번째 카드의 인덱스를 저장
                label[secondIndex].setBackground(Color.MAGENTA); //두번째 카드 또한 마젠타색으로 변경
                tmp = label[firstIndex].getText(); //두 카드의 숫자를 바꾸기 위해 tmp에 첫번째카드 숫자 저장
                label[firstIndex].setText(label[secondIndex].getText()); //두번째 카드의 숫자를 첫번째 카드에 저장
                label[secondIndex].setText(tmp); //tmp에 저장된 숫자를 두번째 카드에 저장
                firstIndex = -1; // -1로 다시 설정하여 다른 카드를 눌러도 마우스 이벤트가 발생하게 하도록 함
                secondIndex = -1;
            }
        }
    }
    public static void main(String[] args) {
        new UseMouseListener();
    }
}
