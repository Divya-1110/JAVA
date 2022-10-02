package com.nissan.bean;

public class BankC extends MainBank {
	
	//instance variable
			private int principle;
			private int time;
			private double rate;
			
			//default constructor
			public BankC() {
				super();
			}

			
	//parameterized Constructor
			public BankC(int principle, int time, double rate) {
				super();
				this.principle = principle;
				this.time = time;
				this.rate = rate;
			}

				public double simpleIntrest() 
			{
				return this.principle*this.time*this.rate / 100;
				
		    }
			


}
