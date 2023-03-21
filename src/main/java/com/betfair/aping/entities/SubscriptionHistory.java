package com.betfair.aping.entities;

import java.util.Date;

import com.betfair.aping.enums.SubscriptionStatus;

public class SubscriptionHistory {
	
	String subscriptionToken, clientReference;
	Date expiryDateTime,expiredDateTime,createdDateTime,activationDateTime,cancellationDateTime;
	SubscriptionStatus subscriptionStatus;
	public String getSubscriptionToken() {
		return subscriptionToken;
	}
	public void setSubscriptionToken(String subscriptionToken) {
		this.subscriptionToken = subscriptionToken;
	}
	public String getClientReference() {
		return clientReference;
	}
	public void setClientReference(String clientReference) {
		this.clientReference = clientReference;
	}
	public Date getExpiryDateTime() {
		return expiryDateTime;
	}
	public void setExpiryDateTime(Date expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
	}
	public Date getExpiredDateTime() {
		return expiredDateTime;
	}
	public void setExpiredDateTime(Date expiredDateTime) {
		this.expiredDateTime = expiredDateTime;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Date getActivationDateTime() {
		return activationDateTime;
	}
	public void setActivationDateTime(Date activationDateTime) {
		this.activationDateTime = activationDateTime;
	}
	public Date getCancellationDateTime() {
		return cancellationDateTime;
	}
	public void setCancellationDateTime(Date cancellationDateTime) {
		this.cancellationDateTime = cancellationDateTime;
	}
	public SubscriptionStatus getSubscriptionStatus() {
		return subscriptionStatus;
	}
	public void setSubscriptionStatus(SubscriptionStatus subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

}
