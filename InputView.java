import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 * Created by kth919 on 2017-06-24.
 */
public class InputView extends Dialog implements ActionListener {

    private final int lineNum = 2;

    private String stdNum; //학번
    private String name; // 이름
    private int midExam; // 중간
    private int finalExam; //기말
    private int attend; // 출석
    private int report; // 과제

    ArrayList<InModel> inputList = new ArrayList<>();


    private TextField[] stdNumFld, nameFld, midFld, finalFld, attendFld, reportFld;

    public InputView(Frame mFrame) { this(mFrame, true); }

    public InputView(Frame mFrame, boolean modal) {
        super(mFrame, "성적자료 입력", modal);
        int i, x, y;

        Label stdNumLbl = new Label("학  번", Label.CENTER);
        Label nameLbl = new Label("이  름", Label.CENTER);
        Label midLbl = new Label("중  간", Label.CENTER);
        Label finalLbl = new Label("기  말", Label.CENTER);
        Label attendLbl = new Label("출  석", Label.CENTER);
        Label reportLbl = new Label("과  제", Label.CENTER);

        stdNumFld = new TextField[lineNum];  nameFld = new TextField[lineNum];
        midFld = new TextField[lineNum];  finalFld = new TextField[lineNum];
        attendFld = new TextField[lineNum];  reportFld = new TextField[lineNum];

        for (i = 0; i < lineNum; i++) {
            stdNumFld[i] = new TextField(3);  nameFld[i] = new TextField(4);
            midFld[i] = new TextField(2);  finalFld[i] = new TextField(2);
            attendFld[i] = new TextField(2);  reportFld[i] = new TextField(2);
        }


        Button finishBtn = new Button("입력완료");
        finishBtn.setActionCommand("finishBtn");
        finishBtn.addActionListener(this);


        setLayout(null);
        stdNumLbl.setBounds( 10, 30, 50, 30);  nameLbl.setBounds( 70, 30, 50, 30);
        midLbl.setBounds(130, 30, 50, 30);  finalLbl.setBounds(190, 30, 50, 30);
        attendLbl.setBounds(250, 30, 50, 30);  reportLbl.setBounds(310, 30, 50, 30);

        x = 10;  y = 70;
        for (i = 0; i < lineNum; i++) {
            stdNumFld[i].setBounds(x, y, 50, 20);  nameFld[i].setBounds(x+60, y, 50, 20);
            midFld[i].setBounds(x+120, y, 30, 20); finalFld[i].setBounds(x+190, y, 30, 20);
            attendFld[i].setBounds(x+250, y, 30, 20);  reportFld[i].setBounds(x+310, y, 30, 20);
            y = y + 25;
        }
        finishBtn.setBounds(220, 450, 60, 25);

        add(stdNumLbl);  add(nameLbl);
        add(midLbl);  add(finalLbl);  add(attendLbl);  add(reportLbl);
        for (i = 0; i < lineNum; i++) {
            add(stdNumFld[i]);  add(nameFld[i]);  add(midFld[i]);
            add(finalFld[i]);  add(attendFld[i]);  add(reportFld[i]);
        }
        add(finishBtn);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        parseData(e);
        dispose();

    }

    public void parseData(ActionEvent e){

        if(e.getActionCommand() == "finishBtn"){

            for(int i = 0; i<lineNum; i++){

                stdNum = stdNumFld[i].getText();
                name = nameFld[i].getText();

                String midData = midFld[i].getText();
                midExam = Integer.parseInt(midData);

                String finalData = finalFld[i].getText();
                finalExam = Integer.parseInt(finalData);

                String attendData = attendFld[i].getText();
                attend = Integer.parseInt(attendData);

                String reportData = reportFld[i].getText();
                report = Integer.parseInt(reportData);

                inputList.add(i, new InModel(stdNum, name, midExam, finalExam, attend, report) );

            }

        }

    }

    public ArrayList<InModel> getInputList() {
        return inputList;
    }

}