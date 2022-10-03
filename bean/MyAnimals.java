package com.nissan.bean;

public class MyAnimals extends Animals {
	
	//instance variable
   int 	bodyTemp;
   
   
   //Parameterized constructor
   public MyAnimals(int bodyTemp) {
		super();
		this.bodyTemp = bodyTemp;
	}


//getter and setter
   public int getBodyTemp() {
		return bodyTemp;
	}

	public void setBodyTemp(int bodyTemp) {
		this.bodyTemp = bodyTemp;
	}

	@Override
	int GetBodyTemp() {
		System.out.println("Animal temperature is:"+this.bodyTemp);
		return 0;
	}

	}
