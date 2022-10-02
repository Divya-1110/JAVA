package com.nissan.bean;

public class Item {
	
	//instance variable
	private int itemId;
	private String itemName;
	private float itemPrice;

	//default constructor
	public Item() {
		super();
	}

	
	//parameterized constructor
	public Item(int itemId, String itemName, float itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
      
	//getter setters
	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public float getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

   //display method
	public void display() {
		System.out.println("Item Id:"+this.itemId);
		System.out.println("Item Name:"+this.itemName);
		System.out.println("Item price:"+this.itemPrice);
	}
	
	
	
	
	
	
}
