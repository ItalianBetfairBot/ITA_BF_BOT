
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
    "total",
    "blocks",
    "interceptions"
})
@Generated("jsonschema2pojo")
public class Tackles {

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("blocks")
    private Integer blocks;
    @JsonProperty("interceptions")
    private Integer interceptions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Tackles withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @JsonProperty("blocks")
    public Integer getBlocks() {
        return blocks;
    }

    @JsonProperty("blocks")
    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Tackles withBlocks(Integer blocks) {
        this.blocks = blocks;
        return this;
    }

    @JsonProperty("interceptions")
    public Integer getInterceptions() {
        return interceptions;
    }

    @JsonProperty("interceptions")
    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
    }

    public Tackles withInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
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

    public Tackles withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tackles.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("blocks");
        sb.append('=');
        sb.append(((this.blocks == null)?"<null>":this.blocks));
        sb.append(',');
        sb.append("interceptions");
        sb.append('=');
        sb.append(((this.interceptions == null)?"<null>":this.interceptions));
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
        result = ((result* 31)+((this.blocks == null)? 0 :this.blocks.hashCode()));
        result = ((result* 31)+((this.interceptions == null)? 0 :this.interceptions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tackles) == false) {
            return false;
        }
        Tackles rhs = ((Tackles) other);
        return (((((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.blocks == rhs.blocks)||((this.blocks!= null)&&this.blocks.equals(rhs.blocks))))&&((this.interceptions == rhs.interceptions)||((this.interceptions!= null)&&this.interceptions.equals(rhs.interceptions))));
    }

}
