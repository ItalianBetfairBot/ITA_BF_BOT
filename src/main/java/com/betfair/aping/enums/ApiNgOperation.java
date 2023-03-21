package com.betfair.aping.enums;

public enum ApiNgOperation {
	LISTEVENTTYPES("listEventTypes"), 
	LISTCOMPETITIONS("listCompetitions"),
	LISTTIMERANGES("listTimeRanges"),
	LISTEVENTS("listEvents"),
	LISTMARKETTYPES("listMarketTypes"),
	LISTCOUNTRIES("listCountries"),
	LISTVENUES("listVenues"),
	LISTMARKETCATALOGUE("listMarketCatalogue"),
	LISTMARKETBOOK("listMarketBook"),
	LISTRUNNERBOOK("listRunnerBook"),
	PLACORDERS("placeOrders"),
	LISTCURRENTORDERS("listCurrentOrders"),
	LISTCLEAREDORDERS("listClearedOrders"),
	CANCELORDERS("cancelOrders"),
	REPLACEORDERS("replaceOrders"),
	UPDATEORDERS("updateOrders"),
	GETACCOUNTDETAILS("getAccountDetails"),
	GETACCOUNTFUNDS("getAccountFunds"),
	GETVENDORCLIENTID("getVendorClientId"),
	GETAPPLICATIONSUBSCRIPTIONHISTORY("getApplicationSubscriptionHistory");
	
	private String operationName;
	
	private ApiNgOperation(String operationName){
		this.operationName = operationName;
	}

	public String getOperationName() {
		return operationName;
	}

	

}
