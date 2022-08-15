package Applets;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;

public class FlagPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.decode("#FF7722"));
        g.drawRect(10,10,350, 70);
        g.fillRect(10,10,350,70);
        g.setColor(Color.WHITE);
        g.drawRect(10, 80,350,70);
        g.fillRect(10,80,350,70);
        g.setColor(Color.decode("#228B22"));
        g.drawRect(10,150, 350, 70);
        g.fillRect(10,150,350,70);

        try{
            Image image = ImageIO.read(new FileInputStream("src/ashok.png"));
            g.drawImage(image, 155,80,70,70,null);
            g.setColor(Color.BLACK);
            g.drawRect(10,10,5,450);
            g.setFont(new Font("Lato", Font.BOLD,70));
            g.setColor(Color.ORANGE);
            g.drawString("Happy Independence Day !! 😊",25,400);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
