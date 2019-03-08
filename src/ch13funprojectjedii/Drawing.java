package ch13funprojectjedii;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

/**
 * a program for drawing something fun
 * 
 * @author jedii
 * @version 030719
 */

class Drawing extends JPanel {
  @Override public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    // the colorscheme used is
    // https://coolors.co/114b5f-456990-e4fde1-f45b69-6b2737
    
    setBackground(new Color(17, 75, 95)); // set the background color
    
    // title the work
    Font custom = new Font("Monospaced", Font.PLAIN, 30);
    g.setFont(custom);
    g.setColor(new Color(228, 253, 225));
    g.drawString("wrath", 50, 900);
    
    // draw O's
    g.setColor(new Color(244, 91, 105));
    g.fillOval(500, 200, 300, 500); // left
    g.fillOval(1120, 200, 300, 500); // right
    
    // draw glints
    g.setColor(new Color(250, 100, 115));
    
    g.fillOval(570, 250, 50, 50); // left
    g.fillOval(1190, 250, 50, 50); // right
    
    // draw the left eyebrow
    g.setColor(new Color(244, 91, 105));
    
    // fillPolygon() takes two lists, one full of x-values, the other full
    // of y-values. it also takes a number, setting the number of points
    // the polygon has
    int[] leftEyebrowX = {480, 750, 740, 530};
    int[] leftEyebrowY = { 40, 120, 180, 100};
    g.fillPolygon(leftEyebrowX, leftEyebrowY, 4);
    
    // draw the right eyebrow
    int[] rightEyebrowX = {1440, 1170, 1180, 1390};
    int[] rightEyebrowY = {  40,  120,  180,  100};
    g.fillPolygon(rightEyebrowX, rightEyebrowY, 4);
    
    // draw the W
    int[] line1X = {752, 838, 916, 838};
    int[] line1Y = {700, 700, 946, 946};
    g.fillPolygon(line1X, line1Y, 4);
    
    int[] line2X = {916, 1002, 916, 838};
    int[] line2Y = {700,  700, 946, 946};
    g.fillPolygon(line2X, line2Y, 4);
    
    int[] line3X = {916, 1002, 1082, 1002};
    int[] line3Y = {700,  700,  946,  946};
    g.fillPolygon(line3X, line3Y, 4);
    
    int[] line4X = {1082, 1168, 1082, 1002};
    int[] line4Y = { 700, 700,  946, 946};
    g.fillPolygon(line4X, line4Y, 4);
  }
}
