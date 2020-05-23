package fruitshop.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Purchase {

HashMap<String, Integer> fruits = new HashMap<String, Integer>();

public Purchase() {
	super();
}

public Purchase(HashMap<String, Integer> fruits) {
	super();
	this.fruits = fruits;
}

public HashMap<String, Integer> getFruits() {
	return fruits;
}

public void setFruits(HashMap<String, Integer> fruits) {
	this.fruits = fruits;
}

public int count() {
	return this.fruits.size();
}


public void addOnePurchase(String paramFruitName, Integer paramNumber) {
	 this.fruits.put(paramFruitName, paramNumber);
}

public void removeOnePurchase(String paramFruitName, Integer paramNumber) {
	 this.fruits.put(paramFruitName, paramNumber);
}

public void addOnePurchase(String paramFruitName) {
	 this.fruits.put(paramFruitName, this.fruits.get(paramFruitName) + 1);
}

public void removeOnePurchase(String paramFruitName) {
	 this.fruits.put(paramFruitName, this.fruits.get(paramFruitName) - 1);
}

public void removeAllFruits(Fruit paramFruit) {
	 this.fruits.remove(paramFruit.getName());
}
}
