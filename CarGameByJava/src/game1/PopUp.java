package game1;

import sun.audio.AudioPlayer;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.*;

public class PopUp extends JFrame implements ActionListener{

    private JFrame g;
    private JButton on;
    private JButton off;
    private JButton ok;
    private ImageIcon abt;
    private JLabel forabt;
    public Sound sound;

    public PopUp(){

        g = new JFrame();
        g.setTitle("ABOUT");
        g.setLayout(null);
        g.setBounds(220,270,310,225);
        g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        g.setVisible(true);



        ok = new JButton("OK");
        g.add(ok);
        ok.setBackground(Color.DARK_GRAY);
        ok.setForeground(Color.RED);
        ok.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        ok.setBounds(190,140,70,35);
        ok.addActionListener(this);
        g.setVisible(true);

        abt = new ImageIcon(getClass().getResource("about.jpg"));
        forabt=new JLabel(abt);
        g.add(forabt);
        forabt.setBounds(0,0,300,200);
        g.setVisible(true);
    }

    public PopUp(String msg,Sound mic) {

        sound=mic;
        g = new JFrame();
        g.setTitle(msg);
        g.setLayout(null);
        g.setBounds(220,270,300, 150);
        g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        g.setVisible(true);

        on = new JButton("ON");
        g.add(on);
        on.setBackground(Color.DARK_GRAY);
        on.setForeground(Color.RED);
        on.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        on.setBounds(30,20,70,35);
        on.addActionListener(this);
        g.setVisible(true);

        off = new JButton("OFF");
        g.add(off);
        off.setBackground(Color.DARK_GRAY);
        off.setForeground(Color.RED);
        off.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        off.setBounds(180,20,70,35);
        off.addActionListener(this);
        g.setVisible(true);

        ok = new JButton("OK");
        g.add(ok);
        ok.setBackground(Color.DARK_GRAY);
        ok.setForeground(Color.RED);
        ok.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        ok.setBounds(105,70,70,35);
        ok.addActionListener(this);
        g.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ok) {
            g.setVisible(false);
        }
        if(e.getSource()==on){
             sound.startMusic();

        }
        if(e.getSource()==off){
            sound.stopMusic();


        }
    }

}