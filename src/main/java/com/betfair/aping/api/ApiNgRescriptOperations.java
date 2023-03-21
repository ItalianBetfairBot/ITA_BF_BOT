package com.betfair.aping.api;

import com.betfair.aping.entities.*;
import com.betfair.aping.enums.*;
import com.betfair.aping.exceptions.APINGException;
import com.betfair.aping.util.JsonConverter;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;

public class ApiNgRescriptOperations extends ApiNgOperations {

        private static ApiNgRescriptOperations instance = null;

        private ApiNgRescriptOperations() {
        }

        public static ApiNgRescriptOperations getInstance() {
                if (instance == null) {
                        instance = new ApiNgRescriptOperations();
                }
                return instance;
        }

        public List<EventTypeResult> listEventTypes(MarketFilter filter, String appKey, String ssoId)
                        throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(FILTER, filter);
                params.put(LOCALE, locale);
                String result = getInstance().makeRequest(ApiNgOperation.LISTEVENTTYPES.getOperationName(), params,
                                appKey,
                                ssoId);

                if (result.contains("faultcode"))
                        return null;

                List<EventTypeResult> container = JsonConverter.convertFromJson(result,
                                new TypeToken<List<EventTypeResult>>() {
                                }.getType());

                return container;

        }

        public synchronized List<CompetitionResult> listCompetitions(MarketFilter filter, String appKey, String ssoId)
                        throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(FILTER, filter);
                params.put(LOCALE, locale);
                String result = getInstance().makeRequest(ApiNgOperation.LISTCOMPETITIONS.getOperationName(), params,
                                appKey,
                                ssoId);

                if (result.contains("faultcode"))
                        return null;

                List<CompetitionResult> container = JsonConverter.convertFromJson(result,
                                new TypeToken<List<CompetitionResult>>() {
                                }.getType());

                return container;

        }

        public synchronized List<EventResult> listEvents(MarketFilter filter, MarketSort sort, String appKey,
                        String ssoId)
                        throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(FILTER, filter);
                params.put(LOCALE, locale);
                params.put(SORT, sort);
                String result = getInstance().makeRequest(ApiNgOperation.LISTEVENTS.getOperationName(), params, appKey,
                                ssoId);

                if (result.contains("faultcode"))
                        return null;
                List<EventResult> container = JsonConverter.convertFromJson(result, new TypeToken<List<EventResult>>() {
                }.getType());

                return container;

        }

        public List<CountryCodeResult> listCountries(MarketFilter filter, String appKey, String ssoId)
                        throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(FILTER, filter);
                params.put(LOCALE, locale);
                String result = getInstance().makeRequest(ApiNgOperation.LISTCOUNTRIES.getOperationName(), params,
                                appKey,
                                ssoId);

                if (result.contains("faultcode"))
                        return null;

                List<CountryCodeResult> container = JsonConverter.convertFromJson(result,
                                new TypeToken<List<CountryCodeResult>>() {
                                }.getType());

                return container;

        }

        public synchronized List<MarketBook> listMarketBook(List<String> marketIds, PriceProjection priceProjection,
                        OrderProjection orderProjection, MatchProjection matchProjection, String currencyCode,
                        String appKey,
                        String ssoId) throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(LOCALE, locale);
                params.put(MARKET_IDS, marketIds);
                params.put(PRICE_PROJECTION, priceProjection);
                params.put(ORDER_PROJECTION, orderProjection);
                params.put(MATCH_PROJECTION, matchProjection);
                String result = getInstance().makeRequest(ApiNgOperation.LISTMARKETBOOK.getOperationName(), params,
                                appKey,
                                ssoId);
                // if(ApiNGDemo.isDebug())
                // System.out.println("=====> Response: "+result);
                if (result.contains("faultcode"))
                        return null;

                List<MarketBook> container = JsonConverter.convertFromJson(result, new TypeToken<List<MarketBook>>() {
                }.getType());

                return container;

        }

        public synchronized List<MarketBook> listRunnerBook(String marketId, long selectionId,
                        PriceProjection priceProjection,
                        OrderProjection orderProjection, MatchProjection matchProjection, String currencyCode,
                        String appKey,
                        String ssoId) throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(LOCALE, locale);
                params.put(MARKET_ID, marketId);
                params.put(SELECTION_ID, selectionId);
                params.put(PRICE_PROJECTION, priceProjection);
                params.put(ORDER_PROJECTION, orderProjection);
                params.put(MATCH_PROJECTION, matchProjection);
                String result = getInstance().makeRequest(ApiNgOperation.LISTRUNNERBOOK.getOperationName(), params,
                                appKey,
                                ssoId);
                // if(ApiNGDemo.isDebug())
                // System.out.println("=====> Response: "+result);

                if (result.contains("faultcode"))
                        return null;

                List<MarketBook> container = JsonConverter.convertFromJson(result, new TypeToken<List<MarketBook>>() {
                }.getType());

                return container;

        }

        public synchronized List<MarketBook> listMarketBookDM(List<String> marketIds, PriceProjection priceProjection,
                        OrderProjection orderProjection, MatchProjection matchProjection, String currencyCode,
                        String appKey,
                        String ssoId) throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(LOCALE, locale);
                params.put(MARKET_IDS, marketIds);
                params.put(PRICE_PROJECTION, priceProjection);
                params.put(ORDER_PROJECTION, orderProjection);
                params.put(MATCH_PROJECTION, matchProjection);
                String result = getInstance().makeRequest(ApiNgOperation.LISTMARKETBOOK.getOperationName(), params,
                                appKey,
                                ssoId);
                // if(ApiNGDemo.isDebug())
                // System.out.println("\nResponse: "+result);

                if (result.contains("faultcode"))
                        return null;

                List<MarketBook> container = JsonConverter.convertFromJson(result, new TypeToken<List<MarketBook>>() {
                }.getType());

                return container;

        }

        public synchronized List<MarketCatalogue> listMarketCatalogue(MarketFilter filter,
                        Set<MarketProjection> marketProjection, MarketSort sort, String maxResult, String appKey,
                        String ssoId)
                        throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(LOCALE, locale);
                params.put(FILTER, filter);
                params.put(SORT, sort);
                params.put(MAX_RESULT, maxResult);
                params.put(MARKET_PROJECTION, marketProjection);
                String result = getInstance().makeRequest(ApiNgOperation.LISTMARKETCATALOGUE.getOperationName(), params,
                                appKey,
                                ssoId);
                // if(ApiNGDemo.isDebug())
                // System.out.println("\nResponse: "+result);

                if (result.contains("faultcode"))
                        return null;

                List<MarketCatalogue> container = JsonConverter.convertFromJson(result,
                                new TypeToken<List<MarketCatalogue>>() {
                                }.getType());

                return container;

        }

        public synchronized PlaceExecutionReport placeOrders(String marketId, List<PlaceInstruction> instructions,
                        String customerRef, String customerStrategyRef, String appKey, String ssoId)
                        throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(LOCALE, locale);
                params.put(MARKET_ID, marketId);
                params.put(INSTRUCTIONS, instructions);
                params.put(CUSTOMERSTRATEGYREF, customerStrategyRef);
                // params.put(CUSTOMER_REF, customerRef);
                String result = getInstance().makeRequest(ApiNgOperation.PLACORDERS.getOperationName(), params, appKey,
                                ssoId);
                // if(ApiNGDemo.isDebug())
                // System.out.println("\nResponse: "+result);

                if (result.contains("faultcode"))
                        return null;

                return JsonConverter.convertFromJson(result, PlaceExecutionReport.class);

        }

        public synchronized CurrentOrderSummaryReport listCurrentOrders(Set<String> betIds, Set<String> marketIds,
                        OrderProjection orderProjection, TimeRange dateRange, OrderBy orderBy, SortDir sortDir,
                        int fromRecord,
                        int recordCount, String appKey, String ssoId) throws APINGException {

                Map<String, Object> params = new HashMap<String, Object>();
                params.put(BETIDS, betIds);
                params.put(MARKET_IDS, marketIds);
                params.put(ORDER_PROJECTION, orderProjection);
                params.put(DATERANGE, dateRange);
                params.put(ORDERBY, orderBy);
                params.put(SORTDIR, sortDir);
                params.put(FROMRECORD, fromRecord);
                params.put(RECORDCOUNT, recordCount);
                String result = getInstance().makeRequest(ApiNgOperation.LISTCURRENTORDERS.getOperationName(), params,
                                appKey,
                                ssoId);
                // if(ApiNGDemo.isDebug())
                // System.out.println("\nResponse: "+result);

                if (result.contains("faultcode"))
                        return null;

                return JsonConverter.convertFromJson(result, CurrentOrderSummaryReport.class);
        }

        public synchronized ClearedOrderSummaryReport listClearedOrders(BetStatus betStatus, Set<String> eventTypeIds,
                        Set<String> eventIds,
                        Set<String> marketIds, Set<String> runnerIds, Set<String> betIds, Side side,
                        TimeRange settledDateRange, GroupBy groupBy,
                        boolean includeItemDescription, int fromRecord, int recordCount, String appKey, String ssoId)
                        throws APINGException {

                Map<String, Object> params = new HashMap<String, Object>();
                params.put(BETSTATUS, betStatus);
                params.put(EVENT_TYPE_ID, eventTypeIds);
                params.put(EVENT_IDS, eventIds);
                params.put(MARKET_IDS, marketIds);
                params.put(RUNNER_IDS, runnerIds);
                params.put(BETIDS, betIds);
                // params.put(SIDE, side);
                params.put(DATERANGE, settledDateRange);
                params.put(GROUPBY, groupBy);
                params.put(INCLUDEITEMDESC, includeItemDescription);
                params.put(LOCALE, locale);
                params.put(FROMRECORD, fromRecord);
                params.put(RECORDCOUNT, recordCount);
                String result = getInstance().makeRequest(ApiNgOperation.LISTCLEAREDORDERS.getOperationName(), params,
                                appKey,
                                ssoId);
                // if(ApiNGDemo.isDebug())
                // System.out.println("\nResponse: "+result);

                if (result.contains("faultcode"))
                        return null;

                return JsonConverter.convertFromJson(result, ClearedOrderSummaryReport.class);
        }

        public synchronized CancelExecutionReport cancelOrders(String marketId, List<CancelInstruction> instructions,
                        String customerRef, String appKey, String ssoId) throws APINGException {

                Map<String, Object> params = new HashMap<String, Object>();
                params.put(MARKET_ID, marketId);
                params.put(INSTRUCTIONS, instructions);
                // params.put(CUSTOMER_REF, customerRef);
                String result = getInstance().makeRequest(ApiNgOperation.CANCELORDERS.getOperationName(), params,
                                appKey,
                                ssoId);
                // if(ApiNGDemo.isDebug())
                // System.out.println("\nResponse: "+result);

                if (result.contains("faultcode"))
                        return null;

                return JsonConverter.convertFromJson(result, CancelExecutionReport.class);
        }

        public synchronized AccountDetailsResponse getAccountDetails(String appKey, String ssoId)
                        throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                String result = getInstance().makeAccontRequest(ApiNgOperation.GETACCOUNTDETAILS.getOperationName(),
                                params,
                                appKey, ssoId);

                if (result.substring(0, 1).equals("{")) {
                        JSONObject json = new JSONObject(result);
                        if (json.has("faultcode"))
                                return null;
                }

                return JsonConverter.convertFromJson(result, AccountDetailsResponse.class);
        }

        public synchronized AccountFundsResponse getAccountFunds(Wallet wallet, String appKey, String ssoId)
                        throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(WALLET, wallet);
                String result = getInstance().makeAccontRequest(ApiNgOperation.GETACCOUNTFUNDS.getOperationName(),
                                params,
                                appKey, ssoId);

                if (result.contains("faultcode"))
                        return null;

                return JsonConverter.convertFromJson(result, AccountFundsResponse.class);
        }

        public synchronized String getVendorClientId(String appKey, String ssoId) throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                String result = getInstance().makeAccontRequest(ApiNgOperation.GETVENDORCLIENTID.getOperationName(),
                                params,
                                appKey, ssoId);

                if (result.contains("faultcode"))
                        return null;

                return JsonConverter.convertFromJson(result, String.class);
        }

        public synchronized List<SubscriptionHistory> getApplicationSubscriptionHistory(String vendorClientId,
                        String appKey, String ssoId) throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(VENDORCLIENTID, vendorClientId);
                String result = getInstance().makeAccontRequest(
                                ApiNgOperation.GETAPPLICATIONSUBSCRIPTIONHISTORY.getOperationName(), params, appKey,
                                ssoId);
                if (result.contains("faultcode"))
                        return null;
                return JsonConverter.convertFromJson(result, new TypeToken<List<SubscriptionHistory>>() {
                }.getType());
        }

        private String makeAccontRequest(String operation, Map<String, Object> params, String appKey, String ssoToken)
                        throws APINGException {
                String requestString;
                // Handling the Rescript request
                // params.put("id", 1);

                requestString = JsonConverter.convertToJson(params);
                // if(ApiNGDemo.isDebug())
                // System.out.println("\nRequest: "+requestString);

                // We need to pass the "sendPostRequest" method a string in util format:
                // requestString
                HttpUtil requester = new HttpUtil();
                String response = requester.sendAccountPostRequestRescript(requestString, operation, appKey, ssoToken);
                if (response != null) {
                        return response;
                }
                throw new APINGException();
        }

        protected String makeRequest(String operation, Map<String, Object> params, String appKey, String ssoToken)
                        throws APINGException {
                String requestString;
                // Handling the Rescript request
                params.put("id", 1);

                requestString = JsonConverter.convertToJson(params);

                // We need to pass the "sendPostRequest" method a string in util format:
                // requestString
                HttpUtil requester = new HttpUtil();
                String response = requester.sendPostRequestRescript(requestString, operation, appKey, ssoToken);

                if (response != null) {
                        return response;
                }
                throw new APINGException();

        }

        public synchronized ReplaceExecutionReport replaceOrders(String marketId, List<ReplaceInstruction> instructions,
                        String customRef, String appKey, String ssoId) throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(MARKET_ID, marketId);
                params.put(INSTRUCTIONS, instructions);
                // params.put(CUSTOMER_REF, customerRef);
                String result = getInstance().makeRequest(ApiNgOperation.REPLACEORDERS.getOperationName(), params,
                                appKey,
                                ssoId);

                if (result.contains("faultcode"))
                        return null;

                return JsonConverter.convertFromJson(result, ReplaceExecutionReport.class);
        }

        public synchronized UpdateExecutionReport updateOrders(String marketId, List<UpdateInstruction> instructions,
                        String customRef, String appKey, String ssoId) throws APINGException {
                Map<String, Object> params = new HashMap<String, Object>();
                params.put(MARKET_ID, marketId);
                params.put(INSTRUCTIONS, instructions);
                // params.put(CUSTOMER_REF, customerRef);
                String result = getInstance().makeRequest(ApiNgOperation.UPDATEORDERS.getOperationName(), params,
                                appKey,
                                ssoId);

                if (result.contains("faultcode"))
                        return null;

                return JsonConverter.convertFromJson(result, UpdateExecutionReport.class);
        }

}
