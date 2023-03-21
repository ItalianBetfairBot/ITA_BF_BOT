
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
    "winner",
    "win_or_draw",
    "under_over",
    "goals",
    "advice",
    "percent"
})
@Generated("jsonschema2pojo")
public class Predictions {

    @JsonProperty("winner")
    private Winner winner;
    @JsonProperty("win_or_draw")
    private Boolean winOrDraw;
    @JsonProperty("under_over")
    private String underOver;
    @JsonProperty("goals")
    private Goals goals;
    @JsonProperty("advice")
    private String advice;
    @JsonProperty("percent")
    private Percent percent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("winner")
    public Winner getWinner() {
        return winner;
    }

    @JsonProperty("winner")
    public void setWinner(Winner winner) {
        this.winner = winner;
    }

    public Predictions withWinner(Winner winner) {
        this.winner = winner;
        return this;
    }

    @JsonProperty("win_or_draw")
    public Boolean getWinOrDraw() {
        return winOrDraw;
    }

    @JsonProperty("win_or_draw")
    public void setWinOrDraw(Boolean winOrDraw) {
        this.winOrDraw = winOrDraw;
    }

    public Predictions withWinOrDraw(Boolean winOrDraw) {
        this.winOrDraw = winOrDraw;
        return this;
    }

    @JsonProperty("under_over")
    public Object getUnderOver() {
        return underOver;
    }

    @JsonProperty("under_over")
    public void setUnderOver(String underOver) {
        this.underOver = underOver;
    }

    public Predictions withUnderOver(String underOver) {
        this.underOver = underOver;
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

    public Predictions withGoals(Goals goals) {
        this.goals = goals;
        return this;
    }

    @JsonProperty("advice")
    public String getAdvice() {
        return advice;
    }

    @JsonProperty("advice")
    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Predictions withAdvice(String advice) {
        this.advice = advice;
        return this;
    }

    @JsonProperty("percent")
    public Percent getPercent() {
        return percent;
    }

    @JsonProperty("percent")
    public void setPercent(Percent percent) {
        this.percent = percent;
    }

    public Predictions withPercent(Percent percent) {
        this.percent = percent;
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

    public Predictions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Predictions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("winner");
        sb.append('=');
        sb.append(((this.winner == null)?"<null>":this.winner));
        sb.append(',');
        sb.append("winOrDraw");
        sb.append('=');
        sb.append(((this.winOrDraw == null)?"<null>":this.winOrDraw));
        sb.append(',');
        sb.append("underOver");
        sb.append('=');
        sb.append(((this.underOver == null)?"<null>":this.underOver));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null)?"<null>":this.goals));
        sb.append(',');
        sb.append("advice");
        sb.append('=');
        sb.append(((this.advice == null)?"<null>":this.advice));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
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
        result = ((result* 31)+((this.underOver == null)? 0 :this.underOver.hashCode()));
        result = ((result* 31)+((this.winner == null)? 0 :this.winner.hashCode()));
        result = ((result* 31)+((this.advice == null)? 0 :this.advice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.winOrDraw == null)? 0 :this.winOrDraw.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.goals == null)? 0 :this.goals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Predictions) == false) {
            return false;
        }
        Predictions rhs = ((Predictions) other);
        return ((((((((this.underOver == rhs.underOver)||((this.underOver!= null)&&this.underOver.equals(rhs.underOver)))&&((this.winner == rhs.winner)||((this.winner!= null)&&this.winner.equals(rhs.winner))))&&((this.advice == rhs.advice)||((this.advice!= null)&&this.advice.equals(rhs.advice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.winOrDraw == rhs.winOrDraw)||((this.winOrDraw!= null)&&this.winOrDraw.equals(rhs.winOrDraw))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))));
    }

}
