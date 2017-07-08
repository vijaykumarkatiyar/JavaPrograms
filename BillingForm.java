package awtfolder;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author AKSHAT
 */
public class BillingForm {
    String item;
    static int ah=30;
    static int aw=100;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    static int h=250,p=0,qty,sum=0;

    void list()
    {
        JFrame fr=new JFrame("SUPERMARKET");
        JLabel head1=new JLabel("ITEMS");
         JLabel head2=new JLabel("QUANTITY");
          JLabel head3=new JLabel("PRICE");
        JLabel l1=new JLabel("AMUL MILK- Rs.22");
        JLabel l2=new JLabel("WHEY PROTEIN- Rs.240");
        JLabel l3=new JLabel("BROWN BREAD- Rs.20");
        JLabel l4=new JLabel("BISCUIT- Rs.10");
        JLabel l5=new JLabel("CASHEW- Rs.100");
        JLabel l6=new JLabel("BUTTER- Rs.30");
        JLabel l7=new JLabel("EGGS- Rs.10");
        JLabel l8=new JLabel("MAGGI- Rs.20");
        JLabel l9=new JLabel("SHAMPOO- Rs.250");
        JLabel l10=new JLabel("DEO- Rs.300");
        Button b=new Button("TOTAL");
         head1.setBounds(2,200, 100, 50);
        head2.setBounds(100,200, 100, 50);
        head3.setBounds(200,200, 100, 50);
        b.setBounds(400, 400, aw, ah);
        l1.setBounds(2,2,aw,ah);
        l2.setBounds(100,2,aw,ah);
        l3.setBounds(200,2,aw,ah);
        l4.setBounds(300,2,aw,ah);
        l5.setBounds(400,2,aw,ah);
        l6.setBounds(2,100,aw,ah);
        l7.setBounds(100,100,aw,ah);
        l8.setBounds(200,100,aw,ah);
        l9.setBounds(300,100,aw,ah);
        l10.setBounds(400,100,aw,ah);
        l1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                l1.setBounds(2, h, aw, ah);
                p=22;
                JTextField t1=new JTextField("5");
                JTextField pr1=new JTextField("enter qty");
                qty =Integer.parseInt(t1.getText());
               String s =String.valueOf(p*qty);
                pr1.setText(s);
                t1.setBounds(100, h , aw ,ah);
                pr1.setBounds(200, h, aw, ah);
                fr.add(t1);
               
                fr.add(pr1);
                h=h+50;
                sum=sum+qty*p;
               
                
            }
        });
         l2.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
            	l2.setBounds(2, h, aw, ah);
                p=22;
                JTextField t2=new JTextField("5");
                JTextField pr2=new JTextField("enter qty");
                qty =Integer.parseInt(t2.getText());
               String s =String.valueOf(p*qty);
                pr2.setText(s);
                t2.setBounds(100, h , aw ,ah);
                pr2.setBounds(200, h, aw, ah);
                fr.add(t2);
               
                fr.add(pr2);
                h=h+50;
                sum=sum+qty*p;
                
            }
        });
          l3.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
            	l3.setBounds(2, h, aw, ah);
                p=22;
                JTextField t3=new JTextField("5");
                JTextField pr3=new JTextField("enter qty");
                qty =Integer.parseInt(t3.getText());
               String s =String.valueOf(p*qty);
                pr3.setText(s);
                t3.setBounds(100, h , aw ,ah);
                pr3.setBounds(200, h, aw, ah);
                fr.add(t3);
               
                fr.add(pr3);
                h=h+50;
                sum=sum+qty*p;
                
            }
        });
           l4.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
            	l4.setBounds(2, h, aw, ah);
                p=22;
                JTextField t4=new JTextField("5");
                JTextField pr4=new JTextField("enter qty");
                qty =Integer.parseInt(t4.getText());
               String s =String.valueOf(p*qty);
                pr4.setText(s);
                t4.setBounds(100, h , aw ,ah);
                pr4.setBounds(200, h, aw, ah);
                fr.add(t4);
               
                fr.add(pr4);
                h=h+50;
                sum=sum+qty*p;
            }
        });
            l5.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
            	l5.setBounds(2, h, aw, ah);
                p=22;
                JTextField t5=new JTextField("5");
                JTextField pr5=new JTextField("enter qty");
                qty =Integer.parseInt(t5.getText());
               String s =String.valueOf(p*qty);
                pr5.setText(s);
                t5.setBounds(100, h , aw ,ah);
                pr5.setBounds(200, h, aw, ah);
                fr.add(t5);
               
                fr.add(pr5);
                h=h+50;
                sum=sum+qty*p;
                
            }
        });
             l6.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
            	l6.setBounds(2, h, aw, ah);
                p=22;
                JTextField t6=new JTextField("5");
                JTextField pr6=new JTextField("enter qty");
                qty =Integer.parseInt(t6.getText());
               String s =String.valueOf(p*qty);
                pr6.setText(s);
                t6.setBounds(100, h , aw ,ah);
                pr6.setBounds(200, h, aw, ah);
                fr.add(t6);
               
                fr.add(pr6);
                h=h+50;
                sum=sum+qty*p;
                
            }
        });
              l7.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
            	l7.setBounds(2, h, aw, ah);
                p=22;
                JTextField t7=new JTextField("5");
                JTextField pr7=new JTextField("enter qty");
                qty =Integer.parseInt(t7.getText());
               String s =String.valueOf(p*qty);
                pr7.setText(s);
                t7.setBounds(100, h , aw ,ah);
                pr7.setBounds(200, h, aw, ah);
                fr.add(t7);
               
                fr.add(pr7);
                h=h+50;
                sum=sum+qty*p;
            }
        });
               l8.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
            	l8.setBounds(2, h, aw, ah);
                p=22;
                JTextField t8=new JTextField("5");
                JTextField pr8=new JTextField("enter qty");
                qty =Integer.parseInt(t8.getText());
               String s =String.valueOf(p*qty);
                pr8.setText(s);
                t8.setBounds(100, h , aw ,ah);
                pr8.setBounds(200, h, aw, ah);
                fr.add(t8);
               
                fr.add(pr8);
                h=h+50;
                sum=sum+qty*p;
            }
        });
                l9.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
            	l9.setBounds(2, h, aw, ah);
                p=22;
                JTextField t9=new JTextField("5");
                JTextField pr9=new JTextField("enter qty");
                qty =Integer.parseInt(t9.getText());
               String s =String.valueOf(p*qty);
                pr9.setText(s);
                t9.setBounds(100, h , aw ,ah);
                pr9.setBounds(200, h, aw, ah);
                fr.add(t9);
               
                fr.add(pr9);
                h=h+50;
                sum=sum+qty*p;
            }
        });
                 l10.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
            	l10.setBounds(2, h, aw, ah);
                p=22;
                JTextField t10=new JTextField("5");
                JTextField pr10=new JTextField("enter qty");
                qty =Integer.parseInt(t10.getText());
               String s =String.valueOf(p*qty);
                pr10.setText(s);
                t10.setBounds(100, h , aw ,ah);
                pr10.setBounds(200, h, aw, ah);
                fr.add(t10);
               
                fr.add(pr10);
                h=h+50;
                sum=sum+qty*p;
                
                
            }
        });
                 b.addActionListener(new ActionListener()
                 {
                     @Override
                     public void actionPerformed(ActionEvent e)
                     {
                         JTextField total=new JTextField(Integer.toString(sum));
                         total.setBounds(400, 450, aw, ah);
                         fr.add(total);
                         
                     }
                     
                 }
                 );
                 fr.add(b);
                 fr.add(l1);
                 fr.add(l2);
                 fr.add(l3);
                 fr.add(l4);
                 fr.add(l5);
                 fr.add(l6);
                 fr.add(l7);
                 fr.add(l8);
                 fr.add(l9);
                 fr.add(l10);
                 fr.add(head1);
                 fr.add(head2);
                 fr.add(head3);
                 fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
                 fr.setSize(1000,1000);
                 fr.setLayout(null);
                 fr.setVisible(true);
                 
        
       
        }
                
        
        
        
 
    public static void main(String[] args) 
{

        BillingForm obj=new BillingForm();
        obj.list();
          

    }
    
}
