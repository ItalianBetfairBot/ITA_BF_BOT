
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
    "scored",
    "missed",
    "total"
})
@Generated("jsonschema2pojo")
public class Penalty__1 {

    @JsonProperty("scored")
    private Scored__1 scored;
    @JsonProperty("missed")
    private Missed__1 missed;
    @JsonProperty("total")
    private Integer total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scored")
    public Scored__1 getScored() {
        return scored;
    }

    @JsonProperty("scored")
    public void setScored(Scored__1 scored) {
        this.scored = scored;
    }

    public Penalty__1 withScored(Scored__1 scored) {
        this.scored = scored;
        return this;
    }

    @JsonProperty("missed")
    public Missed__1 getMissed() {
        return missed;
    }

    @JsonProperty("missed")
    public void setMissed(Missed__1 missed) {
        this.missed = missed;
    }

    public Penalty__1 withMissed(Missed__1 missed) {
        this.missed = missed;
        return this;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Penalty__1 withTotal(Integer total) {
        this.total = total;
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
        sb.append("scored");
        sb.append('=');
        sb.append(((this.scored == null)?"<null>":this.scored));
        sb.append(',');
        sb.append("missed");
        sb.append('=');
        sb.append(((this.missed == null)?"<null>":this.missed));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
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
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scored == null)? 0 :this.scored.hashCode()));
        result = ((result* 31)+((this.missed == null)? 0 :this.missed.hashCode()));
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
        return (((((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scored == rhs.scored)||((this.scored!= null)&&this.scored.equals(rhs.scored))))&&((this.missed == rhs.missed)||((this.missed!= null)&&this.missed.equals(rhs.missed))));
    }

}
