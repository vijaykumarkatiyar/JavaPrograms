package awtfolder;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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
        int x[]=new int[300];
    	int y[]=new int[300];
        for(int i=0;i<300;i++)
    	{
    		 x[i]=random.nextInt(width);
        	 y[i]=random.nextInt(height);
    	}
        for(int i=0;i<300;i++)
    	{
        int randw=random.nextInt(50);
    	for(int j=0;j<300;j++)
    	{
    		if(j!=i)
    		{    
    		 r1 = new Rectangle(x[i], y[i], randw, randw);
             r2 = new Rectangle(x[j], y[j], randw, randw);
             System.out.println(flag+"-----------------------------------------------");
              overlap=r1.intersects(r2);
              if(overlap==true)
              {
            	 flag=true; 
              }
    	     }
    		
    	}
    	System.out.println(flag);
    	int r=random.nextInt(255);
    	int gr=random.nextInt(255);
    	int b=random.nextInt(255);
    	Color c1=new Color(r,gr,b);
    	if(flag==false)
    	{
    		
        	g2d.setColor(c1);
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
