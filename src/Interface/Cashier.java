package Interface;

import java.util.Scanner;

public class Cashier {
	
	protected double total=0;
	
	public void printRecieve(InventoryCart ic,int id) {
		String S;
		total=0;
		int j=0;
		Orange orange = new Orange();
		System.out.println("----Orenge Canteen----");	
		System.out.print("Account Number : "+id+"\n");
		for (Store store  : ic.getA().get(0).getFood().getStore().getOrange().getStore()) {
			for (amount a : ic.getA()) {
				if(j==ic.getA().size()) {
						j=0;
					}
				if(ic.getA().get(j).getFood().getStore().getName()==store.getName()) {
					
					System.out.println(ic.getA().get(j).getFood().getStore().getName()+" Store");
					
					for (amount a2 : ic.getA()) {
						if(a2.getFood()==a.getFood()) {
						System.out.println(a2.getFood().getName()+" x "+a2.getNum()+"\t"+(a2.getFood().getPrice())*a2.getNum()+"Baht");
						total=total+((a2.getFood().getPrice())*a2.getNum());
						}
						
					}	
				}
				j++;
			}
		}
		System.out.println("Total : "+total);	
	}
	
}
