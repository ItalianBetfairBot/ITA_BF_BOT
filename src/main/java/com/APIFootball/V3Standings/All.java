
package com.APIFootball.V3Standings;

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
    "win",
    "draw",
    "lose",
    "goals"
})
@Generated("jsonschema2pojo")
public class All {

    @JsonProperty("played")
    private Integer played;
    @JsonProperty("win")
    private Integer win;
    @JsonProperty("draw")
    private Integer draw;
    @JsonProperty("lose")
    private Integer lose;
    @JsonProperty("goals")
    private Goals goals;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("played")
    public Integer getPlayed() {
        return played;
    }

    @JsonProperty("played")
    public void setPlayed(Integer played) {
        this.played = played;
    }

    public All withPlayed(Integer played) {
        this.played = played;
        return this;
    }

    @JsonProperty("win")
    public Integer getWin() {
        return win;
    }

    @JsonProperty("win")
    public void setWin(Integer win) {
        this.win = win;
    }

    public All withWin(Integer win) {
        this.win = win;
        return this;
    }

    @JsonProperty("draw")
    public Integer getDraw() {
        return draw;
    }

    @JsonProperty("draw")
    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public All withDraw(Integer draw) {
        this.draw = draw;
        return this;
    }

    @JsonProperty("lose")
    public Integer getLose() {
        return lose;
    }

    @JsonProperty("lose")
    public void setLose(Integer lose) {
        this.lose = lose;
    }

    public All withLose(Integer lose) {
        this.lose = lose;
        return this;
    }

    @JsonProperty("goals")
    public Goals getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    public All withGoals(Goals goals) {
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

    public All withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(All.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("played");
        sb.append('=');
        sb.append(((this.played == null)?"<null>":this.played));
        sb.append(',');
        sb.append("win");
        sb.append('=');
        sb.append(((this.win == null)?"<null>":this.win));
        sb.append(',');
        sb.append("draw");
        sb.append('=');
        sb.append(((this.draw == null)?"<null>":this.draw));
        sb.append(',');
        sb.append("lose");
        sb.append('=');
        sb.append(((this.lose == null)?"<null>":this.lose));
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
        result = ((result* 31)+((this.lose == null)? 0 :this.lose.hashCode()));
        result = ((result* 31)+((this.draw == null)? 0 :this.draw.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.played == null)? 0 :this.played.hashCode()));
        result = ((result* 31)+((this.win == null)? 0 :this.win.hashCode()));
        result = ((result* 31)+((this.goals == null)? 0 :this.goals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof All) == false) {
            return false;
        }
        All rhs = ((All) other);
        return (((((((this.lose == rhs.lose)||((this.lose!= null)&&this.lose.equals(rhs.lose)))&&((this.draw == rhs.draw)||((this.draw!= null)&&this.draw.equals(rhs.draw))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.played == rhs.played)||((this.played!= null)&&this.played.equals(rhs.played))))&&((this.win == rhs.win)||((this.win!= null)&&this.win.equals(rhs.win))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))));
    }

}
