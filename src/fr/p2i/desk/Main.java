package fr.p2i.desk;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main(){
        this.setSize(100,100);
        this.add(new JLabel("yo ma team"));
        this.setUndecorated(true);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Main a = new Main();

    }
}
