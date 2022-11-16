// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);


        // Draw Random Lines
        Random rand = new Random(7442);
        for (int k = 0; k <= 100; k++) {
            int x1 = rand.nextInt(390) + (10);
            int y1 = rand.nextInt(280) + (10);
            int x2 = rand.nextInt(390) + (10);
            int y2 = rand.nextInt(280) + (10);
            int c1 = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);
            g.drawLine(x1, y1, x2, y2);
            g.setColor(new Color(c1,c2,c3));
        }
        // Draw Random Squares
        for(int k = 0; k<= 100; k++){
        int rx1 = (int) (Math.random() * 331 + 400);
        int ry1 = (int) (Math.random() * 231 + 10);
        int width = 50;
        int height = 50;
        int c1 = rand.nextInt(255);
        int c2 = rand.nextInt(255);
        int c3 = rand.nextInt(255);
            g.fillRect(rx1, ry1, width, height);
            g.setColor(new Color(c1,c2,c3));

         }
        // Draw Random Circles
        for(int k = 0; k<= 100; k++){
            int diameter = rand.nextInt(200);
            int ox1 = rand.nextInt(390 - diameter)+10;
            int oy1 = rand.nextInt(290 - diameter)+300;
            int c1 = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);
            g.drawOval(ox1,oy1,diameter, diameter);
            g.setColor(new Color(c1,c2,c3));
        }
            // Draw 3-D Box




    }

}



    
 