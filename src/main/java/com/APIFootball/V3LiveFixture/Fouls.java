
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
    "drawn",
    "committed"
})
@Generated("jsonschema2pojo")
public class Fouls {

    @JsonProperty("drawn")
    private Integer drawn;
    @JsonProperty("committed")
    private Integer committed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("drawn")
    public Integer getDrawn() {
        return drawn;
    }

    @JsonProperty("drawn")
    public void setDrawn(Integer drawn) {
        this.drawn = drawn;
    }

    public Fouls withDrawn(Integer drawn) {
        this.drawn = drawn;
        return this;
    }

    @JsonProperty("committed")
    public Integer getCommitted() {
        return committed;
    }

    @JsonProperty("committed")
    public void setCommitted(Integer committed) {
        this.committed = committed;
    }

    public Fouls withCommitted(Integer committed) {
        this.committed = committed;
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

    public Fouls withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fouls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("drawn");
        sb.append('=');
        sb.append(((this.drawn == null)?"<null>":this.drawn));
        sb.append(',');
        sb.append("committed");
        sb.append('=');
        sb.append(((this.committed == null)?"<null>":this.committed));
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
        result = ((result* 31)+((this.committed == null)? 0 :this.committed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.drawn == null)? 0 :this.drawn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fouls) == false) {
            return false;
        }
        Fouls rhs = ((Fouls) other);
        return ((((this.committed == rhs.committed)||((this.committed!= null)&&this.committed.equals(rhs.committed)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.drawn == rhs.drawn)||((this.drawn!= null)&&this.drawn.equals(rhs.drawn))));
    }

}
