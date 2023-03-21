package com.betfair.aping.entities;

import com.betfair.aping.enums.PersistenceType;

public class UpdateInstruction {
	
	String betId;
	PersistenceType newPersistenceType;
	public String getBetId() {
		return betId;
	}
	public void setBetId(String betId) {
		this.betId = betId;
	}
	public PersistenceType getNewPersistenceType() {
		return newPersistenceType;
	}
	public void setNewPersistenceType(PersistenceType newPersistenceType) {
		this.newPersistenceType = newPersistenceType;
	}

}
