package com.application.bot.session;

public class UserAuthResponse {
	private String token, product, status, error, lastLoginDate;

	public String getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "UserAuthResponse [token=" + token + ", product=" + product + ", status=" + status + ", error=" + error+ ", lastLoginDate=" + lastLoginDate
				+ "]";
	}
}
