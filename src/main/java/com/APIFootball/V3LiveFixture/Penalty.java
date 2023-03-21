
package com.APIFootball.V3LiveFixture;

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
    "home",
    "away"
})
@Generated("jsonschema2pojo")
public class Penalty {

    @JsonProperty("home")
    private Object home;
    @JsonProperty("away")
    private Object away;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("home")
    public Object getHome() {
        return home;
    }

    @JsonProperty("home")
    public void setHome(Object home) {
        this.home = home;
    }

    public Penalty withHome(Object home) {
        this.home = home;
        return this;
    }

    @JsonProperty("away")
    public Object getAway() {
        return away;
    }

    @JsonProperty("away")
    public void setAway(Object away) {
        this.away = away;
    }

    public Penalty withAway(Object away) {
        this.away = away;
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

    public Penalty withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Penalty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("home");
        sb.append('=');
        sb.append(((this.home == null)?"<null>":this.home));
        sb.append(',');
        sb.append("away");
        sb.append('=');
        sb.append(((this.away == null)?"<null>":this.away));
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
        result = ((result* 31)+((this.away == null)? 0 :this.away.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.home == null)? 0 :this.home.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Penalty) == false) {
            return false;
        }
        Penalty rhs = ((Penalty) other);
        return ((((this.away == rhs.away)||((this.away!= null)&&this.away.equals(rhs.away)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.home == rhs.home)||((this.home!= null)&&this.home.equals(rhs.home))));
    }

}
