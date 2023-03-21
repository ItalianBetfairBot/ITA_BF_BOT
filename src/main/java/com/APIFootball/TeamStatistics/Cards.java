
package com.APIFootball.TeamStatistics;

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
    "yellow",
    "red"
})
@Generated("jsonschema2pojo")
public class Cards {

    @JsonProperty("yellow")
    private Yellow yellow;
    @JsonProperty("red")
    private Red red;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("yellow")
    public Yellow getYellow() {
        return yellow;
    }

    @JsonProperty("yellow")
    public void setYellow(Yellow yellow) {
        this.yellow = yellow;
    }

    public Cards withYellow(Yellow yellow) {
        this.yellow = yellow;
        return this;
    }

    @JsonProperty("red")
    public Red getRed() {
        return red;
    }

    @JsonProperty("red")
    public void setRed(Red red) {
        this.red = red;
    }

    public Cards withRed(Red red) {
        this.red = red;
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

    public Cards withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cards.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("yellow");
        sb.append('=');
        sb.append(((this.yellow == null)?"<null>":this.yellow));
        sb.append(',');
        sb.append("red");
        sb.append('=');
        sb.append(((this.red == null)?"<null>":this.red));
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
        result = ((result* 31)+((this.yellow == null)? 0 :this.yellow.hashCode()));
        result = ((result* 31)+((this.red == null)? 0 :this.red.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cards) == false) {
            return false;
        }
        Cards rhs = ((Cards) other);
        return ((((this.yellow == rhs.yellow)||((this.yellow!= null)&&this.yellow.equals(rhs.yellow)))&&((this.red == rhs.red)||((this.red!= null)&&this.red.equals(rhs.red))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
