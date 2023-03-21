
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
    "won",
    "commited",
    "scored",
    "missed",
    "saved"
})
@Generated("jsonschema2pojo")
public class Penalty__1 {

    @JsonProperty("won")
    private Object won;
    @JsonProperty("commited")
    private Object commited;
    @JsonProperty("scored")
    private Integer scored;
    @JsonProperty("missed")
    private Integer missed;
    @JsonProperty("saved")
    private Object saved;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("won")
    public Object getWon() {
        return won;
    }

    @JsonProperty("won")
    public void setWon(Object won) {
        this.won = won;
    }

    public Penalty__1 withWon(Object won) {
        this.won = won;
        return this;
    }

    @JsonProperty("commited")
    public Object getCommited() {
        return commited;
    }

    @JsonProperty("commited")
    public void setCommited(Object commited) {
        this.commited = commited;
    }

    public Penalty__1 withCommited(Object commited) {
        this.commited = commited;
        return this;
    }

    @JsonProperty("scored")
    public Integer getScored() {
        return scored;
    }

    @JsonProperty("scored")
    public void setScored(Integer scored) {
        this.scored = scored;
    }

    public Penalty__1 withScored(Integer scored) {
        this.scored = scored;
        return this;
    }

    @JsonProperty("missed")
    public Integer getMissed() {
        return missed;
    }

    @JsonProperty("missed")
    public void setMissed(Integer missed) {
        this.missed = missed;
    }

    public Penalty__1 withMissed(Integer missed) {
        this.missed = missed;
        return this;
    }

    @JsonProperty("saved")
    public Object getSaved() {
        return saved;
    }

    @JsonProperty("saved")
    public void setSaved(Object saved) {
        this.saved = saved;
    }

    public Penalty__1 withSaved(Object saved) {
        this.saved = saved;
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

    public Penalty__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Penalty__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("won");
        sb.append('=');
        sb.append(((this.won == null)?"<null>":this.won));
        sb.append(',');
        sb.append("commited");
        sb.append('=');
        sb.append(((this.commited == null)?"<null>":this.commited));
        sb.append(',');
        sb.append("scored");
        sb.append('=');
        sb.append(((this.scored == null)?"<null>":this.scored));
        sb.append(',');
        sb.append("missed");
        sb.append('=');
        sb.append(((this.missed == null)?"<null>":this.missed));
        sb.append(',');
        sb.append("saved");
        sb.append('=');
        sb.append(((this.saved == null)?"<null>":this.saved));
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
        result = ((result* 31)+((this.saved == null)? 0 :this.saved.hashCode()));
        result = ((result* 31)+((this.scored == null)? 0 :this.scored.hashCode()));
        result = ((result* 31)+((this.missed == null)? 0 :this.missed.hashCode()));
        result = ((result* 31)+((this.won == null)? 0 :this.won.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.commited == null)? 0 :this.commited.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Penalty__1) == false) {
            return false;
        }
        Penalty__1 rhs = ((Penalty__1) other);
        return (((((((this.saved == rhs.saved)||((this.saved!= null)&&this.saved.equals(rhs.saved)))&&((this.scored == rhs.scored)||((this.scored!= null)&&this.scored.equals(rhs.scored))))&&((this.missed == rhs.missed)||((this.missed!= null)&&this.missed.equals(rhs.missed))))&&((this.won == rhs.won)||((this.won!= null)&&this.won.equals(rhs.won))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.commited == rhs.commited)||((this.commited!= null)&&this.commited.equals(rhs.commited))));
    }

}
