package Interface;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;


public class FrameOne extends JFrame implements ActionListener  {
	
	public Test test = new Test();
	public Orange o = new Orange();
	public Cashier ca = new Cashier();

		public JComboBox combo = new JComboBox();
		JTextField t2 = new JTextField("       ");
		JTextField t9 = new JTextField("       ");
		public JTextField t3 = new JTextField("Name");
		public JTextField[] ts3 = new JTextField[10];
		
		public JTextField t6 = new JTextField("   Price   ");
		public JTextField[] ts6 = new JTextField[10];
		
		public JTextField t7 = new JTextField("  No.   ");
		public JTextField ts7[] = new JTextField[10];
		
		public JTextField t8 = new JTextField("   Qty   ");
		public JTextField[] ts8 = new JTextField[10];
		
		public JTextField t5 = new JTextField("");
		public JTextField t4 = new JTextField("             ");
		
		JPanel panel6 = new JPanel() ;
		JPanel panel8 = new JPanel() ;
		JPanel panel7 = new JPanel() ;
		  JPanel panel5 = new JPanel() {
			  public void paintComponent(Graphics g) {
	  			ImageIcon BG =  new ImageIcon("sdsds.jpg");
	  			Image newBG = BG.getImage();
	  			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
		  }
		};
		JTextPane textPane = new JTextPane();
		int i=1;
		double sum=0;
		double op2=0;
		int op1=0;
		double sum2=0;
		public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b.getText()=="ADD")
		{
			if(combo.getSelectedItem().toString()=="- Select MainMenu -")
			{
				
			}
			else
			{
				op2 = Double.parseDouble(t2.getText().toString());
				op1 = Integer.parseInt(t9.getText().toString());
				if(op1<=0)
				{
					;
				}
				else
				{
					ts7[i-1].setText("    "+i);
					ts3[i-1].setText(combo.getSelectedItem().toString());
					ts8[i-1].setText("    "+t9.getText());
					sum2=op2*op1;
					ts6[i-1].setText("    "+sum2);
					sum+=(op2*op1);
					t4.setText(""+sum+"ß");
					i++;
					for (Food B : o.getStore().get(Test.select).getFood()) {
						if(combo.getSelectedItem().toString()==B.getName())
						{
								Test.ic.add(B, op1);
						}
					}
				}
			}
		}
			else if(b.getText()=="CANCEL")
			{
				this.dispose();
				Frame main = new Frame();
				main.setVisible(true);
			}
		}
		
		public FrameOne(){
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			  int height = screenSize.height;
			  int width = screenSize.width;
			  setSize(width/2, height);

			  setLocationRelativeTo(null);
			o = test.getOrange();
			JPanel pane = new JPanel() {
				public void paintComponent(Graphics g) {
		  			ImageIcon BG =  new ImageIcon("sdsds.jpg");
		  			Image newBG = BG.getImage();
		  			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
			  }
			};
			JPanel pane2 = new JPanel(){
	  			public void paintComponent(Graphics g) {
	  			ImageIcon BG =  new ImageIcon("bg2.jpg");
	  			Image newBG = BG.getImage();
	  			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
		  }
		  };
		  
			JLabel txt = new JLabel("Menu  :  ");
			JLabel txt2 = new JLabel("Price");
			JLabel txt3 = new JLabel("Qty");
			JTextField t = new JTextField(" ");
			
			

			JButton b = new JButton("ADD");
			b.addActionListener(this);
			combo.setEditable(true);
			combo.addItem("- Select MainMenu -");
			for (Food A : o.getStore().get(Test.select).getFood()) {
				combo.addItem(A.getName());
			}
			//combo.addItem("Spicy fried chicken with basil leaves");
			
			setTitle(o.getStore().get(Test.select).getName());
			
			
			combo.addActionListener(new ActionListener()
			{
			  public void actionPerformed(ActionEvent event) {
				  for (Food B : o.getStore().get(Test.select).getFood()) {
						if(combo.getSelectedItem().toString()==B.getName())
								{
									t2.setText(""+B.getPrice());
								}
					}
				  t9.setText("1");
			  }
			});
			
			
		
			JButton c= new JButton("PAID");
			c.addActionListener(new ActionListener(){
				  public void actionPerformed(ActionEvent ae){
					  String str = JOptionPane.showInputDialog(null, 
								"Enter Account Number : ", "PAID", 
								JOptionPane.PLAIN_MESSAGE);
						    if(str != null)
						    {
						    	int k=0;
							    	int flag=0;
							    	int str2;
							    	str2= Integer.parseInt(str);
							    	for (Account Ac : Test.getBank().getAccount()) {
							    		if(str2== Ac.getID())
							    		{
							    			flag=1;
							    			break;
							    		}
							    		k++;
									}
							    	if(flag==1)
							    	{
							    		double paid;
							    		int answer = JOptionPane.showConfirmDialog(null, 
							    				"Your Account : "+Test.getBank().getAccount().get(k).getID()+"\n"+
							    				"Money : "+Test.getBank().getAccount().get(k).getMoney()+"\n"+
							    				"Price : "+sum+"\n"+
												"Do you want to Paid?", "PAID Confirm", 		
												JOptionPane.YES_NO_OPTION);
										    if (answer==JOptionPane.YES_OPTION) {
										    	double m = Test.getBank().getAccount().get(k).getMoney();
										    	if(sum>m)
										    	{
										    		JOptionPane.showMessageDialog(null, 
											    			"Not have enough  money ", "PAID", 
											    			JOptionPane.INFORMATION_MESSAGE);
										    	}
										    	else if(sum<=m)
										    	{
										    		paid=m-sum;
										    		Test.getBank().getAccount().get(k).setMoney(paid);
										    		double mm= Test.getBank().getAccount().get(k).getMoney();
										    		JOptionPane.showMessageDialog(null, 
											    			"You PAID : " + sum +" ß "+"\n"
											    				+"Your money : "+mm+" ß ", "PAID", 
											    			JOptionPane.INFORMATION_MESSAGE);
											    	ca.printRecieve(Test.ic,Test.getBank().getAccount().get(k).getID());
											    	Test.ic.remove();
										    	}
										    }
										    flag=0;
							    		
							    	}
							    	else
									{
									    	JOptionPane.showMessageDialog(null, 
											"Not found Account Number", "Account Number", 
											JOptionPane.INFORMATION_MESSAGE);
									}
						    }
					}
					 
				});

		    JButton c2= new JButton("CANCEL");
		  
		    panel5.add(t4);
		    panel5.add(c);
		    panel5.add(c2);
		    c.addActionListener(this);
		    c2.addActionListener(this);
		    
			t.setText("Menu");
			pane.add(txt);
			pane.add(combo);
			pane.add(txt2);
			pane.add(t2);
			pane.add(txt3);
			pane.add(t9);
			pane.add(b);
			
			pane2.add(t3);
		    Font bigFont = t.getFont().deriveFont(Font.PLAIN,40f);
		    Font bigFont2 = t.getFont().deriveFont(Font.PLAIN,20f);
		    Font bigFont3 = t.getFont().deriveFont(Font.PLAIN,30f);
			for(int u=0;u<10;u++)
			{
				ts3[u] = new JTextField("");
				pane2.add(ts3[u]);
				ts3[u].setFont(bigFont2);
			}
			panel6.add(t8);
			panel6.add(t6);
			for(int u=0;u<10;u++)
			{
				ts8[u] = new JTextField("");
				panel6.add(ts8[u]);
				ts8[u].setFont(bigFont2);
				ts6[u] = new JTextField("");
				panel6.add(ts6[u]);
				ts6[u].setFont(bigFont2);
			}
			panel7.add(t7);
			for(int u=0;u<10;u++)
			{
				ts7[u] = new JTextField("");
				panel7.add(ts7[u]);
				ts7[u].setFont(bigFont2);
			}
			
			setSize(800,600);
		    Container main = getContentPane();
		    setVisible(true);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				  //main.add(b,BorderLayout.NORTH);
		    //main.add(pane,BorderLayout.CENTER);
		    pane2.setLayout(new GridLayout(11,2));
		    panel6.setLayout(new GridLayout(11,2));
		    panel7.setLayout(new GridLayout(11,2));
		    
			txt.setFont(bigFont2);
			combo.setFont(bigFont2);
			b.setFont(bigFont2);
			t2.setFont(bigFont2);
			txt3.setFont(bigFont2);
			t9.setFont(bigFont2);
			t3.setFont(bigFont2);
			t6.setFont(bigFont2);
			t7.setFont(bigFont2);
			t8.setFont(bigFont2);
			t4.setFont(bigFont3);
			txt2.setFont(bigFont2);
			c.setFont(bigFont2);
			c2.setFont(bigFont2);
			
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			main.add(pane,BorderLayout.BEFORE_FIRST_LINE);
		    main.add(panel7,BorderLayout.WEST);
			main.add(pane2,BorderLayout.CENTER);
			main.add(panel6,BorderLayout.EAST);
		    main.add(panel5,BorderLayout.PAGE_END);

		
		    //main.add(contentPane);	   
}
}
	
