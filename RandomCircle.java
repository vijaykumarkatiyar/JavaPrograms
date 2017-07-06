package awtfolder;

 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomCircle extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int width=500;
	static int height=500;
    public void paintComponent(Graphics g)
	{
    	//super.paintComponent(g);
    	setBackground(Color.BLACK);
    	for(int i=0;i<25;i++)
    	{
    	Random random=new Random();
    	int randx=random.nextInt(width);
    	int randy=random.nextInt(height);
    	float r = random.nextFloat();
    	float gr = random.nextFloat();
    	float b = random.nextFloat();
    	Graphics2D g2=(Graphics2D)g;
    	Color c1=new Color(r,gr,b);
    	g2.setColor(c1);
    	g2.fillOval(randx,randy,25,25);
    	
    	}
	  
		//g.drawOval(10, 10, 100, 100);
		
		
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
		RandomCircle g1=new RandomCircle();
		JFrame fr=new JFrame("my frame");
		fr.add(g1);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(width, height);
		//fr.setBackground(Color.black);
		//fr.setLayout(null);
		fr.setVisible(true);
		 
	}


}
