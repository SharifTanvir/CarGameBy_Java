package game1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class GameOver extends JFrame {

    private static JFrame over;
    private ImageIcon gOver;
    private JLabel ForgOver;
    private JTextField tf;

    public GameOver(int point) {
        over = new JFrame("MY GAME");
        over.setLayout(null);
        over.setSize(700,600);
        over.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        over.setVisible(true);

        tf = new JTextField();
        over.add(tf);
        tf.setEditable(false);
        String s = Integer.toString(point);
        tf.setBackground(Color.DARK_GRAY);
        tf.setForeground(Color.RED);
        tf.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));
        tf.setText(" YOUR SCORE : "+s);
        tf.setBounds(230,350,200,30);
        over.setVisible(true);

        gOver= new ImageIcon(getClass().getResource("gameover.jpg"));
        ForgOver=new JLabel(gOver);
        over.add(ForgOver);
        ForgOver.setBounds(0,0,700,600);
        over.setVisible(true);



    }
}

