
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
    "wins",
    "draws",
    "loses"
})
@Generated("jsonschema2pojo")
public class Streak {

    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("draws")
    private Integer draws;
    @JsonProperty("loses")
    private Integer loses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("wins")
    public Integer getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Streak withWins(Integer wins) {
        this.wins = wins;
        return this;
    }

    @JsonProperty("draws")
    public Integer getDraws() {
        return draws;
    }

    @JsonProperty("draws")
    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Streak withDraws(Integer draws) {
        this.draws = draws;
        return this;
    }

    @JsonProperty("loses")
    public Integer getLoses() {
        return loses;
    }

    @JsonProperty("loses")
    public void setLoses(Integer loses) {
        this.loses = loses;
    }

    public Streak withLoses(Integer loses) {
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

    public Streak withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Streak.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Streak) == false) {
            return false;
        }
        Streak rhs = ((Streak) other);
        return (((((this.wins == rhs.wins)||((this.wins!= null)&&this.wins.equals(rhs.wins)))&&((this.loses == rhs.loses)||((this.loses!= null)&&this.loses.equals(rhs.loses))))&&((this.draws == rhs.draws)||((this.draws!= null)&&this.draws.equals(rhs.draws))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
