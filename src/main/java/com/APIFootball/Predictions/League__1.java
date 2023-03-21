
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
public class League__1 {

    @JsonProperty("form")
    private String form;
    @JsonProperty("fixtures")
    private Fixtures fixtures;
    @JsonProperty("goals")
    private Goals__2 goals;
    @JsonProperty("biggest")
    private Biggest biggest;
    @JsonProperty("clean_sheet")
    private CleanSheet cleanSheet;
    @JsonProperty("failed_to_score")
    private FailedToScore failedToScore;
    @JsonProperty("penalty")
    private Penalty penalty;
    @JsonProperty("lineups")
    private List<Lineup> lineups = new ArrayList<Lineup>();
    @JsonProperty("cards")
    private Cards cards;
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

    public League__1 withForm(String form) {
        this.form = form;
        return this;
    }

    @JsonProperty("fixtures")
    public Fixtures getFixtures() {
        return fixtures;
    }

    @JsonProperty("fixtures")
    public void setFixtures(Fixtures fixtures) {
        this.fixtures = fixtures;
    }

    public League__1 withFixtures(Fixtures fixtures) {
        this.fixtures = fixtures;
        return this;
    }

    @JsonProperty("goals")
    public Goals__2 getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals__2 goals) {
        this.goals = goals;
    }

    public League__1 withGoals(Goals__2 goals) {
        this.goals = goals;
        return this;
    }

    @JsonProperty("biggest")
    public Biggest getBiggest() {
        return biggest;
    }

    @JsonProperty("biggest")
    public void setBiggest(Biggest biggest) {
        this.biggest = biggest;
    }

    public League__1 withBiggest(Biggest biggest) {
        this.biggest = biggest;
        return this;
    }

    @JsonProperty("clean_sheet")
    public CleanSheet getCleanSheet() {
        return cleanSheet;
    }

    @JsonProperty("clean_sheet")
    public void setCleanSheet(CleanSheet cleanSheet) {
        this.cleanSheet = cleanSheet;
    }

    public League__1 withCleanSheet(CleanSheet cleanSheet) {
        this.cleanSheet = cleanSheet;
        return this;
    }

    @JsonProperty("failed_to_score")
    public FailedToScore getFailedToScore() {
        return failedToScore;
    }

    @JsonProperty("failed_to_score")
    public void setFailedToScore(FailedToScore failedToScore) {
        this.failedToScore = failedToScore;
    }

    public League__1 withFailedToScore(FailedToScore failedToScore) {
        this.failedToScore = failedToScore;
        return this;
    }

    @JsonProperty("penalty")
    public Penalty getPenalty() {
        return penalty;
    }

    @JsonProperty("penalty")
    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    public League__1 withPenalty(Penalty penalty) {
        this.penalty = penalty;
        return this;
    }

    @JsonProperty("lineups")
    public List<Lineup> getLineups() {
        return lineups;
    }

    @JsonProperty("lineups")
    public void setLineups(List<Lineup> lineups) {
        this.lineups = lineups;
    }

    public League__1 withLineups(List<Lineup> lineups) {
        this.lineups = lineups;
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

    public League__1 withCards(Cards cards) {
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

    public League__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(League__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof League__1) == false) {
            return false;
        }
        League__1 rhs = ((League__1) other);
        return (((((((((((this.failedToScore == rhs.failedToScore)||((this.failedToScore!= null)&&this.failedToScore.equals(rhs.failedToScore)))&&((this.cards == rhs.cards)||((this.cards!= null)&&this.cards.equals(rhs.cards))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.biggest == rhs.biggest)||((this.biggest!= null)&&this.biggest.equals(rhs.biggest))))&&((this.cleanSheet == rhs.cleanSheet)||((this.cleanSheet!= null)&&this.cleanSheet.equals(rhs.cleanSheet))))&&((this.penalty == rhs.penalty)||((this.penalty!= null)&&this.penalty.equals(rhs.penalty))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fixtures == rhs.fixtures)||((this.fixtures!= null)&&this.fixtures.equals(rhs.fixtures))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))))&&((this.lineups == rhs.lineups)||((this.lineups!= null)&&this.lineups.equals(rhs.lineups))));
    }

}
