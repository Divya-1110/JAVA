package com.nissan.bean;

public class BankB extends MainBank {
	
	//instance variable
		private int principle;
		private int time;
		private double rate;
		
		//default constructor
		public BankB() {
			super();
		}

		
	  //parameterized Constructor
		public BankB(int principle, int time, double rate) {
			super();
			this.principle = principle;
			this.time = time;
			this.rate = rate;
		}
     
		//custom method
		public double simpleIntrest() 
		{
			return this.principle*this.time*this.rate / 100;
			
	    }
				

}
