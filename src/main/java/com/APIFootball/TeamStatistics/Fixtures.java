
package com.APIFootball.TeamStatistics;

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
public class Fixtures {

    @JsonProperty("played")
    private Played played;
    @JsonProperty("wins")
    private Wins wins;
    @JsonProperty("draws")
    private Draws draws;
    @JsonProperty("loses")
    private Loses loses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("played")
    public Played getPlayed() {
        return played;
    }

    @JsonProperty("played")
    public void setPlayed(Played played) {
        this.played = played;
    }

    public Fixtures withPlayed(Played played) {
        this.played = played;
        return this;
    }

    @JsonProperty("wins")
    public Wins getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(Wins wins) {
        this.wins = wins;
    }

    public Fixtures withWins(Wins wins) {
        this.wins = wins;
        return this;
    }

    @JsonProperty("draws")
    public Draws getDraws() {
        return draws;
    }

    @JsonProperty("draws")
    public void setDraws(Draws draws) {
        this.draws = draws;
    }

    public Fixtures withDraws(Draws draws) {
        this.draws = draws;
        return this;
    }

    @JsonProperty("loses")
    public Loses getLoses() {
        return loses;
    }

    @JsonProperty("loses")
    public void setLoses(Loses loses) {
        this.loses = loses;
    }

    public Fixtures withLoses(Loses loses) {
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

    public Fixtures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fixtures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Fixtures) == false) {
            return false;
        }
        Fixtures rhs = ((Fixtures) other);
        return ((((((this.wins == rhs.wins)||((this.wins!= null)&&this.wins.equals(rhs.wins)))&&((this.loses == rhs.loses)||((this.loses!= null)&&this.loses.equals(rhs.loses))))&&((this.draws == rhs.draws)||((this.draws!= null)&&this.draws.equals(rhs.draws))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.played == rhs.played)||((this.played!= null)&&this.played.equals(rhs.played))));
    }

}
