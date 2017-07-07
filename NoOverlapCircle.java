package awtfolder;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Area;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoOverlapCircle extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int counter;
	Rectangle r1;
	Rectangle r2;
	boolean overlap;
	static boolean flag=false;
	static int width=500;
	static int height=500;
    public void paintComponent(Graphics g)
	{
    	super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        Random random=new Random();
        int x[]=new int[25];
    	int y[]=new int[25];
        for(int i=0;i<25;i++)
    	{
    		 x[i]=random.nextInt(width);
        	 y[i]=random.nextInt(height);
    	}
        for(int i=0;i<25;i++)
    	{
    	for(int j=0;j<25;j++)
    	{
    		if(j!=i)
    		{    
    		 r1 = new Rectangle(x[i], y[i], 50, 50);
             r2 = new Rectangle(x[j], y[j], 50, 50);
             System.out.println(flag+"-----------------------------------------------");
              overlap=r1.intersects(r2);
              if(overlap==true)
              {
            	 flag=true; 
              }
    	     }
    		
    	}
    	System.out.println(flag);
    	if(flag==false)
    	{
    		g2d.draw(r1);
    	}
    	flag=false;
    	}
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
		NoOverlapCircle g1=new NoOverlapCircle();
		JFrame fr=new JFrame("my frame");
		fr.add(g1);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(width, height);
		//fr.setBackground(Color.black);
		//fr.setLayout(null);
		fr.setVisible(true);
		 
	}


}
