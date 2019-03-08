package ch13funprojectjedii;

import javax.swing.JFrame;

/**
 * the driver for drawing something fun
 * 
 * @author jedii
 * @version 030719
 */

public class Driver {
  public static void main(String[] args) {
    JFrame window = new JFrame();
    Drawing drawing = new Drawing();
    
    window.add(drawing);
    window.setTitle("OWeOwasabi");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(1920, 1080);
    window.setVisible(true);
  }
}
