package awtfolder;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsTest extends JPanel
{
	static int x1=50;
	static int y1=50;
	static int width=500;
	static int height=500;
	static int speedval=50;
	static int speed=speedval;

	public void paintComponent(Graphics g)
	{
	    
			//repaint();
	   super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(x1, y1, 100, 100);
		if(x1>width-100)
		{
			speed = -speedval;
		}
		else if (x1<0) {
			speed = speedval;
			
		}
		x1=x1+speed;
		pause(100);
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
		GraphicsTest g1=new GraphicsTest();
		JFrame fr=new JFrame("my frame");
		JButton b=new JButton("DARE");
		b.setBounds(0,0,100,30);
		fr.add(b);
		fr.add(g1);
		fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
		fr.setSize(width, height);
		//fr.setBackground(Color.black);
		//fr.setLayout(null);
		fr.setVisible(true);
		 
	}


}
