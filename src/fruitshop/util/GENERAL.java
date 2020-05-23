package fruitshop.util;

public class GENERAL {
	public static String PRICES =   System.getProperty("user.dir") + "\\files\\prices.csv";
	public static String PURCHASES = System.getProperty("user.dir") + "\\files\\purchases.csv";
	
	 public GENERAL(String paramPath) {
		GENERAL.PRICES =   paramPath + "prices.csv";
		GENERAL.PURCHASES = paramPath+ "purchases.csv";
		System.out.println(GENERAL.PRICES);
	}
}
