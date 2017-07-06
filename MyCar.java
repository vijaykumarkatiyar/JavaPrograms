package awtfolder;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyCar extends JPanel
{
	static int width=800;
	static int height=500;
	static int speed=10;
public void paintComponent(Graphics g)
{
	super.paintComponent(g);
	g.drawLine(100+speed, 100	, 400+speed, 100);
	g.drawLine(100+speed, 100	, 100+speed, 300);
	g.drawLine(100+speed, 300, 200+speed, 300);
	g.drawLine(300+speed, 300, 400+speed, 300);
	g.drawLine(400+speed, 300, 500+speed, 300);
	g.drawLine(400+speed, 100, 400+speed, 200);
	g.drawLine(400+speed, 200, 500+speed, 200);
	g.drawLine(500+speed, 200, 500+speed, 300);
	g.drawOval(200+speed, 250, 100, 100);
	pause(100);
	speed=speed+10;
	repaint();
}
public static void pause(int time)
{
	 try
      {
       Thread.sleep(time);
      }
      catch(InterruptedException e)
      {
      }
}
public static void main(String s[])
{
	MyCar m1=new MyCar();
	JFrame fr=new JFrame();
	fr.add(m1);
	fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
	fr.setSize(width,height);
	fr.setVisible(true);
}
}
