
package com.APIFootball.V3Odds;

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
    "league",
    "fixture",
    "update",
    "bookmakers"
})
@Generated("jsonschema2pojo")
public class Response {

    @JsonProperty("league")
    private League league;
    @JsonProperty("fixture")
    private Fixture fixture;
    @JsonProperty("update")
    private String update;
    @JsonProperty("bookmakers")
    private List<Bookmaker> bookmakers = new ArrayList<Bookmaker>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("update")
    public String getUpdate() {
        return update;
    }

    @JsonProperty("update")
    public void setUpdate(String update) {
        this.update = update;
    }

    public Response withUpdate(String update) {
        this.update = update;
        return this;
    }

    @JsonProperty("bookmakers")
    public List<Bookmaker> getBookmakers() {
        return bookmakers;
    }

    @JsonProperty("bookmakers")
    public void setBookmakers(List<Bookmaker> bookmakers) {
        this.bookmakers = bookmakers;
    }

    public Response withBookmakers(List<Bookmaker> bookmakers) {
        this.bookmakers = bookmakers;
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
        sb.append("league");
        sb.append('=');
        sb.append(((this.league == null)?"<null>":this.league));
        sb.append(',');
        sb.append("fixture");
        sb.append('=');
        sb.append(((this.fixture == null)?"<null>":this.fixture));
        sb.append(',');
        sb.append("update");
        sb.append('=');
        sb.append(((this.update == null)?"<null>":this.update));
        sb.append(',');
        sb.append("bookmakers");
        sb.append('=');
        sb.append(((this.bookmakers == null)?"<null>":this.bookmakers));
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
        result = ((result* 31)+((this.update == null)? 0 :this.update.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.league == null)? 0 :this.league.hashCode()));
        result = ((result* 31)+((this.bookmakers == null)? 0 :this.bookmakers.hashCode()));
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
        return ((((((this.fixture == rhs.fixture)||((this.fixture!= null)&&this.fixture.equals(rhs.fixture)))&&((this.update == rhs.update)||((this.update!= null)&&this.update.equals(rhs.update))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.league == rhs.league)||((this.league!= null)&&this.league.equals(rhs.league))))&&((this.bookmakers == rhs.bookmakers)||((this.bookmakers!= null)&&this.bookmakers.equals(rhs.bookmakers))));
    }

}
