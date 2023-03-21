
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
    "fixture",
    "league",
    "teams",
    "goals",
    "score",
    "events",
    "lineups",
    "statistics",
    "players"
})
@Generated("jsonschema2pojo")
public class Response {

    @JsonProperty("fixture")
    private Fixture fixture;
    @JsonProperty("league")
    private League league;
    @JsonProperty("teams")
    private Teams teams;
    @JsonProperty("goals")
    private Goals goals;
    @JsonProperty("score")
    private Score score;
    @JsonProperty("events")
    private List<Event> events = new ArrayList<Event>();
    @JsonProperty("lineups")
    private List<Lineup> lineups = new ArrayList<Lineup>();
    @JsonProperty("statistics")
    private List<Statistic> statistics = new ArrayList<Statistic>();
    @JsonProperty("players")
    private List<Player__3> players = new ArrayList<Player__3>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fixture")
    public Fixture getFixture() {
        return fixture;
    }

    @JsonProperty("fixture")
    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public Response withFixture(Fixture fixture) {
        this.fixture = fixture;
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

    @JsonProperty("goals")
    public Goals getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    public Response withGoals(Goals goals) {
        this.goals = goals;
        return this;
    }

    @JsonProperty("score")
    public Score getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Score score) {
        this.score = score;
    }

    public Response withScore(Score score) {
        this.score = score;
        return this;
    }

    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Response withEvents(List<Event> events) {
        this.events = events;
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

    public Response withLineups(List<Lineup> lineups) {
        this.lineups = lineups;
        return this;
    }

    @JsonProperty("statistics")
    public List<Statistic> getStatistics() {
        return statistics;
    }

    @JsonProperty("statistics")
    public void setStatistics(List<Statistic> statistics) {
        this.statistics = statistics;
    }

    public Response withStatistics(List<Statistic> statistics) {
        this.statistics = statistics;
        return this;
    }

    @JsonProperty("players")
    public List<Player__3> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(List<Player__3> players) {
        this.players = players;
    }

    public Response withPlayers(List<Player__3> players) {
        this.players = players;
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
        sb.append("fixture");
        sb.append('=');
        sb.append(((this.fixture == null)?"<null>":this.fixture));
        sb.append(',');
        sb.append("league");
        sb.append('=');
        sb.append(((this.league == null)?"<null>":this.league));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null)?"<null>":this.goals));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("events");
        sb.append('=');
        sb.append(((this.events == null)?"<null>":this.events));
        sb.append(',');
        sb.append("lineups");
        sb.append('=');
        sb.append(((this.lineups == null)?"<null>":this.lineups));
        sb.append(',');
        sb.append("statistics");
        sb.append('=');
        sb.append(((this.statistics == null)?"<null>":this.statistics));
        sb.append(',');
        sb.append("players");
        sb.append('=');
        sb.append(((this.players == null)?"<null>":this.players));
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
        result = ((result* 31)+((this.fixture == null)? 0 :this.fixture.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.players == null)? 0 :this.players.hashCode()));
        result = ((result* 31)+((this.league == null)? 0 :this.league.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.events == null)? 0 :this.events.hashCode()));
        result = ((result* 31)+((this.goals == null)? 0 :this.goals.hashCode()));
        result = ((result* 31)+((this.lineups == null)? 0 :this.lineups.hashCode()));
        result = ((result* 31)+((this.statistics == null)? 0 :this.statistics.hashCode()));
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
        return (((((((((((this.fixture == rhs.fixture)||((this.fixture!= null)&&this.fixture.equals(rhs.fixture)))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams))))&&((this.players == rhs.players)||((this.players!= null)&&this.players.equals(rhs.players))))&&((this.league == rhs.league)||((this.league!= null)&&this.league.equals(rhs.league))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.events == rhs.events)||((this.events!= null)&&this.events.equals(rhs.events))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))))&&((this.lineups == rhs.lineups)||((this.lineups!= null)&&this.lineups.equals(rhs.lineups))))&&((this.statistics == rhs.statistics)||((this.statistics!= null)&&this.statistics.equals(rhs.statistics))));
    }

}
