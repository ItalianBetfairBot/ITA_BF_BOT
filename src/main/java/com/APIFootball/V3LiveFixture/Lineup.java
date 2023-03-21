
package com.APIFootball.V3LiveFixture;

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
    "team",
    "coach",
    "formation",
    "startXI",
    "substitutes"
})
@Generated("jsonschema2pojo")
public class Lineup {

    @JsonProperty("team")
    private Team__1 team;
    @JsonProperty("coach")
    private Coach coach;
    @JsonProperty("formation")
    private String formation;
    @JsonProperty("startXI")
    private List<StartXI> startXI = new ArrayList<StartXI>();
    @JsonProperty("substitutes")
    private List<Substitute> substitutes = new ArrayList<Substitute>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("team")
    public Team__1 getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(Team__1 team) {
        this.team = team;
    }

    public Lineup withTeam(Team__1 team) {
        this.team = team;
        return this;
    }

    @JsonProperty("coach")
    public Coach getCoach() {
        return coach;
    }

    @JsonProperty("coach")
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Lineup withCoach(Coach coach) {
        this.coach = coach;
        return this;
    }

    @JsonProperty("formation")
    public String getFormation() {
        return formation;
    }

    @JsonProperty("formation")
    public void setFormation(String formation) {
        this.formation = formation;
    }

    public Lineup withFormation(String formation) {
        this.formation = formation;
        return this;
    }

    @JsonProperty("startXI")
    public List<StartXI> getStartXI() {
        return startXI;
    }

    @JsonProperty("startXI")
    public void setStartXI(List<StartXI> startXI) {
        this.startXI = startXI;
    }

    public Lineup withStartXI(List<StartXI> startXI) {
        this.startXI = startXI;
        return this;
    }

    @JsonProperty("substitutes")
    public List<Substitute> getSubstitutes() {
        return substitutes;
    }

    @JsonProperty("substitutes")
    public void setSubstitutes(List<Substitute> substitutes) {
        this.substitutes = substitutes;
    }

    public Lineup withSubstitutes(List<Substitute> substitutes) {
        this.substitutes = substitutes;
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

    public Lineup withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Lineup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("coach");
        sb.append('=');
        sb.append(((this.coach == null)?"<null>":this.coach));
        sb.append(',');
        sb.append("formation");
        sb.append('=');
        sb.append(((this.formation == null)?"<null>":this.formation));
        sb.append(',');
        sb.append("startXI");
        sb.append('=');
        sb.append(((this.startXI == null)?"<null>":this.startXI));
        sb.append(',');
        sb.append("substitutes");
        sb.append('=');
        sb.append(((this.substitutes == null)?"<null>":this.substitutes));
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
        result = ((result* 31)+((this.substitutes == null)? 0 :this.substitutes.hashCode()));
        result = ((result* 31)+((this.startXI == null)? 0 :this.startXI.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.formation == null)? 0 :this.formation.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.coach == null)? 0 :this.coach.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Lineup) == false) {
            return false;
        }
        Lineup rhs = ((Lineup) other);
        return (((((((this.substitutes == rhs.substitutes)||((this.substitutes!= null)&&this.substitutes.equals(rhs.substitutes)))&&((this.startXI == rhs.startXI)||((this.startXI!= null)&&this.startXI.equals(rhs.startXI))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this.formation == rhs.formation)||((this.formation!= null)&&this.formation.equals(rhs.formation))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.coach == rhs.coach)||((this.coach!= null)&&this.coach.equals(rhs.coach))));
    }

}
