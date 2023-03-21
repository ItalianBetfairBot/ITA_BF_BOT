	package com.betfair.aping.entities;

public class ReplaceInstruction {
	
	String betId;
	double newPrice;
	public String getBetId() {
		return betId;
	}
	public void setBetId(String betId) {
		this.betId = betId;
	}
	public double getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}

}
