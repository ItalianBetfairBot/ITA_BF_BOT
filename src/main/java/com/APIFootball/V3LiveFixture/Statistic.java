
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
    "statistics"
})
@Generated("jsonschema2pojo")
public class Statistic {

    @JsonProperty("team")
    private Team__2 team;
    @JsonProperty("statistics")
    private List<Statistic__1> statistics = new ArrayList<Statistic__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("team")
    public Team__2 getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(Team__2 team) {
        this.team = team;
    }

    public Statistic withTeam(Team__2 team) {
        this.team = team;
        return this;
    }

    @JsonProperty("statistics")
    public List<Statistic__1> getStatistics() {
        return statistics;
    }

    @JsonProperty("statistics")
    public void setStatistics(List<Statistic__1> statistics) {
        this.statistics = statistics;
    }

    public Statistic withStatistics(List<Statistic__1> statistics) {
        this.statistics = statistics;
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

    public Statistic withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Statistic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("statistics");
        sb.append('=');
        sb.append(((this.statistics == null)?"<null>":this.statistics));
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
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.statistics == null)? 0 :this.statistics.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Statistic) == false) {
            return false;
        }
        Statistic rhs = ((Statistic) other);
        return ((((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.statistics == rhs.statistics)||((this.statistics!= null)&&this.statistics.equals(rhs.statistics))));
    }

}
