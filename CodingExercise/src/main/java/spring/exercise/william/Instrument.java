package spring.exercise.william;


	//Author: William McCall
	public class Instrument implements InstrumentInterface{

		//Declare variables
		private String inst_type;
		private String name;
		private int quantity;
		private float buy_price;
		private float sell_price;
		private float coupon;
		private float profit;
		
		
		//Empty constructor
		public Instrument()
		{
			
		}
		
		//Populated constructor
		public Instrument(String inst_type, String name, int quantity, float buy_price, float sell_price, float coupon, float profit)
		{
			this.inst_type = inst_type;
			this.name = name;
			this.quantity = quantity;
			this.buy_price = buy_price;
			this.sell_price = sell_price;
			this.coupon = coupon;
			this.profit = profit;
		}
		
		//Setters
		
		//Set value for inst_type
		public void setInstType(String inst_type)
		{
			this.inst_type = inst_type;
		}
		
		//Set value for name
		public void setName(String name)
		{
			this.name = name;
		}
		
		//Set value for 
		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
		
		//Set value for buy_price
		public void setBuyPrice(float buy_price)
		{
			this.buy_price = buy_price;
		}
		
		//Set value for sell_price
		public void setSellPrice(float sell_price)
		{
			this.sell_price = sell_price;
		}

		//Set value for coupon
		public void setCoupon(float coupon)
		{
			this.coupon = coupon;
		}

		//Set value for profit
		public void setProfit(float profit)
		{
			this.profit = profit;
		}
		
		//Getters
		
		//Get value for inst_type
		public String getInstType()
		{
			return inst_type;
		}

		//Get value for name
		public String getName()
		{
			return name;
		}

		//Get value for quantity
		public int getQuantity()
		{
			return quantity;
		}

		//Get value for buy_price
		public float getBuyPrice()
		{
			return buy_price;
		}

		//Get value for sell_price
		public float getSellPrice()
		{
			return sell_price;
		}

		//Get value for coupon
		public float getCoupon()
		{
			return coupon;
		}

		//Get value for profit
		public float getProfit()
		{
			return profit;
		}
//Calculation to work out the profit of a Bond
		public float CalculateBondProfit(int quantity, float coupon) {
			profit = quantity * coupon;
			return profit;
		}

//Calculation to work out the profit of an Equity
		public float CalculateEquityProfit(int quantity, float buy_price,
				float sell_price) {
			profit = (sell_price - buy_price) * quantity;
			return profit;
		}
	}


