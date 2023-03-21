
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
    "streak",
    "wins",
    "loses",
    "goals"
})
@Generated("jsonschema2pojo")
public class Biggest__1 {

    @JsonProperty("streak")
    private Streak__1 streak;
    @JsonProperty("wins")
    private Wins__3 wins;
    @JsonProperty("loses")
    private Loses__3 loses;
    @JsonProperty("goals")
    private Goals__6 goals;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("streak")
    public Streak__1 getStreak() {
        return streak;
    }

    @JsonProperty("streak")
    public void setStreak(Streak__1 streak) {
        this.streak = streak;
    }

    public Biggest__1 withStreak(Streak__1 streak) {
        this.streak = streak;
        return this;
    }

    @JsonProperty("wins")
    public Wins__3 getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(Wins__3 wins) {
        this.wins = wins;
    }

    public Biggest__1 withWins(Wins__3 wins) {
        this.wins = wins;
        return this;
    }

    @JsonProperty("loses")
    public Loses__3 getLoses() {
        return loses;
    }

    @JsonProperty("loses")
    public void setLoses(Loses__3 loses) {
        this.loses = loses;
    }

    public Biggest__1 withLoses(Loses__3 loses) {
        this.loses = loses;
        return this;
    }

    @JsonProperty("goals")
    public Goals__6 getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals__6 goals) {
        this.goals = goals;
    }

    public Biggest__1 withGoals(Goals__6 goals) {
        this.goals = goals;
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

    public Biggest__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Biggest__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streak");
        sb.append('=');
        sb.append(((this.streak == null)?"<null>":this.streak));
        sb.append(',');
        sb.append("wins");
        sb.append('=');
        sb.append(((this.wins == null)?"<null>":this.wins));
        sb.append(',');
        sb.append("loses");
        sb.append('=');
        sb.append(((this.loses == null)?"<null>":this.loses));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null)?"<null>":this.goals));
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
        result = ((result* 31)+((this.streak == null)? 0 :this.streak.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.goals == null)? 0 :this.goals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Biggest__1) == false) {
            return false;
        }
        Biggest__1 rhs = ((Biggest__1) other);
        return ((((((this.wins == rhs.wins)||((this.wins!= null)&&this.wins.equals(rhs.wins)))&&((this.loses == rhs.loses)||((this.loses!= null)&&this.loses.equals(rhs.loses))))&&((this.streak == rhs.streak)||((this.streak!= null)&&this.streak.equals(rhs.streak))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))));
    }

}
