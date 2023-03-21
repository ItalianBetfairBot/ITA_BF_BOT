
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
    "rank",
    "team",
    "points",
    "goalsDiff",
    "group",
    "form",
    "status",
    "description",
    "all",
    "home",
    "away",
    "update"
})
@Generated("jsonschema2pojo")
public class Standing {

    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("team")
    private Team team;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("goalsDiff")
    private Integer goalsDiff;
    @JsonProperty("group")
    private String group;
    @JsonProperty("form")
    private String form;
    @JsonProperty("status")
    private String status;
    @JsonProperty("description")
    private String description;
    @JsonProperty("all")
    private All all;
    @JsonProperty("home")
    private Home home;
    @JsonProperty("away")
    private Away away;
    @JsonProperty("update")
    private String update;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Standing withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    @JsonProperty("team")
    public Team getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(Team team) {
        this.team = team;
    }

    public Standing withTeam(Team team) {
        this.team = team;
        return this;
    }

    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    public Standing withPoints(Integer points) {
        this.points = points;
        return this;
    }

    @JsonProperty("goalsDiff")
    public Integer getGoalsDiff() {
        return goalsDiff;
    }

    @JsonProperty("goalsDiff")
    public void setGoalsDiff(Integer goalsDiff) {
        this.goalsDiff = goalsDiff;
    }

    public Standing withGoalsDiff(Integer goalsDiff) {
        this.goalsDiff = goalsDiff;
        return this;
    }

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public Standing withGroup(String group) {
        this.group = group;
        return this;
    }

    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    public Standing withForm(String form) {
        this.form = form;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Standing withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Standing withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("all")
    public All getAll() {
        return all;
    }

    @JsonProperty("all")
    public void setAll(All all) {
        this.all = all;
    }

    public Standing withAll(All all) {
        this.all = all;
        return this;
    }

    @JsonProperty("home")
    public Home getHome() {
        return home;
    }

    @JsonProperty("home")
    public void setHome(Home home) {
        this.home = home;
    }

    public Standing withHome(Home home) {
        this.home = home;
        return this;
    }

    @JsonProperty("away")
    public Away getAway() {
        return away;
    }

    @JsonProperty("away")
    public void setAway(Away away) {
        this.away = away;
    }

    public Standing withAway(Away away) {
        this.away = away;
        return this;
    }

    @JsonProperty("update")
    public String getUpdate() {
        return update;
    }

    @JsonProperty("update")
    public void setUpdate(String update) {
        this.update = update;
    }

    public Standing withUpdate(String update) {
        this.update = update;
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

    public Standing withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Standing.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("points");
        sb.append('=');
        sb.append(((this.points == null)?"<null>":this.points));
        sb.append(',');
        sb.append("goalsDiff");
        sb.append('=');
        sb.append(((this.goalsDiff == null)?"<null>":this.goalsDiff));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("all");
        sb.append('=');
        sb.append(((this.all == null)?"<null>":this.all));
        sb.append(',');
        sb.append("home");
        sb.append('=');
        sb.append(((this.home == null)?"<null>":this.home));
        sb.append(',');
        sb.append("away");
        sb.append('=');
        sb.append(((this.away == null)?"<null>":this.away));
        sb.append(',');
        sb.append("update");
        sb.append('=');
        sb.append(((this.update == null)?"<null>":this.update));
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
        result = ((result* 31)+((this.all == null)? 0 :this.all.hashCode()));
        result = ((result* 31)+((this.away == null)? 0 :this.away.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.update == null)? 0 :this.update.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.goalsDiff == null)? 0 :this.goalsDiff.hashCode()));
        result = ((result* 31)+((this.points == null)? 0 :this.points.hashCode()));
        result = ((result* 31)+((this.home == null)? 0 :this.home.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Standing) == false) {
            return false;
        }
        Standing rhs = ((Standing) other);
        return ((((((((((((((this.all == rhs.all)||((this.all!= null)&&this.all.equals(rhs.all)))&&((this.away == rhs.away)||((this.away!= null)&&this.away.equals(rhs.away))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.update == rhs.update)||((this.update!= null)&&this.update.equals(rhs.update))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this.goalsDiff == rhs.goalsDiff)||((this.goalsDiff!= null)&&this.goalsDiff.equals(rhs.goalsDiff))))&&((this.points == rhs.points)||((this.points!= null)&&this.points.equals(rhs.points))))&&((this.home == rhs.home)||((this.home!= null)&&this.home.equals(rhs.home))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
