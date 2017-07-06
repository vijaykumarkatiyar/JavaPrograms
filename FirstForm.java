package awtfolder;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FirstForm {
	FirstForm()
	{
		Frame f=new Frame();
		Button b=new Button("CLICK ME");
		Label l1=new Label("USERNAME");
		Label l2=new Label("PASSWORD");
		TextField t1=new TextField();
		TextField t2=new TextField();
		l1.setBounds(100, 100, 100, 30);
		l2.setBounds(100, 140, 100, 30);
		t1.setBounds(250, 100, 200, 30);
		t2.setBounds(250, 140, 200, 30);
		b.setBounds(174,200,100,30);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(t1.getText().equals("ram")&&t2.getText().equals("password"))
				{
				System.out.println("you have sucessfully logged in");
				}
				else
				{
					System.out.println("inavlid username and password");
				}
			}
		});
		f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		f.add(b);
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		 
	}
	public static void main(String s[])
	{
		FirstForm f1=new FirstForm();
	}

}
