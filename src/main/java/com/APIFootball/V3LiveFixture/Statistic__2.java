
package com.APIFootball.V3LiveFixture;

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
    "games",
    "offsides",
    "shots",
    "goals",
    "passes",
    "tackles",
    "duels",
    "dribbles",
    "fouls",
    "cards",
    "penalty"
})
@Generated("jsonschema2pojo")
public class Statistic__2 {

    @JsonProperty("games")
    private Games games;
    @JsonProperty("offsides")
    private Object offsides;
    @JsonProperty("shots")
    private Shots shots;
    @JsonProperty("goals")
    private Goals__1 goals;
    @JsonProperty("passes")
    private Passes passes;
    @JsonProperty("tackles")
    private Tackles tackles;
    @JsonProperty("duels")
    private Duels duels;
    @JsonProperty("dribbles")
    private Dribbles dribbles;
    @JsonProperty("fouls")
    private Fouls fouls;
    @JsonProperty("cards")
    private Cards cards;
    @JsonProperty("penalty")
    private Penalty__1 penalty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("games")
    public Games getGames() {
        return games;
    }

    @JsonProperty("games")
    public void setGames(Games games) {
        this.games = games;
    }

    public Statistic__2 withGames(Games games) {
        this.games = games;
        return this;
    }

    @JsonProperty("offsides")
    public Object getOffsides() {
        return offsides;
    }

    @JsonProperty("offsides")
    public void setOffsides(Object offsides) {
        this.offsides = offsides;
    }

    public Statistic__2 withOffsides(Object offsides) {
        this.offsides = offsides;
        return this;
    }

    @JsonProperty("shots")
    public Shots getShots() {
        return shots;
    }

    @JsonProperty("shots")
    public void setShots(Shots shots) {
        this.shots = shots;
    }

    public Statistic__2 withShots(Shots shots) {
        this.shots = shots;
        return this;
    }

    @JsonProperty("goals")
    public Goals__1 getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals__1 goals) {
        this.goals = goals;
    }

    public Statistic__2 withGoals(Goals__1 goals) {
        this.goals = goals;
        return this;
    }

    @JsonProperty("passes")
    public Passes getPasses() {
        return passes;
    }

    @JsonProperty("passes")
    public void setPasses(Passes passes) {
        this.passes = passes;
    }

    public Statistic__2 withPasses(Passes passes) {
        this.passes = passes;
        return this;
    }

    @JsonProperty("tackles")
    public Tackles getTackles() {
        return tackles;
    }

    @JsonProperty("tackles")
    public void setTackles(Tackles tackles) {
        this.tackles = tackles;
    }

    public Statistic__2 withTackles(Tackles tackles) {
        this.tackles = tackles;
        return this;
    }

    @JsonProperty("duels")
    public Duels getDuels() {
        return duels;
    }

    @JsonProperty("duels")
    public void setDuels(Duels duels) {
        this.duels = duels;
    }

    public Statistic__2 withDuels(Duels duels) {
        this.duels = duels;
        return this;
    }

    @JsonProperty("dribbles")
    public Dribbles getDribbles() {
        return dribbles;
    }

    @JsonProperty("dribbles")
    public void setDribbles(Dribbles dribbles) {
        this.dribbles = dribbles;
    }

    public Statistic__2 withDribbles(Dribbles dribbles) {
        this.dribbles = dribbles;
        return this;
    }

    @JsonProperty("fouls")
    public Fouls getFouls() {
        return fouls;
    }

    @JsonProperty("fouls")
    public void setFouls(Fouls fouls) {
        this.fouls = fouls;
    }

    public Statistic__2 withFouls(Fouls fouls) {
        this.fouls = fouls;
        return this;
    }

    @JsonProperty("cards")
    public Cards getCards() {
        return cards;
    }

    @JsonProperty("cards")
    public void setCards(Cards cards) {
        this.cards = cards;
    }

    public Statistic__2 withCards(Cards cards) {
        this.cards = cards;
        return this;
    }

    @JsonProperty("penalty")
    public Penalty__1 getPenalty() {
        return penalty;
    }

    @JsonProperty("penalty")
    public void setPenalty(Penalty__1 penalty) {
        this.penalty = penalty;
    }

    public Statistic__2 withPenalty(Penalty__1 penalty) {
        this.penalty = penalty;
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

    public Statistic__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Statistic__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("games");
        sb.append('=');
        sb.append(((this.games == null)?"<null>":this.games));
        sb.append(',');
        sb.append("offsides");
        sb.append('=');
        sb.append(((this.offsides == null)?"<null>":this.offsides));
        sb.append(',');
        sb.append("shots");
        sb.append('=');
        sb.append(((this.shots == null)?"<null>":this.shots));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null)?"<null>":this.goals));
        sb.append(',');
        sb.append("passes");
        sb.append('=');
        sb.append(((this.passes == null)?"<null>":this.passes));
        sb.append(',');
        sb.append("tackles");
        sb.append('=');
        sb.append(((this.tackles == null)?"<null>":this.tackles));
        sb.append(',');
        sb.append("duels");
        sb.append('=');
        sb.append(((this.duels == null)?"<null>":this.duels));
        sb.append(',');
        sb.append("dribbles");
        sb.append('=');
        sb.append(((this.dribbles == null)?"<null>":this.dribbles));
        sb.append(',');
        sb.append("fouls");
        sb.append('=');
        sb.append(((this.fouls == null)?"<null>":this.fouls));
        sb.append(',');
        sb.append("cards");
        sb.append('=');
        sb.append(((this.cards == null)?"<null>":this.cards));
        sb.append(',');
        sb.append("penalty");
        sb.append('=');
        sb.append(((this.penalty == null)?"<null>":this.penalty));
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
        result = ((result* 31)+((this.fouls == null)? 0 :this.fouls.hashCode()));
        result = ((result* 31)+((this.cards == null)? 0 :this.cards.hashCode()));
        result = ((result* 31)+((this.dribbles == null)? 0 :this.dribbles.hashCode()));
        result = ((result* 31)+((this.penalty == null)? 0 :this.penalty.hashCode()));
        result = ((result* 31)+((this.duels == null)? 0 :this.duels.hashCode()));
        result = ((result* 31)+((this.passes == null)? 0 :this.passes.hashCode()));
        result = ((result* 31)+((this.games == null)? 0 :this.games.hashCode()));
        result = ((result* 31)+((this.tackles == null)? 0 :this.tackles.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shots == null)? 0 :this.shots.hashCode()));
        result = ((result* 31)+((this.offsides == null)? 0 :this.offsides.hashCode()));
        result = ((result* 31)+((this.goals == null)? 0 :this.goals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Statistic__2) == false) {
            return false;
        }
        Statistic__2 rhs = ((Statistic__2) other);
        return (((((((((((((this.fouls == rhs.fouls)||((this.fouls!= null)&&this.fouls.equals(rhs.fouls)))&&((this.cards == rhs.cards)||((this.cards!= null)&&this.cards.equals(rhs.cards))))&&((this.dribbles == rhs.dribbles)||((this.dribbles!= null)&&this.dribbles.equals(rhs.dribbles))))&&((this.penalty == rhs.penalty)||((this.penalty!= null)&&this.penalty.equals(rhs.penalty))))&&((this.duels == rhs.duels)||((this.duels!= null)&&this.duels.equals(rhs.duels))))&&((this.passes == rhs.passes)||((this.passes!= null)&&this.passes.equals(rhs.passes))))&&((this.games == rhs.games)||((this.games!= null)&&this.games.equals(rhs.games))))&&((this.tackles == rhs.tackles)||((this.tackles!= null)&&this.tackles.equals(rhs.tackles))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shots == rhs.shots)||((this.shots!= null)&&this.shots.equals(rhs.shots))))&&((this.offsides == rhs.offsides)||((this.offsides!= null)&&this.offsides.equals(rhs.offsides))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))));
    }

}
