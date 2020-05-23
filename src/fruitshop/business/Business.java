package fruitshop.business;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import fruitshop.bean.Fruit;
import fruitshop.bean.Purchase;
import fruitshop.util.GENERAL;

public class Business {
	Purchase purchase = new Purchase();
	List listFruits = new Vector();
		
	public Business(String paramPath) {
		GENERAL.PRICES =   paramPath + "prices.csv";
		GENERAL.PURCHASES = paramPath+ "purchases.csv";		 
	}
	 
	public void addFruittoPurchase(String paramFruit) {
		try {
			this.purchase.addOnePurchase(paramFruit);
		}catch(Exception ee) {
			ee.printStackTrace();
		}
	}
	

	@SuppressWarnings("unchecked")
	public String listFruits() {		
		try {
			if (this.listFruits.isEmpty()) {
				File file = new File(GENERAL.PRICES);
				try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
					String line = sc.nextLine();
					while (sc.hasNextLine()){
						line = sc.nextLine();
						System.out.println(line);
						this.listFruits.add(new Fruit(line.split(",")[0].trim(),new Double(line.split(",")[1].trim())));
					}
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return this.listFruits.toString();
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		return "";
	}
	
	@SuppressWarnings("unchecked")
	public String listPurchase() {		
		try {
			if (this.listFruits.isEmpty()) {
				File file = new File(GENERAL.PURCHASES);
				try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
					String line = sc.nextLine();
					while (sc.hasNextLine()){
						line = sc.nextLine();
						System.out.println(line);
						this.purchase.addOnePurchase(line.split(",")[0].trim(), new Integer(line.split(",")[1].trim()));
					}
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return this.purchase.toString();
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		return "";
	}
	
	public void removeOneFruittoPurchase(String paramFruit) {
		try {
			this.purchase.removeOnePurchase(paramFruit);
		}catch(Exception ee) {
			ee.printStackTrace();
		}
	}
	
	public void removeAllFruittoPurchase(Fruit paramFruit) {
		try {
			this.purchase.removeAllFruits(paramFruit);
		}catch(Exception ee) {
			ee.printStackTrace();
		}
	}

}
