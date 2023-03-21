package com.betfair.aping.api;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import com.betfair.aping.entities.AccountDetailsResponse;
import com.betfair.aping.entities.AccountFundsResponse;
import com.betfair.aping.entities.CancelExecutionReport;
import com.betfair.aping.entities.CancelInstruction;
import com.betfair.aping.entities.ClearedOrderSummaryReport;
import com.betfair.aping.entities.CompetitionResult;
import com.betfair.aping.entities.CountryCodeResult;
import com.betfair.aping.entities.CurrentOrderSummaryReport;
import com.betfair.aping.entities.EventResult;
import com.betfair.aping.entities.EventTypeResult;
import com.betfair.aping.entities.MarketBook;
import com.betfair.aping.entities.MarketCatalogue;
import com.betfair.aping.entities.MarketFilter;
import com.betfair.aping.entities.PlaceExecutionReport;
import com.betfair.aping.entities.PlaceInstruction;
import com.betfair.aping.entities.PriceProjection;
import com.betfair.aping.entities.ReplaceExecutionReport;
import com.betfair.aping.entities.ReplaceInstruction;
import com.betfair.aping.entities.SubscriptionHistory;
import com.betfair.aping.entities.TimeRange;
import com.betfair.aping.entities.UpdateExecutionReport;
import com.betfair.aping.entities.UpdateInstruction;
import com.betfair.aping.enums.BetStatus;
import com.betfair.aping.enums.GroupBy;
import com.betfair.aping.enums.MarketProjection;
import com.betfair.aping.enums.MarketSort;
import com.betfair.aping.enums.MatchProjection;
import com.betfair.aping.enums.OrderBy;
import com.betfair.aping.enums.OrderProjection;
import com.betfair.aping.enums.Side;
import com.betfair.aping.enums.SortDir;
import com.betfair.aping.enums.Wallet;
import com.betfair.aping.exceptions.APINGException;

public abstract class ApiNgOperations {
    protected final String FILTER = "filter";
    protected final String LOCALE = "locale";
    protected final String SORT = "sort";
    protected final String MAX_RESULT = "maxResults";
    protected final String MARKET_IDS = "marketIds";
    protected final String MARKET_ID = "marketId";
    protected final String SELECTION_ID = "selectionId";
    protected final String EVENT_TYPE_ID = "eventTypeIds";
    protected final String EVENT_IDS = "eventIds";
    protected final String RUNNER_IDS = "runnerIds";
    protected final String INSTRUCTIONS = "instructions";
    protected final String CUSTOMER_REF2 = "customerRef";
    protected final String MARKET_PROJECTION = "marketProjection";
    protected final String PRICE_PROJECTION = "priceProjection";
    protected final String MATCH_PROJECTION = "matchProjection";
    protected final String ORDER_PROJECTION = "orderProjection";
    protected final String SIDE = "side";
    protected final String BETIDS = "betIds";
    protected final String BETSTATUS = "betStatus";
    protected final String DATERANGE = "dateRange";
    protected final String ORDERBY = "orderBy";
    protected final String GROUPBY = "groupBy";
    protected final String SORTDIR = "sortDir";
    protected final String FROMRECORD = "fromRecord";
    protected final String RECORDCOUNT = "recordCount";
    protected final String WALLET = "wallet";
    protected final String INCLUDEITEMDESC = "includeItemDescription";
    protected final String VENDORCLIENTID = "vendorClientId";
    protected final String CUSTOMERSTRATEGYREF = "customerStrategyRef";
    protected final String locale = Locale.ENGLISH.toString();// Locale.getDefault().toString();

    public abstract List<EventTypeResult> listEventTypes(MarketFilter filter, String appKey, String ssoId)
            throws APINGException;

    public abstract List<EventResult> listEvents(MarketFilter filter, MarketSort sort, String appKey, String ssoId)
            throws APINGException;

    public abstract List<CompetitionResult> listCompetitions(MarketFilter filter, String appKey, String ssoId)
            throws APINGException;

    public abstract List<CountryCodeResult> listCountries(MarketFilter filter, String appKey, String ssoId)
            throws APINGException;
    // public abstract List<MarketTypeResult> listMarketTypes(MarketFilter filter,
    // String appKey, String ssoId) throws APINGException;

    public abstract List<MarketBook> listMarketBook(List<String> marketIds, PriceProjection priceProjection,
            OrderProjection orderProjection,
            MatchProjection matchProjection, String currencyCode, String appKey, String ssoId) throws APINGException;

    public abstract List<MarketBook> listRunnerBook(String marketId, long selectionId, PriceProjection priceProjection,
            OrderProjection orderProjection,
            MatchProjection matchProjection, String currencyCode, String appKey, String ssoId) throws APINGException;

    public abstract List<MarketCatalogue> listMarketCatalogue(MarketFilter filter,
            Set<MarketProjection> marketProjection,
            MarketSort sort, String maxResult, String appKey, String ssoId) throws APINGException;

    public abstract PlaceExecutionReport placeOrders(String marketId, List<PlaceInstruction> instructions,
            String customerRef, String customerStrategyRef, String appKey, String ssoId) throws APINGException;

    public abstract CurrentOrderSummaryReport listCurrentOrders(Set<String> betIds, Set<String> marketIds,
            OrderProjection orderProjection,
            TimeRange dateRange, OrderBy orderBy, SortDir sortDir, int fromRecord, int recordCount, String appKey,
            String ssoId) throws APINGException;

    public abstract ClearedOrderSummaryReport listClearedOrders(BetStatus betStatus, Set<String> eventTypeIds,
            Set<String> eventIds,
            Set<String> marketIds, Set<String> runnerIds, Set<String> betIds, Side side, TimeRange settledDateRange,
            GroupBy groupBy,
            boolean includeItemDescription, int fromRecord, int recordCount, String appKey, String ssoId)
            throws APINGException;

    public abstract CancelExecutionReport cancelOrders(String marketId, List<CancelInstruction> instructions,
            String customRef, String appKey, String ssoId) throws APINGException;

    public abstract ReplaceExecutionReport replaceOrders(String marketId, List<ReplaceInstruction> instructions,
            String customRef, String appKey, String ssoId) throws APINGException;

    public abstract UpdateExecutionReport updateOrders(String marketId, List<UpdateInstruction> instructions,
            String customRef, String appKey, String ssoId) throws APINGException;

    public abstract AccountDetailsResponse getAccountDetails(String appKey, String ssoId) throws APINGException;

    public abstract AccountFundsResponse getAccountFunds(Wallet wallet, String appKey, String ssoId)
            throws APINGException;

    public abstract String getVendorClientId(String appKey, String ssoId) throws APINGException;

    public abstract List<SubscriptionHistory> getApplicationSubscriptionHistory(String vendorClientId, String appKey,
            String ssoId) throws APINGException;

    protected abstract String makeRequest(String operation, Map<String, Object> params, String appKey, String ssoToken)
            throws APINGException;

}
