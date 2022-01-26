package Interface;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Intro extends JFrame implements ActionListener{

	JPanel panel1 = new JPanel(){
		  public void paintComponent(Graphics g) {
			ImageIcon BG =  new ImageIcon("111.png");
			Image newBG = BG.getImage();
			 g.drawImage(newBG, 0, 0, this.getWidth(), this.getHeight(), this);
	  }
	};
	 public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if(b.getText()=="Order Food Now->>>")
			{
				this.dispose();
				Frame main = new Frame();
				main.setVisible(true);
			}
	    }
	 JPanel panel2 = new JPanel();
	 
	 public Intro()
	 {
		    setTitle("Welcome Nontri Food");
		 	setSize(383,383);
			JButton c1= new JButton("Order Food Now->>>");
			c1.addActionListener(this);
			panel2.add(c1);
		 	Container main = getContentPane();
		    setVisible(true);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    main.add(panel1,BorderLayout.CENTER);
		    main.add(panel2,BorderLayout.SOUTH);
	 }
}
