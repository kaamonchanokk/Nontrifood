package Interface;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Bankkk extends JFrame implements ActionListener{
	
 
    public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b.getText()=="Exit")
		{
			this.dispose();
			Frame main = new Frame();
			main.setVisible(true);
		}
    }
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel() {
		  public void paintComponent(Graphics g) {
			ImageIcon BG =  new ImageIcon("cats2.jpg");
			Image newBG = BG.getImage();
			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
	  }
	};
	JPanel panel4 = new JPanel() {
		  public void paintComponent(Graphics g) {
			ImageIcon BG =  new ImageIcon("bbb.jpg");
			Image newBG = BG.getImage();
			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
	  }
	};
	JPanel panel5 = new JPanel() {
		  public void paintComponent(Graphics g) {
			ImageIcon BG =  new ImageIcon("cats2.jpg");
			Image newBG = BG.getImage();
			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
	  }
	};
	JPanel panel6 = new JPanel() {
		  public void paintComponent(Graphics g) {
			ImageIcon BG =  new ImageIcon("cats2.jpg");
			Image newBG = BG.getImage();
			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
	  }
	};
	JLabel lb1 = new JLabel("Customer Name : ");
	JLabel lb2 = new JLabel("Account Number : ");
	JLabel lb5 = new JLabel("Account Number : ");
	JLabel lb3 = new JLabel("Balance : ");
	
	JLabel tt1 = new JLabel("");
	JLabel tt2 = new JLabel("");
	JLabel lb4 = new JLabel("");
	JLabel lb6 = new JLabel("");
	
	JTextField t1 = new JTextField("");
	JTextField t2 = new JTextField("");
	JTextField t3 = new JTextField("");

	JButton c1= new JButton("Search");
	
    
	//JButton c2= new JButton("Change");
	//JButton c3= new JButton("Change");
	
	
	 public Bankkk() {
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  int height = screenSize.height;
		  int width = screenSize.width;
		  setSize(width/2, height);

		  setLocationRelativeTo(null);
		 setTitle("BankAccount");
		
		//panel1.add(t1);
		//panel1.add(c1);
		panel1.add(lb2);
		//panel1.add(tt2);
		panel1.add(t2);
		panel1.add(c1);
		//panel1.add(lb1);
		//panel1.add(tt1);
		//panel1.add(lb6);
		//panel1.add(c2);
		panel1.add(lb3);
		panel1.add(lb4);
		//panel1.add(c3);
		
		c1.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent ae){
				  String str = t2.getText();
					    if(str != null)
					    {
					    	int flag=0;
					    	int str2;
					    	str2= Integer.parseInt(str);
					    	 if(str != null)
							    {
							    		int k=0;
								    	str2= Integer.parseInt(str);
								    	for (Account Ac : Test.getBank().getAccount()) {
								    		if(str2== Ac.getID())
								    		{
								    			flag=1;
								    			break;
								    		}
								    		k++;
										}
								    	if (flag == 1) {
								    		lb4.setText(""+Test.getBank().getAccount().get(k).getMoney()+"ß");
								    		JOptionPane.showMessageDialog(null, 
													"You Account Number : " + str , "Account Number", 
													JOptionPane.INFORMATION_MESSAGE);
									    }
								    	else
								    	{
								    				lb4.setText("");
								    		        JOptionPane.showMessageDialog(null, 
								    				"Not found Account Number", "Account Number", 
								    				JOptionPane.INFORMATION_MESSAGE);
								    		   
								    	}
							    }
					     
					  }
			  }
			});
		
		/*c2.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent ae){
				  String str = JOptionPane.showInputDialog(null, 
							"Enter New Account Number : ", "New Account Number", 
							JOptionPane.PLAIN_MESSAGE);
					    if(str != null)
					      JOptionPane.showMessageDialog(null, 
							"You Account Number : " + str, "Account Number", 
							JOptionPane.INFORMATION_MESSAGE);
					  }
			});*/
		
		setSize(800,600);
		panel4.setLayout(new GridLayout(20,10,100,20));
		panel1.setLayout(new GridLayout(2,3));
		//panel1.setLayout(new GridLayout(3,3));
	    Font bigFont = t1.getFont().deriveFont(Font.PLAIN,40f);
	    Font bigFont2 = t1.getFont().deriveFont(Font.PLAIN,20f);
	    Font bigFont3 = t1.getFont().deriveFont(Font.PLAIN,30f);
	    lb1.setFont(bigFont2);
	    lb2.setFont(bigFont2);
	    lb3.setFont(bigFont2);
	    tt1.setFont(bigFont2);
	    tt2.setFont(bigFont2);
	    lb4.setFont(bigFont2);
	    t1.setFont(bigFont2);
	    t2.setFont(bigFont2);
	    t3.setFont(bigFont2);
	    c1.setFont(bigFont2);
	   // c2.setFont(bigFont2);
  
	    //JButton E1= new JButton("Deposit");
	    //JButton E2= new JButton("Withdraw");
	    JButton E3= new JButton("Exit");
	    
	  
	    
	    
	   // E1.setFont(bigFont2);   
	   // E2.setFont(bigFont2);
	    E3.setFont(bigFont2);	    
		//panel6.add(E1);
		//panel6.add(E2);
		panel6.add(E3);
		E3.addActionListener(this);
		
		/*
		E1.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent ae){
				  String str = JOptionPane.showInputDialog(null, 
							"Enter Deposit : ", "Deposit", 
							JOptionPane.PLAIN_MESSAGE);
					    if(str != null)
					      JOptionPane.showMessageDialog(null, 
					    	"Deposit : " + str+"ß"+"\n"+	
							"You money : " + str+"ß", "Deposit", 
							JOptionPane.INFORMATION_MESSAGE);
					  }
			});
		E2.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent ae){
				  String str = JOptionPane.showInputDialog(null, 
							"Enter Withdraw : ", "Withdraw", 
							JOptionPane.PLAIN_MESSAGE);
					    if(str != null)
					      JOptionPane.showMessageDialog(null, 
					    	"Withdraw : " + str+"ß"+"\n"+	
							"You money : " + str+"ß", "Deposit", 
							JOptionPane.INFORMATION_MESSAGE);
					  }
			});
		*/
	
	    Container main = getContentPane();
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    main.add(panel4,BorderLayout.NORTH);
	    main.add(panel3,BorderLayout.WEST);
	    main.add(panel1,BorderLayout.CENTER);
	    main.add(panel2,BorderLayout.EAST);
	    main.add(panel6,BorderLayout.SOUTH);
	    main.add(panel5,BorderLayout.EAST);
	 }
}
