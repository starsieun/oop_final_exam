package ac.kr.jejunu;

/**
 * Created by sieun on 2017. 6. 21..
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;package ac.kr.jejunu; /**
 * Created by sieun on 2017. 6. 21..
 */
import java.awt.*;
import java.awt.event.*;

public class c출력창 extends Dialog implements ActionListener {
    private final int   줄수     = 15;
    private TextField[] htxt, itxt, mtxt, ftxt, atxt, rtxt;

    public c출력창(Frame 소유자) { this(소유자, true); }

    public c출력창(Frame 소유자, boolean 모달) {
        super(소유자, "성적자료 입력", 모달);
        int i, x, y;

        Label hlbl = new Label("학   번", Label.CENTER);
        Label ilbl = new Label("이   름", Label.CENTER);
        Label mlbl = new Label("중   간", Label.CENTER);
        Label flbl = new Label("기   말", Label.CENTER);
        Label albl = new Label("출   석", Label.CENTER);
        Label rlbl = new Label("과   제", Label.CENTER);

        htxt = new TextField[줄수];  itxt = new TextField[줄수];
        mtxt = new TextField[줄수];  ftxt = new TextField[줄수];
        atxt = new TextField[줄수];  rtxt = new TextField[줄수];

        for (i = 0; i < 줄수; i++) {
            htxt[i] = new TextField(3);  itxt[i] = new TextField(4);
            mtxt[i] = new TextField(2);  ftxt[i] = new TextField(2);
            atxt[i] = new TextField(2);  rtxt[i] = new TextField(2);
        }


        Button 완료단추 = new Button("입력완료");
        완료단추.setActionCommand("완료단추");
        완료단추.addActionListener(this);


        setLayout(null);
        hlbl.setBounds( 10, 30, 50, 30);  ilbl.setBounds( 70, 30, 50, 30);
        mlbl.setBounds(130, 30, 50, 30);  flbl.setBounds(190, 30, 50, 30);
        albl.setBounds(250, 30, 50, 30);  rlbl.setBounds(310, 30, 50, 30);

        x = 10;  y = 70;
        for (i = 0; i < 줄수; i++) {
            htxt[i].setBounds(x, y, 50, 20);       itxt[i].setBounds(x+60, y, 50, 20);
            mtxt[i].setBounds(x+120, y, 30, 20); ftxt[i].setBounds(x+190, y, 30, 20);
            atxt[i].setBounds(x+250, y, 30, 20);  rtxt[i].setBounds(x+310, y, 30, 20);
            y = y + 25;
        }
        완료단추.setBounds(220, 450, 60, 25);

        add(hlbl);  add(ilbl);
        add(mlbl);  add(flbl);  add(albl);  add(rlbl);
        for (i = 0; i < 줄수; i++) {
            add(htxt[i]);  add(itxt[i]);  add(mtxt[i]);
            add(ftxt[i]);  add(atxt[i]);  add(rtxt[i]);
        }
        add(완료단추);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

    }

}


