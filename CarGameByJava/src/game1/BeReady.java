package game1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeReady extends JFrame implements ActionListener {
    private static JFrame ready;
    private ImageIcon beReady;
    private JLabel ForbeReady;
    private JButton Bready;

    public BeReady(){
        ready = new JFrame("LEVEL 02");
        ready.setLayout(null);
        ready.setSize(700, 600);
        ready.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ready.setVisible(true);

        Bready = new JButton("CONFIRM");
        ready.add(Bready);
        Bready.setBackground(Color.WHITE);
        Bready.setForeground(Color.RED);
        Bready.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        Bready.setBounds(420,300,120,35);
        Bready.addActionListener(this);
        ready.setVisible(true);

        beReady= new ImageIcon(getClass().getResource("nextlvl.jpg"));
        ForbeReady=new JLabel(beReady);
        ready.add(ForbeReady);
        ForbeReady.setBounds(0,0,700,600);
        ready.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==Bready) {

            GameLevel2 next =new GameLevel2();
            ready.setVisible(false);
        }

    }

}
