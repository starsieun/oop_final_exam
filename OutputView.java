import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 * Created by kth919 on 2017-06-24.
 */
public class OutputView extends JDialog {

    private int lineNum;
    JButton back_btn = new JButton("돌아가기");

    ArrayList<OutModel> outModels = new ArrayList<>();

    private String stdNum; //학번
    private String name; // 이름
    private double midExamCal; // 중간
    private double finalExamCal; //기말
    private double attendCal; // 출석
    private double reportCal; // 과제
    private double sum; //총계
    private String grade; // 학점

    public OutputView(Frame mFrame) { this(mFrame, true); }

    public OutputView(Frame mFrame, boolean modal) {
        super(mFrame, "성적자료 출력", modal);

        Label stdNumidLbl = new Label("학   번", Label.CENTER);
        Label nameLbl = new Label("이   름", Label.CENTER);
        Label midLbl = new Label("중   간", Label.CENTER);
        Label finalLbl = new Label("기   말", Label.CENTER);
        Label attendLbl = new Label("출   석", Label.CENTER);
        Label reportLbl = new Label("과   제", Label.CENTER);

        JButton back_btn = new JButton("돌아가기");

        setLayout(null);
        stdNumidLbl.setBounds( 50, 10, 50, 30);  nameLbl.setBounds( 100, 10, 50, 30);
        midLbl.setBounds(150, 10, 50, 30);  finalLbl.setBounds(200, 10, 50, 30);
        attendLbl.setBounds(250, 10, 50, 30);  reportLbl.setBounds(300, 10, 50, 30);

        back_btn.setSize(100, 20);
        back_btn.setLocation(200, 300);

        add(stdNumidLbl);  add(nameLbl);
        add(midLbl);  add(finalLbl);  add(attendLbl);  add(reportLbl);
        add(back_btn);

        backto();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void value_set(ArrayList<OutModel> outModels){

        this.outModels = outModels;
        lineNum = outModels.size();

        System.out.println( "낄낄" + outModels.get(0).getStdNum() + lineNum);

    }

    public void print(){

        int y;

        for (int i = 0; i<outModels.size(); i++) {

            y = 50*(i+1);

            Label V_StdNum = new Label(": " + outModels.get(i).getStdNum(), Label.CENTER);
            V_StdNum.setSize(40, 20);
            V_StdNum.setLocation(50, y);

            System.out.println( "출력 학번은" + outModels.get(i).getStdNum());

            Label V_name = new Label(": " + outModels.get(i).getName(), Label.CENTER);
            V_name.setSize(40, 20);
            V_name.setLocation(100, y );

            Label V_mid = new Label(": " + Double.toString(outModels.get(i).getMidExamCal()), Label.CENTER);
            V_mid.setSize(40, 20);
            V_mid.setLocation(150, y);

            Label V_final = new Label(": " + Double.toString(outModels.get(i).getFinalExamCal()), Label.CENTER);
            V_final.setSize(40, 20);
            V_final.setLocation(200, y);

            Label V_attend = new Label(": " + Double.toString(outModels.get(i).getAttendCal()), Label.CENTER);
            V_attend.setSize(40, 20);
            V_attend.setLocation(250, y );

            Label V_report = new Label(": " + Double.toString(outModels.get(i).getReportCal()), Label.CENTER);
            V_report.setSize(40, 20);
            V_report.setLocation(300, y );

            Label V_score = new Label(": " + Double.toString(outModels.get(i).getSum()), Label.CENTER);
            V_score.setSize(40, 20 );
            V_score.setLocation(350, y );

            Label V_grade = new Label(": " + outModels.get(i).getGrade() , Label.CENTER);
            V_grade.setSize(40, 20);
            V_grade.setLocation(400, y );

            add(V_StdNum);
            add(V_name);
            add(V_mid);
            add(V_final);
            add(V_report);
            add(V_attend);
            add(V_score);
            add(V_grade);
        }
    }

    public void backto(){
        back_btn.addActionListener(e -> dispose());

    }


}
