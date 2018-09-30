package game1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameLevel extends JFrame implements ActionListener,KeyListener {
    private static JFrame f;
    private ImageIcon road;
    private JLabel GameBack;
    private ImageIcon car;
    private ImageIcon car2;
    private ImageIcon car3;
    private ImageIcon car4;
    private ImageIcon car5;
    private ImageIcon car6;
    private ImageIcon car7;
    private ImageIcon car8;
    private ImageIcon roadLine;
    private ImageIcon roadLine1;
    private ImageIcon roadLine2;
    private JLabel ForCar;
    private JLabel ForCar2;
    private JLabel ForCar3;
    private JLabel ForCar4;
    private JLabel ForCar5;
    private JLabel ForCar6;
    private JLabel ForCar7;
    private JLabel ForCar8;
    private JLabel roadline;
    private JLabel roadline1;
    private JLabel roadline2;
    private JLabel tf;

    public  int score=990;

    Timer t;

    int speed=15,carSpeed=10;

    int x=250,y=350;
    int Car2x=190,Car2y=40,Car3x=260,Car3y=-180,Car4x=320,Car4y=-80,Car5x=200,Car5y=190,Car6x=300,Car6y=80,Car7x=340,Car7y=230,Car8x=190,Car8y=255;

    int roadLinex=320,roadLiney=-8,roadLine1x=320,roadLine1y=200,roadLine2x=320,roadLine2y=400;

    public GameLevel(){

        f = new JFrame("LEVEL 01");
        f.setLayout(null);
        f.setSize(700, 600);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);

        tf = new JLabel();
        f.add(tf);
        tf.setBackground(Color.DARK_GRAY);
        tf.setForeground(Color.RED);
        tf.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));
        tf.setBounds(500,10,150,50);
        f.setVisible(true);

        car= new ImageIcon(getClass().getResource("car2.jpg"));
        ForCar=new JLabel(car);
        f.add(ForCar);
        f.setVisible(true);

        car2= new ImageIcon(getClass().getResource("car7.jpg"));
        ForCar2=new JLabel(car2);
        f.add(ForCar2);
        f.setVisible(true);
        car3= new ImageIcon(getClass().getResource("car3.jpg"));
        ForCar3=new JLabel(car3);
        f.add(ForCar3);
        f.setVisible(true);
        car4= new ImageIcon(getClass().getResource("car4.jpg"));
        ForCar4=new JLabel(car4);
        f.add(ForCar4);
        f.setVisible(true);
        car5= new ImageIcon(getClass().getResource("car6.jpg"));
        ForCar5=new JLabel(car5);
        f.add(ForCar5);
        f.setVisible(true);
        car6= new ImageIcon(getClass().getResource("car1.jpg"));
        ForCar6=new JLabel(car6);
        f.add(ForCar6);
        f.setVisible(true);
        car7= new ImageIcon(getClass().getResource("car5.jpg"));
        ForCar7=new JLabel(car7);
        f.add(ForCar7);
        f.setVisible(true);
        car8= new ImageIcon(getClass().getResource("car4.jpg"));
        ForCar8=new JLabel(car8);
        f.add(ForCar8);
        f.setVisible(true);

        roadLine= new ImageIcon(getClass().getResource("roadline.jpg"));
        roadline=new JLabel(roadLine);
        f.add(roadline);
        f.setVisible(true);
        roadLine1 = new ImageIcon(getClass().getResource("roadline1.jpg"));
        roadline1=new JLabel(roadLine1);
        f.add(roadline1);
        f.setVisible(true);
        roadLine2= new ImageIcon(getClass().getResource("roadline2.jpg"));
        roadline2=new JLabel(roadLine2);
        f.add(roadline2);
        f.setVisible(true);

        road = new ImageIcon(getClass().getResource("NEWROAD.jpg"));
        GameBack=new JLabel(road);
        f.add(GameBack);
        GameBack.setBounds(0,0,700,600);
        f.setVisible(true);
        f.addKeyListener(this);


        t= new Timer(50,this);
        t.start();

    }

    public void actionPerformed(ActionEvent e) {

        ForCar.setBounds(x,y,250,200);
        ForCar2.setBounds(Car2x,Car2y,150,100);
        ForCar3.setBounds(Car3x,Car3y,150,100);
        ForCar4.setBounds(Car4x,Car4y,150,100);
        ForCar5.setBounds(Car5x,Car5y,150,100);
        ForCar6.setBounds(Car6x,Car6y,150,100);
        ForCar7.setBounds(Car7x,Car7y,150,100);
        ForCar8.setBounds(Car8x,Car8y,150,100);

        roadline.setBounds(roadLinex,roadLiney,37,150);
        roadline1.setBounds(roadLine1x,roadLine1y,37,150);
        roadline2.setBounds(roadLine2x,roadLine2y,37,150);

        if(Car2y>480){
            Car2y=-80;
            Car2x=250;
            score+=5;
        }
        if(Car3y>480){
            Car3y=-80;
            score+=5;
        }
        if(Car4y>480){
            Car4y=-80;
            Car4x=320;
            score+=5;
        }
        if(Car5y>480){
            Car5y=-80;
            score+=5;
        }
        if(Car6y>480){
            Car6y=-80;
            score+=5;
        }
        if(Car7y>480){
            Car7y=-80;
            score+=5;

        }
        if(Car8y>480){
            Car8y=-70;
            Car8x=185;
            score+=5;
        }
        if(x>=130 && x<=180 && Car2x==208 && Car2y>=y){
            GameOver m =new GameOver(score);
            t.stop();
            f.setVisible(false);
        }
        if(x>=185 && x<=235 && Car3x==260 && Car3y>=y){
            GameOver m =new GameOver(score);
            t.stop();
            f.setVisible(false);
        }
        if(x>=335 && x<=387 && Car4x==406 && Car4y>=y){
            GameOver m =new GameOver(score);
            t.stop();
            f.setVisible(false);
        }
        if(x>=125 && x<=175 && Car5x==200 && Car5y>=y){
            GameOver m =new GameOver(score);
            t.stop();
            f.setVisible(false);
        }
       if(x>=225 && x<=275 && Car6x==300 && Car6y>=y){
            GameOver m =new GameOver(score);
            t.stop();
            f.setVisible(false);
        }
        if(x>=275 && x<=315 && Car7x==340 && Car7y>=y){
            GameOver m =new GameOver(score);
            t.stop();
            f.setVisible(false);
        }
        if(x>=65 && x<=120 && Car8x==143 && Car8y>=y){
            GameOver m =new GameOver(score);
            t.stop();
            f.setVisible(false);
        }

        if(score>=1000){
            BeReady r= new BeReady();;
            t.stop();
            f.setVisible(false);
        }

        if(roadLiney>480){
            roadLiney=-80;
        }
        if(roadLine1y>480){
            roadLine1y=-80;
        }
        if(roadLine2y>480){
            roadLine2y=-80;
        }

        Car2y+=carSpeed;
        Car2x-=1;
        Car3y+=carSpeed;
        Car4y+=carSpeed;
        Car4x+=2;
        Car5y+=carSpeed;
        Car6y+=carSpeed;
        Car7y+=carSpeed;
        Car8y+=carSpeed;
        Car8x-=1;

        roadLiney+=speed;
        roadLine1y+=speed;
        roadLine2y+=speed;

        tf.setText("SCORE : "+score);


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT && x!=60) {
            x-=5;
        }

        if (key == KeyEvent.VK_RIGHT && x!=375) {
            x+=5;
        }
        if (key == KeyEvent.VK_UP && y>285) {
            y-=5;
        }
        if (key == KeyEvent.VK_DOWN && y!=350) {

            y+=5;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {

        new GameLevel();
    }

}



