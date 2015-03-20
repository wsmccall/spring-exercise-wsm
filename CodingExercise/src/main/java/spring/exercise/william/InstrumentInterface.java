package spring.exercise.william;

//Author: William McCall

//Interface for class instrument
public interface InstrumentInterface {
	float CalculateBondProfit(int quantity, float coupon);
	float CalculateEquityProfit(int quantity, float buy_price, float sell_price);
}
