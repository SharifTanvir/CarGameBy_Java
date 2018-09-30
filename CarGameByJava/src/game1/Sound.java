package game1;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import sun.audio.*;
import java.awt.event.*;
import java.io.*;
public class Sound {
    private Clip clip;

    public  Sound(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("mp.wav"));
            clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );
        }

        catch(Exception e)  {
            e.printStackTrace( );
        }

    }

    public void stopMusic(){
        clip.stop();
    }
    public void startMusic(){
        clip.start();
    }
}
