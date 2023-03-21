
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
    "predictions",
    "league",
    "teams",
    "comparison",
    "h2h"
})
@Generated("jsonschema2pojo")
public class Response {

    @JsonProperty("predictions")
    private Predictions predictions;
    @JsonProperty("league")
    private League league;
    @JsonProperty("teams")
    private Teams teams;
    @JsonProperty("comparison")
    private Comparison comparison;
    @JsonProperty("h2h")
    private List<H2h__1> h2h = new ArrayList<H2h__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("predictions")
    public Predictions getPredictions() {
        return predictions;
    }

    @JsonProperty("predictions")
    public void setPredictions(Predictions predictions) {
        this.predictions = predictions;
    }

    public Response withPredictions(Predictions predictions) {
        this.predictions = predictions;
        return this;
    }

    @JsonProperty("league")
    public League getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(League league) {
        this.league = league;
    }

    public Response withLeague(League league) {
        this.league = league;
        return this;
    }

    @JsonProperty("teams")
    public Teams getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public Response withTeams(Teams teams) {
        this.teams = teams;
        return this;
    }

    @JsonProperty("comparison")
    public Comparison getComparison() {
        return comparison;
    }

    @JsonProperty("comparison")
    public void setComparison(Comparison comparison) {
        this.comparison = comparison;
    }

    public Response withComparison(Comparison comparison) {
        this.comparison = comparison;
        return this;
    }

    @JsonProperty("h2h")
    public List<H2h__1> getH2h() {
        return h2h;
    }

    @JsonProperty("h2h")
    public void setH2h(List<H2h__1> h2h) {
        this.h2h = h2h;
    }

    public Response withH2h(List<H2h__1> h2h) {
        this.h2h = h2h;
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

    public Response withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Response.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("predictions");
        sb.append('=');
        sb.append(((this.predictions == null)?"<null>":this.predictions));
        sb.append(',');
        sb.append("league");
        sb.append('=');
        sb.append(((this.league == null)?"<null>":this.league));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
        sb.append(',');
        sb.append("comparison");
        sb.append('=');
        sb.append(((this.comparison == null)?"<null>":this.comparison));
        sb.append(',');
        sb.append("h2h");
        sb.append('=');
        sb.append(((this.h2h == null)?"<null>":this.h2h));
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
        result = ((result* 31)+((this.comparison == null)? 0 :this.comparison.hashCode()));
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.league == null)? 0 :this.league.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.predictions == null)? 0 :this.predictions.hashCode()));
        result = ((result* 31)+((this.h2h == null)? 0 :this.h2h.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return (((((((this.comparison == rhs.comparison)||((this.comparison!= null)&&this.comparison.equals(rhs.comparison)))&&((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams))))&&((this.league == rhs.league)||((this.league!= null)&&this.league.equals(rhs.league))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.predictions == rhs.predictions)||((this.predictions!= null)&&this.predictions.equals(rhs.predictions))))&&((this.h2h == rhs.h2h)||((this.h2h!= null)&&this.h2h.equals(rhs.h2h))));
    }

}
