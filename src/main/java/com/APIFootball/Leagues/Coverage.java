
package com.APIFootball.Leagues;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fixtures",
    "standings",
    "players",
    "top_scorers",
    "top_assists",
    "top_cards",
    "injuries",
    "predictions",
    "odds"
})
@Generated("jsonschema2pojo")
public class Coverage {

    @JsonProperty("fixtures")
    private Fixtures fixtures;
    @JsonProperty("standings")
    private Boolean standings;
    @JsonProperty("players")
    private Boolean players;
    @JsonProperty("top_scorers")
    private Boolean topScorers;
    @JsonProperty("top_assists")
    private Boolean topAssists;
    @JsonProperty("top_cards")
    private Boolean topCards;
    @JsonProperty("injuries")
    private Boolean injuries;
    @JsonProperty("predictions")
    private Boolean predictions;
    @JsonProperty("odds")
    private Boolean odds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fixtures")
    public Fixtures getFixtures() {
        return fixtures;
    }

    @JsonProperty("fixtures")
    public void setFixtures(Fixtures fixtures) {
        this.fixtures = fixtures;
    }

    public Coverage withFixtures(Fixtures fixtures) {
        this.fixtures = fixtures;
        return this;
    }

    @JsonProperty("standings")
    public Boolean getStandings() {
        return standings;
    }

    @JsonProperty("standings")
    public void setStandings(Boolean standings) {
        this.standings = standings;
    }

    public Coverage withStandings(Boolean standings) {
        this.standings = standings;
        return this;
    }

    @JsonProperty("players")
    public Boolean getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(Boolean players) {
        this.players = players;
    }

    public Coverage withPlayers(Boolean players) {
        this.players = players;
        return this;
    }

    @JsonProperty("top_scorers")
    public Boolean getTopScorers() {
        return topScorers;
    }

    @JsonProperty("top_scorers")
    public void setTopScorers(Boolean topScorers) {
        this.topScorers = topScorers;
    }

    public Coverage withTopScorers(Boolean topScorers) {
        this.topScorers = topScorers;
        return this;
    }

    @JsonProperty("top_assists")
    public Boolean getTopAssists() {
        return topAssists;
    }

    @JsonProperty("top_assists")
    public void setTopAssists(Boolean topAssists) {
        this.topAssists = topAssists;
    }

    public Coverage withTopAssists(Boolean topAssists) {
        this.topAssists = topAssists;
        return this;
    }

    @JsonProperty("top_cards")
    public Boolean getTopCards() {
        return topCards;
    }

    @JsonProperty("top_cards")
    public void setTopCards(Boolean topCards) {
        this.topCards = topCards;
    }

    public Coverage withTopCards(Boolean topCards) {
        this.topCards = topCards;
        return this;
    }

    @JsonProperty("injuries")
    public Boolean getInjuries() {
        return injuries;
    }

    @JsonProperty("injuries")
    public void setInjuries(Boolean injuries) {
        this.injuries = injuries;
    }

    public Coverage withInjuries(Boolean injuries) {
        this.injuries = injuries;
        return this;
    }

    @JsonProperty("predictions")
    public Boolean getPredictions() {
        return predictions;
    }

    @JsonProperty("predictions")
    public void setPredictions(Boolean predictions) {
        this.predictions = predictions;
    }

    public Coverage withPredictions(Boolean predictions) {
        this.predictions = predictions;
        return this;
    }

    @JsonProperty("odds")
    public Boolean getOdds() {
        return odds;
    }

    @JsonProperty("odds")
    public void setOdds(Boolean odds) {
        this.odds = odds;
    }

    public Coverage withOdds(Boolean odds) {
        this.odds = odds;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Coverage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Coverage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fixtures");
        sb.append('=');
        sb.append(((this.fixtures == null)?"<null>":this.fixtures));
        sb.append(',');
        sb.append("standings");
        sb.append('=');
        sb.append(((this.standings == null)?"<null>":this.standings));
        sb.append(',');
        sb.append("players");
        sb.append('=');
        sb.append(((this.players == null)?"<null>":this.players));
        sb.append(',');
        sb.append("topScorers");
        sb.append('=');
        sb.append(((this.topScorers == null)?"<null>":this.topScorers));
        sb.append(',');
        sb.append("topAssists");
        sb.append('=');
        sb.append(((this.topAssists == null)?"<null>":this.topAssists));
        sb.append(',');
        sb.append("topCards");
        sb.append('=');
        sb.append(((this.topCards == null)?"<null>":this.topCards));
        sb.append(',');
        sb.append("injuries");
        sb.append('=');
        sb.append(((this.injuries == null)?"<null>":this.injuries));
        sb.append(',');
        sb.append("predictions");
        sb.append('=');
        sb.append(((this.predictions == null)?"<null>":this.predictions));
        sb.append(',');
        sb.append("odds");
        sb.append('=');
        sb.append(((this.odds == null)?"<null>":this.odds));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.topScorers == null)? 0 :this.topScorers.hashCode()));
        result = ((result* 31)+((this.injuries == null)? 0 :this.injuries.hashCode()));
        result = ((result* 31)+((this.players == null)? 0 :this.players.hashCode()));
        result = ((result* 31)+((this.topCards == null)? 0 :this.topCards.hashCode()));
        result = ((result* 31)+((this.odds == null)? 0 :this.odds.hashCode()));
        result = ((result* 31)+((this.topAssists == null)? 0 :this.topAssists.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.standings == null)? 0 :this.standings.hashCode()));
        result = ((result* 31)+((this.predictions == null)? 0 :this.predictions.hashCode()));
        result = ((result* 31)+((this.fixtures == null)? 0 :this.fixtures.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Coverage) == false) {
            return false;
        }
        Coverage rhs = ((Coverage) other);
        return (((((((((((this.topScorers == rhs.topScorers)||((this.topScorers!= null)&&this.topScorers.equals(rhs.topScorers)))&&((this.injuries == rhs.injuries)||((this.injuries!= null)&&this.injuries.equals(rhs.injuries))))&&((this.players == rhs.players)||((this.players!= null)&&this.players.equals(rhs.players))))&&((this.topCards == rhs.topCards)||((this.topCards!= null)&&this.topCards.equals(rhs.topCards))))&&((this.odds == rhs.odds)||((this.odds!= null)&&this.odds.equals(rhs.odds))))&&((this.topAssists == rhs.topAssists)||((this.topAssists!= null)&&this.topAssists.equals(rhs.topAssists))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.standings == rhs.standings)||((this.standings!= null)&&this.standings.equals(rhs.standings))))&&((this.predictions == rhs.predictions)||((this.predictions!= null)&&this.predictions.equals(rhs.predictions))))&&((this.fixtures == rhs.fixtures)||((this.fixtures!= null)&&this.fixtures.equals(rhs.fixtures))));
    }

}
