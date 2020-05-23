package fruitshop;

import java.util.Scanner;

import fruitshop.business.Business;

public class shop {

	public static void main(String[] args) {
		  if (args.length < 1) {
			  System.out.println("Introduce the files path.");		  
		  }else {
		      Scanner console = new Scanner(System.in);
		      System.out.println("Shop is ready");
		      Business business = new Business(args[0]);
		      int option=1;
		      while (option > 0) {
		    	  try{
			    	  System.out.println("Enter a number bellow");
			    	  System.out.println("(0) Exit ");
			    	  System.out.println("(1) List All Fruits ");
			    	  System.out.println("(2) List my purchase ");
				      option = console.nextInt();
				      System.out.println("You have entered : " + option);
				      switch(option) {
					      case 1:
					    	 business.listFruits();
					        break;
					      case 2:
					        business.listPurchase();
					        break;
					      default:
					    	  System.out.println("Enter a number of the list");
				      }
		    	  }catch (Exception ee) {
		    		  System.out.println("Introduce numbers please. If you want exit, select number 0");
		    	  }
		      }
		      System.out.println("Good Bye, thank you for your visit");
		  }
	}
}
