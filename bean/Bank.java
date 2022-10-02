package com.nissan.bean;
/*
 *A bank has two kinds of accounts, savings and fixed deposit. The interest rates for these are
4% and 11%respectively. Customer account interest needs to be implemented. Implement a
solution to print the interest on the basis of principle, time, & rate given by the user. Design
an appropriate class and method to implement this.
 */
public class Bank
{
	//instance variables
	private int _prinicipal;
	private int _time;
	private double _rate;
	private String _typeOfAccount;

	
	//default const
	 public Bank() {
		 super();
	 }

	//parameterized const
		public Bank(int _prinicipal, int _time, int _rate, String _typeOfAccount) {
			super();
			this._prinicipal = _prinicipal;
			this._time = _time;
			this._rate = _rate;
			this._typeOfAccount =_typeOfAccount;
		}

	//getters and setters
		public int get_prinicipal() {
			return _prinicipal;
		}

		public void set_prinicipal(int _prinicipal) {
			this._prinicipal = _prinicipal;
		}

		public int get_time() {
			return _time;
		}

		public void set_time(int _time) {
			this._time = _time;
		}

		public double get_rate() {
			return _rate;
		}

		public void set_rate(double _rate) {
			this._rate = _rate;
		}

		

		public void set_typeOfAccount(String _typeOfAccount) {
			//set the value of rate based on type of account
	
			if(_typeOfAccount.equalsIgnoreCase("Savings")) {
				this._rate=0.04;
			}
			else {
				this._rate=0.11;
			}
		}
		public int get_typeOfAccount(int intrest) {
			return intrest;
		}
				
	//methods
		public void display() {
			System.out.println(_typeOfAccount);
		}
	 
	   public double calculateIntrest() {
		   return this._prinicipal*this._time*this._rate / 100;
	   }
	//overide tostring()
		@Override
		public String toString() {
			return "Bank [_prinicipal=" + _prinicipal + ", _time=" + _time + ", _rate=" + _rate + ", _typeOfAccount="
					+ _typeOfAccount + "]";
		}

	

}
