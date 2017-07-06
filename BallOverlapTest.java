package awtfolder; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class OverlappingTest extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int x1=0;
	static int y1=250;
	static int x2=400;
	static int y2=250;
	static int width=500;
	static int height=500;
	static int speedval=50;
	static int speed=speedval;
	static int speedval2=50;
	static int speed2=speedval2;
	 
    public void paintComponent(Graphics g)
	{
    	setBackground(Color.BLACK);
    	super.paintComponent(g);
    	Graphics2D g2=(Graphics2D)g;
    	g.setColor(Color.CYAN);
		g2.fillOval(x1, y1, 100, 100);
		if(x1>=width-100)
		{
			speed = -speedval;
		}
		else if (x1<=0) {
			speed = speedval;
			
		}
		x1=x1+speed;
		g.setColor(Color.ORANGE);
		g2.fillOval(x2, y2, 100, 100);
		if(x2<=0)
		{
			speed2 = -speedval2;
		}
		else if (x2>=width-100) {
			speed2 = speedval2;
			
		}
		x2=x2-speed2;
		 System.out.println(" x1= "+x1+" x2 = "+ x2);
		 //collision detection
		if (x1==x2)
				 {
			      g.setColor(Color.WHITE);
			      g.drawString("COLLISION BOOM", x1, y1+120);
				  speed=-speedval;
				  speed2=-speedval2;
				  
				}
		pause(400);
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
		OverlappingTest g1=new OverlappingTest();
		JFrame fr=new JFrame("my frame");
		fr.setBackground(Color.BLACK);
		fr.add(g1);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(width, height);
		//fr.setBackground(Color.black);
		//fr.setLayout(null);
		fr.setVisible(true);
		 
	}


}
