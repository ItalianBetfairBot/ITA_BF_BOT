package com.betfair.aping.entities;

public class CancelInstruction {

	private String betId;
	private String sizeReduction = null;
	public String getBetId() {
		return betId;
	}
	public void setBetId(String betId) {
		this.betId = betId;
	}
	public String getSizeReduction() {
		return sizeReduction;
	}
	public void setSizeReduction(String sizeReduction) {
		this.sizeReduction = sizeReduction;
	}
	
	
}
