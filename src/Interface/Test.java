package Interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Test {
	
	protected static int select;
	protected static Bank bank = new Bank();
	protected static InventoryCart ic = new InventoryCart();
	protected static Orange orange = new Orange();
	
	  public static void main(String[] args) {
		  
		  Store a = new Store("ChuanChom",orange);
			Store b = new Store("GraTaRong",orange);
			Store c = new Store("SilverSpoon",orange);
			Store d = new Store("KwangKaow",orange);
			Store e = new Store("Himarai",orange);
			Store f = new Store("Supannika",orange);
			Food coffee = new Food("Coffee",25,a);
			Food coco = new Food("Coco",20,a);
			Food milk = new Food("Milk",20,a);
			Food greentea = new Food("Green Tea",25,a);
			Food mama = new Food("mama",20,b);
			Food Papayasalad = new Food("Papaya salad",60,b);
			Food Roastchicken = new Food("Roast chicken",10,b);
			Food Stickyrice = new Food("Sticky rice",5,b);
			Food Friedricewithpork = new Food("Fried rice with pork",30,c);
			Food Friedricewithchicken = new Food("Fried rice with chicken",30,c);
			Food Friedricewithshrimps = new Food("Fried rice with shrimps",50,c);
			Food Friedricewithcrabmeat = new Food("Fried rice with crabmeat",55,c);
			Food ChickenGreenCurry = new Food("Chicken Green Curry",60,d);
			Food beefGreenCurry = new Food("Beef Green Curry salad",60,d);
			Food SoursoupmadeofTamarindPaste = new Food("Sour soup made of Tamarind Paste",50,d);
			Food MassamanCurry = new Food("Massa man Curry",55,d);
			Food tofu = new Food("Minced pork and soya bean curd soup",40,e);
			Food kapawp = new Food("Spicy fried pork with basil leaves",30,e);
			Food kapawc = new Food("Spicy fried chicken with basil leaves",30,e);
			Food kapawb = new Food("Spicy fried beef with basil leaves",50,e);
			
			Food kaidaw = new Food("Sticky rice",10,f);
			Food kaijeaw = new Food("Roast chicken",30,f);
			Food omlet = new Food("Spicy minced pork",30,f);
			Food kaitom = new Food("Papaya salad",25,f);
			Account A1 = new Account("A",123456, 100, bank);
			Account A2 = new Account("B",111111, 1000, bank);
			Account A3 = new Account("C",6220163, 2000, bank);
			
		  Intro frame = new Intro();
		  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  int height = screenSize.height;
		  int width = screenSize.width;
		  frame.setSize(width/5, height/3);

		  frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	  }

	public static Bank getBank() {
		return bank;
	}

	public static void setBank(Bank bank) {
		Test.bank = bank;
	}

	public static InventoryCart getIc() {
		return ic;
	}

	public static void setIc(InventoryCart ic) {
		Test.ic = ic;
	}

	public static Orange getOrange() {
		return orange;
	}

	public static void setOrange(Orange orange) {
		Test.orange = orange;
	}
	}


