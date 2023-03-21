
package com.APIFootball.Predictions;

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
    "played",
    "wins",
    "draws",
    "loses"
})
@Generated("jsonschema2pojo")
public class Fixtures__1 {

    @JsonProperty("played")
    private Played__1 played;
    @JsonProperty("wins")
    private Wins__2 wins;
    @JsonProperty("draws")
    private Draws__1 draws;
    @JsonProperty("loses")
    private Loses__2 loses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("played")
    public Played__1 getPlayed() {
        return played;
    }

    @JsonProperty("played")
    public void setPlayed(Played__1 played) {
        this.played = played;
    }

    public Fixtures__1 withPlayed(Played__1 played) {
        this.played = played;
        return this;
    }

    @JsonProperty("wins")
    public Wins__2 getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(Wins__2 wins) {
        this.wins = wins;
    }

    public Fixtures__1 withWins(Wins__2 wins) {
        this.wins = wins;
        return this;
    }

    @JsonProperty("draws")
    public Draws__1 getDraws() {
        return draws;
    }

    @JsonProperty("draws")
    public void setDraws(Draws__1 draws) {
        this.draws = draws;
    }

    public Fixtures__1 withDraws(Draws__1 draws) {
        this.draws = draws;
        return this;
    }

    @JsonProperty("loses")
    public Loses__2 getLoses() {
        return loses;
    }

    @JsonProperty("loses")
    public void setLoses(Loses__2 loses) {
        this.loses = loses;
    }

    public Fixtures__1 withLoses(Loses__2 loses) {
        this.loses = loses;
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

    public Fixtures__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fixtures__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("played");
        sb.append('=');
        sb.append(((this.played == null)?"<null>":this.played));
        sb.append(',');
        sb.append("wins");
        sb.append('=');
        sb.append(((this.wins == null)?"<null>":this.wins));
        sb.append(',');
        sb.append("draws");
        sb.append('=');
        sb.append(((this.draws == null)?"<null>":this.draws));
        sb.append(',');
        sb.append("loses");
        sb.append('=');
        sb.append(((this.loses == null)?"<null>":this.loses));
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
        result = ((result* 31)+((this.wins == null)? 0 :this.wins.hashCode()));
        result = ((result* 31)+((this.loses == null)? 0 :this.loses.hashCode()));
        result = ((result* 31)+((this.draws == null)? 0 :this.draws.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.played == null)? 0 :this.played.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fixtures__1) == false) {
            return false;
        }
        Fixtures__1 rhs = ((Fixtures__1) other);
        return ((((((this.wins == rhs.wins)||((this.wins!= null)&&this.wins.equals(rhs.wins)))&&((this.loses == rhs.loses)||((this.loses!= null)&&this.loses.equals(rhs.loses))))&&((this.draws == rhs.draws)||((this.draws!= null)&&this.draws.equals(rhs.draws))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.played == rhs.played)||((this.played!= null)&&this.played.equals(rhs.played))));
    }

}
