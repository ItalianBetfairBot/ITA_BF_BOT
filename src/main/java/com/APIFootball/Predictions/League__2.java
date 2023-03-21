
package com.APIFootball.Predictions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "form",
    "fixtures",
    "goals",
    "biggest",
    "clean_sheet",
    "failed_to_score",
    "penalty",
    "lineups",
    "cards"
})
@Generated("jsonschema2pojo")
public class League__2 {

    @JsonProperty("form")
    private String form;
    @JsonProperty("fixtures")
    private Fixtures__1 fixtures;
    @JsonProperty("goals")
    private Goals__5 goals;
    @JsonProperty("biggest")
    private Biggest__1 biggest;
    @JsonProperty("clean_sheet")
    private CleanSheet__1 cleanSheet;
    @JsonProperty("failed_to_score")
    private FailedToScore__1 failedToScore;
    @JsonProperty("penalty")
    private Penalty__1 penalty;
    @JsonProperty("lineups")
    private List<Lineup__1> lineups = new ArrayList<Lineup__1>();
    @JsonProperty("cards")
    private Cards__1 cards;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    public League__2 withForm(String form) {
        this.form = form;
        return this;
    }

    @JsonProperty("fixtures")
    public Fixtures__1 getFixtures() {
        return fixtures;
    }

    @JsonProperty("fixtures")
    public void setFixtures(Fixtures__1 fixtures) {
        this.fixtures = fixtures;
    }

    public League__2 withFixtures(Fixtures__1 fixtures) {
        this.fixtures = fixtures;
        return this;
    }

    @JsonProperty("goals")
    public Goals__5 getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals__5 goals) {
        this.goals = goals;
    }

    public League__2 withGoals(Goals__5 goals) {
        this.goals = goals;
        return this;
    }

    @JsonProperty("biggest")
    public Biggest__1 getBiggest() {
        return biggest;
    }

    @JsonProperty("biggest")
    public void setBiggest(Biggest__1 biggest) {
        this.biggest = biggest;
    }

    public League__2 withBiggest(Biggest__1 biggest) {
        this.biggest = biggest;
        return this;
    }

    @JsonProperty("clean_sheet")
    public CleanSheet__1 getCleanSheet() {
        return cleanSheet;
    }

    @JsonProperty("clean_sheet")
    public void setCleanSheet(CleanSheet__1 cleanSheet) {
        this.cleanSheet = cleanSheet;
    }

    public League__2 withCleanSheet(CleanSheet__1 cleanSheet) {
        this.cleanSheet = cleanSheet;
        return this;
    }

    @JsonProperty("failed_to_score")
    public FailedToScore__1 getFailedToScore() {
        return failedToScore;
    }

    @JsonProperty("failed_to_score")
    public void setFailedToScore(FailedToScore__1 failedToScore) {
        this.failedToScore = failedToScore;
    }

    public League__2 withFailedToScore(FailedToScore__1 failedToScore) {
        this.failedToScore = failedToScore;
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

    public League__2 withPenalty(Penalty__1 penalty) {
        this.penalty = penalty;
        return this;
    }

    @JsonProperty("lineups")
    public List<Lineup__1> getLineups() {
        return lineups;
    }

    @JsonProperty("lineups")
    public void setLineups(List<Lineup__1> lineups) {
        this.lineups = lineups;
    }

    public League__2 withLineups(List<Lineup__1> lineups) {
        this.lineups = lineups;
        return this;
    }

    @JsonProperty("cards")
    public Cards__1 getCards() {
        return cards;
    }

    @JsonProperty("cards")
    public void setCards(Cards__1 cards) {
        this.cards = cards;
    }

    public League__2 withCards(Cards__1 cards) {
        this.cards = cards;
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

    public League__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(League__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("fixtures");
        sb.append('=');
        sb.append(((this.fixtures == null)?"<null>":this.fixtures));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null)?"<null>":this.goals));
        sb.append(',');
        sb.append("biggest");
        sb.append('=');
        sb.append(((this.biggest == null)?"<null>":this.biggest));
        sb.append(',');
        sb.append("cleanSheet");
        sb.append('=');
        sb.append(((this.cleanSheet == null)?"<null>":this.cleanSheet));
        sb.append(',');
        sb.append("failedToScore");
        sb.append('=');
        sb.append(((this.failedToScore == null)?"<null>":this.failedToScore));
        sb.append(',');
        sb.append("penalty");
        sb.append('=');
        sb.append(((this.penalty == null)?"<null>":this.penalty));
        sb.append(',');
        sb.append("lineups");
        sb.append('=');
        sb.append(((this.lineups == null)?"<null>":this.lineups));
        sb.append(',');
        sb.append("cards");
        sb.append('=');
        sb.append(((this.cards == null)?"<null>":this.cards));
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
        result = ((result* 31)+((this.failedToScore == null)? 0 :this.failedToScore.hashCode()));
        result = ((result* 31)+((this.cards == null)? 0 :this.cards.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.biggest == null)? 0 :this.biggest.hashCode()));
        result = ((result* 31)+((this.cleanSheet == null)? 0 :this.cleanSheet.hashCode()));
        result = ((result* 31)+((this.penalty == null)? 0 :this.penalty.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fixtures == null)? 0 :this.fixtures.hashCode()));
        result = ((result* 31)+((this.goals == null)? 0 :this.goals.hashCode()));
        result = ((result* 31)+((this.lineups == null)? 0 :this.lineups.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof League__2) == false) {
            return false;
        }
        League__2 rhs = ((League__2) other);
        return (((((((((((this.failedToScore == rhs.failedToScore)||((this.failedToScore!= null)&&this.failedToScore.equals(rhs.failedToScore)))&&((this.cards == rhs.cards)||((this.cards!= null)&&this.cards.equals(rhs.cards))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.biggest == rhs.biggest)||((this.biggest!= null)&&this.biggest.equals(rhs.biggest))))&&((this.cleanSheet == rhs.cleanSheet)||((this.cleanSheet!= null)&&this.cleanSheet.equals(rhs.cleanSheet))))&&((this.penalty == rhs.penalty)||((this.penalty!= null)&&this.penalty.equals(rhs.penalty))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fixtures == rhs.fixtures)||((this.fixtures!= null)&&this.fixtures.equals(rhs.fixtures))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))))&&((this.lineups == rhs.lineups)||((this.lineups!= null)&&this.lineups.equals(rhs.lineups))));
    }

}
