package game1;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.*;

public class Window extends JFrame implements ActionListener {
    private static JFrame f;
    public JButton newG;
    private JButton about;
    private JButton sett;
    private JButton exit;
    private ImageIcon image1;
    private JLabel label1;
    public Sound music;


    public Window(){
        music=new Sound();

        image1 = new ImageIcon(getClass().getResource("menuBack.jpg"));
        label1=new JLabel(image1);
        f.add(label1);
        label1.setBounds(0,0,700,600);

        newG = new JButton("NEW GAME");
        f.add(newG);
        newG.setBackground(Color.DARK_GRAY);
        newG.setForeground(Color.RED);
        newG.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        newG.setBounds(285,200,150,35);
        newG.addActionListener(this);
        f.setVisible(true);

        about = new JButton("ABOUT GAME");
        f.add(about);
        about.setBackground(Color.DARK_GRAY);
        about.setForeground(Color.RED);
        about.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        about.setBounds(285,320,150,35);
        about.addActionListener(this);
        f.setVisible(true);

        sett = new JButton("MUSIC");
        f.add(sett);
        sett.setBackground(Color.DARK_GRAY);
        sett.setForeground(Color.RED);
        sett.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        sett.setBounds(285,260,150,35);
        sett.addActionListener(this);
        f.setVisible(true);

        exit = new JButton("EXIT");
        f.add(exit);
        exit.setBackground(Color.DARK_GRAY);
        exit.setForeground(Color.RED);
        exit.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        exit.setBounds(285,380,150,35);
        exit.addActionListener(this);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==newG){
            GameLevel g = new GameLevel();
        }
        else if(e.getSource()==about){
            PopUp p=new PopUp();
        }
        else if(e.getSource()==sett){
            PopUp p=new PopUp("SOUND",music);
        }
        else{
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        f = new JFrame("MY GAME");
        f.setLayout(null);
        f.setSize(700, 600);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);

        new Window();
    }
}
