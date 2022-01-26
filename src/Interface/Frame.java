package Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Frame extends JFrame implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b.getText()=="BankAccount")
		{
			this.dispose();
			Bankkk B = new Bankkk();
			B.setVisible(true);
		}
		else
		{
			if(b.getText()=="-ORDER1-")
			{
				Test.select = 0;
				this.dispose();
			}
			else if(b.getText()=="-ORDER2-")
			{
				Test.select = 1;
				this.dispose();
			}
			else if(b.getText()=="-ORDER3-")
			{
				Test.select = 2;
				this.dispose();
			}
			else if(b.getText()=="-ORDER4-")
			{
				Test.select = 3;
				this.dispose();
			}
			else if(b.getText()=="-ORDER5-")
			{
				Test.select = 4;
				this.dispose();
			}
			else if(b.getText()=="-ORDER6-")
			{
				Test.select = 5;
				this.dispose();
			}
			FrameOne One = new FrameOne();
			One.setVisible(true);
		}
	}
	
	  public Frame() {
		  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  int height = screenSize.height;
		  int width = screenSize.width;
		  setSize(width/2, height);

		  setLocationRelativeTo(null);
		  JPanel panel = new JPanel()
				 {
			  			public void paintComponent(Graphics g) {
			  			ImageIcon BG =  new ImageIcon("bg2.jpg");
			  			Image newBG = BG.getImage();
			  			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
				  }
				 };
		 
		 JPanel panel2 = new JPanel();
		 JPanel panel3 = new JPanel();
		 JPanel panel4 = new JPanel();
		 JPanel panel5 = new JPanel()
		 {
	  			public void paintComponent(Graphics g) {
	  			ImageIcon BG =  new ImageIcon("cats.jpg");
	  			Image newBG = BG.getImage();
	  			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
		  }
		 };
		//add(backgroundImageLabel);
		  ImageIcon img1 =  new ImageIcon("5-3.jpg");
		  ImageIcon img2 =  new ImageIcon("1-2.jpg");
		  ImageIcon img3 =  new ImageIcon("2-2.jpg");
		  ImageIcon img4 =  new ImageIcon("3-2.jpg");
		  ImageIcon img5 =  new ImageIcon("4-3.jpg");
		  ImageIcon img6 =  new ImageIcon("6-2.jpg");
		  ImageIcon img7 =  new ImageIcon("aaaa.jpg");
		  ImageIcon img8 =  new ImageIcon("sdsds.jpg");
		  ImageIcon img9 =  new ImageIcon("sdsds.jpg");
		  
		    Image newImg71 = img7.getImage().getScaledInstance(1000,200,1000);
			ImageIcon newImg7 =  new ImageIcon(newImg71);
			JLabel labelpic7 = new JLabel(newImg7);
			panel2.add(labelpic7);
			
		    Image newImg81 = img8.getImage().getScaledInstance(100,1000,100);
			ImageIcon newImg8 =  new ImageIcon(newImg81);
			JLabel labelpic8 = new JLabel(newImg8);
			panel3.add(labelpic8);
			
			Image newImg91 = img8.getImage().getScaledInstance(100,1000,100);
			ImageIcon newImg9 =  new ImageIcon(newImg91);
			JLabel labelpic9 = new JLabel(newImg9);
			panel4.add(labelpic9);		
			
		  JLabel label = new JLabel("Nontri Food");
			
			
		  ImageIcon sumimg[]= {img1,img2,img3,img4,img5,img6};
		  JButton a[]= new JButton[6];
		  String S[] = {"-ORDER1-","-ORDER2-","-ORDER3-","-ORDER4-","-ORDER5-","-ORDER6-"};
		  for(int i=0;i<6;i++)
		  {
			  a[i] = new JButton(S[i]);
			  Font bigFont = a[i].getFont().deriveFont(Font.PLAIN,20f);
			  a[i].setFont(bigFont);
			  a[i].setBounds(10, 10, 10, 10);
			  
		  }
		  int k=0;
		  int l=0;
		for(int i=0;i<4;i++)
		{
			if(i==0 || i==2)
			{
				for(int j=k;j<3+k;j++)
				{
					Image newImg = sumimg[j].getImage().getScaledInstance(200,100,200);
					ImageIcon newImg1 =  new ImageIcon(newImg);
					JLabel labelpic = new JLabel(newImg1);
					panel.add(labelpic);
					
				}
				k+=3;
			}
			else
			{
				for(int j=l;j<3+l;j++)
				{
					panel.add(a[j]);
					a[j].addActionListener(this);
					
				}
				l+=3;
			}
			
			
		}	
		
	    setTitle("Nontri Food");
	    setSize(1024,768);
	    
	    
	    
	    JButton c= new JButton("BankAccount");
	    Font bigFont = c.getFont().deriveFont(Font.PLAIN,20f);
		c.setFont(bigFont);
	    panel5.add(c);
	    c.addActionListener(this);
  
	    JTextArea textArea = new JTextArea();
	    panel.setLayout(new GridLayout(4,10,100,20));
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container main = getContentPane();
	    //main.add(panel2,BorderLayout.BEFORE_FIRST_LINE);
	    main.add(panel3,BorderLayout.WEST);
	    main.add(panel4,BorderLayout.EAST);
	    main.add(panel2,BorderLayout.BEFORE_FIRST_LINE);
	    main.add(panel,BorderLayout.CENTER);
	    main.add(panel5,BorderLayout.PAGE_END);
	    
	    
	    //main.add(contentPane);
	   
	  }
	 
 }