
package com.APIFootball.Predictions;

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
    "formation",
    "played"
})
@Generated("jsonschema2pojo")
public class Lineup__1 {

    @JsonProperty("formation")
    private String formation;
    @JsonProperty("played")
    private Integer played;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("formation")
    public String getFormation() {
        return formation;
    }

    @JsonProperty("formation")
    public void setFormation(String formation) {
        this.formation = formation;
    }

    public Lineup__1 withFormation(String formation) {
        this.formation = formation;
        return this;
    }

    @JsonProperty("played")
    public Integer getPlayed() {
        return played;
    }

    @JsonProperty("played")
    public void setPlayed(Integer played) {
        this.played = played;
    }

    public Lineup__1 withPlayed(Integer played) {
        this.played = played;
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

    public Lineup__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Lineup__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("formation");
        sb.append('=');
        sb.append(((this.formation == null)?"<null>":this.formation));
        sb.append(',');
        sb.append("played");
        sb.append('=');
        sb.append(((this.played == null)?"<null>":this.played));
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
        result = ((result* 31)+((this.formation == null)? 0 :this.formation.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.played == null)? 0 :this.played.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Lineup__1) == false) {
            return false;
        }
        Lineup__1 rhs = ((Lineup__1) other);
        return ((((this.formation == rhs.formation)||((this.formation!= null)&&this.formation.equals(rhs.formation)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.played == rhs.played)||((this.played!= null)&&this.played.equals(rhs.played))));
    }

}
