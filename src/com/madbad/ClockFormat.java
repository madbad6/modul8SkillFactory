package com.madbad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockFormat extends JFrame implements ActionListener {

    private JLabel label = new JLabel();
    private SimpleDateFormat form = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public void getJFrame(){
        Timer timer = new Timer(1000, this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(label);
        setSize(200, 200);
        setTitle("Clock");
        setVisible(true);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = form.format(Calendar.getInstance().getTime());
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText(s);
    }
}
