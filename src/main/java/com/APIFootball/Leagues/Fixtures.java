
package com.APIFootball.Leagues;

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
    "events",
    "lineups",
    "statistics_fixtures",
    "statistics_players"
})
@Generated("jsonschema2pojo")
public class Fixtures {

    @JsonProperty("events")
    private Boolean events;
    @JsonProperty("lineups")
    private Boolean lineups;
    @JsonProperty("statistics_fixtures")
    private Boolean statisticsFixtures;
    @JsonProperty("statistics_players")
    private Boolean statisticsPlayers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("events")
    public Boolean getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(Boolean events) {
        this.events = events;
    }

    public Fixtures withEvents(Boolean events) {
        this.events = events;
        return this;
    }

    @JsonProperty("lineups")
    public Boolean getLineups() {
        return lineups;
    }

    @JsonProperty("lineups")
    public void setLineups(Boolean lineups) {
        this.lineups = lineups;
    }

    public Fixtures withLineups(Boolean lineups) {
        this.lineups = lineups;
        return this;
    }

    @JsonProperty("statistics_fixtures")
    public Boolean getStatisticsFixtures() {
        return statisticsFixtures;
    }

    @JsonProperty("statistics_fixtures")
    public void setStatisticsFixtures(Boolean statisticsFixtures) {
        this.statisticsFixtures = statisticsFixtures;
    }

    public Fixtures withStatisticsFixtures(Boolean statisticsFixtures) {
        this.statisticsFixtures = statisticsFixtures;
        return this;
    }

    @JsonProperty("statistics_players")
    public Boolean getStatisticsPlayers() {
        return statisticsPlayers;
    }

    @JsonProperty("statistics_players")
    public void setStatisticsPlayers(Boolean statisticsPlayers) {
        this.statisticsPlayers = statisticsPlayers;
    }

    public Fixtures withStatisticsPlayers(Boolean statisticsPlayers) {
        this.statisticsPlayers = statisticsPlayers;
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

    public Fixtures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fixtures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("events");
        sb.append('=');
        sb.append(((this.events == null)?"<null>":this.events));
        sb.append(',');
        sb.append("lineups");
        sb.append('=');
        sb.append(((this.lineups == null)?"<null>":this.lineups));
        sb.append(',');
        sb.append("statisticsFixtures");
        sb.append('=');
        sb.append(((this.statisticsFixtures == null)?"<null>":this.statisticsFixtures));
        sb.append(',');
        sb.append("statisticsPlayers");
        sb.append('=');
        sb.append(((this.statisticsPlayers == null)?"<null>":this.statisticsPlayers));
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
        result = ((result* 31)+((this.statisticsFixtures == null)? 0 :this.statisticsFixtures.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.events == null)? 0 :this.events.hashCode()));
        result = ((result* 31)+((this.lineups == null)? 0 :this.lineups.hashCode()));
        result = ((result* 31)+((this.statisticsPlayers == null)? 0 :this.statisticsPlayers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fixtures) == false) {
            return false;
        }
        Fixtures rhs = ((Fixtures) other);
        return ((((((this.statisticsFixtures == rhs.statisticsFixtures)||((this.statisticsFixtures!= null)&&this.statisticsFixtures.equals(rhs.statisticsFixtures)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.events == rhs.events)||((this.events!= null)&&this.events.equals(rhs.events))))&&((this.lineups == rhs.lineups)||((this.lineups!= null)&&this.lineups.equals(rhs.lineups))))&&((this.statisticsPlayers == rhs.statisticsPlayers)||((this.statisticsPlayers!= null)&&this.statisticsPlayers.equals(rhs.statisticsPlayers))));
    }

}
