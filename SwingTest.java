package awtfolder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingTest 
{
	static int x=0;
	static int y=0;
	static int width=100;
	static int height=30;
	public SwingTest()
	{
		 JFrame fr=new JFrame("SWING TEST");
		 JButton b=new JButton("CLICK ME");
		// JLabel l1=new JLabel("USERNAME");
	   //  JLabel l2=new JLabel("PASSWORD");
	   //  JTextField t1=new JTextField();
		 JPasswordField t2=new JPasswordField();
		 b.setBounds(x,y,100,30);
		 b.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==40)
				{
					b.setBounds(x, y+=10, width, height);
				}
				if(e.getKeyCode()==38)
				{
					b.setBounds(x, y-=10, width, height);
				}
				if(e.getKeyCode()==39)
				{
					b.setBounds(x+=10, y, width, height);
				}
				if(e.getKeyCode()==37)
				{
					b.setBounds(x-=10, y, width, height);
				}
			}
		});
		 {
			 
		 }
		// l1.setBounds(100, 100, 100, 30);
		// l2.setBounds(100, 140, 100, 30);
		// t1.setBounds(250, 100, 200, 30);
		 t2.setBounds(250, 140, 200, 30);
	 
		 fr.add(b);
		// fr.add(l1);
		// fr.add(l2);
		// fr.add(t1);
		 fr.add(t2);
		 fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
		 fr.setSize(500,500);
		 fr.setLayout(null);
		 fr.setVisible(true);
		
	}
	public static void main(String s[])
	{
		SwingTest s1=new SwingTest();
	}

}
