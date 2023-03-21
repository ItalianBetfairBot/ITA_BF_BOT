
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
    "conceded",
    "assists",
    "saves"
})
@Generated("jsonschema2pojo")
public class Goals__1 {

    @JsonProperty("total")
    private Object total;
    @JsonProperty("conceded")
    private Integer conceded;
    @JsonProperty("assists")
    private Object assists;
    @JsonProperty("saves")
    private Object saves;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total")
    public Object getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Object total) {
        this.total = total;
    }

    public Goals__1 withTotal(Object total) {
        this.total = total;
        return this;
    }

    @JsonProperty("conceded")
    public Integer getConceded() {
        return conceded;
    }

    @JsonProperty("conceded")
    public void setConceded(Integer conceded) {
        this.conceded = conceded;
    }

    public Goals__1 withConceded(Integer conceded) {
        this.conceded = conceded;
        return this;
    }

    @JsonProperty("assists")
    public Object getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Object assists) {
        this.assists = assists;
    }

    public Goals__1 withAssists(Object assists) {
        this.assists = assists;
        return this;
    }

    @JsonProperty("saves")
    public Object getSaves() {
        return saves;
    }

    @JsonProperty("saves")
    public void setSaves(Object saves) {
        this.saves = saves;
    }

    public Goals__1 withSaves(Object saves) {
        this.saves = saves;
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

    public Goals__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Goals__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("conceded");
        sb.append('=');
        sb.append(((this.conceded == null)?"<null>":this.conceded));
        sb.append(',');
        sb.append("assists");
        sb.append('=');
        sb.append(((this.assists == null)?"<null>":this.assists));
        sb.append(',');
        sb.append("saves");
        sb.append('=');
        sb.append(((this.saves == null)?"<null>":this.saves));
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
        result = ((result* 31)+((this.conceded == null)? 0 :this.conceded.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.saves == null)? 0 :this.saves.hashCode()));
        result = ((result* 31)+((this.assists == null)? 0 :this.assists.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Goals__1) == false) {
            return false;
        }
        Goals__1 rhs = ((Goals__1) other);
        return ((((((this.conceded == rhs.conceded)||((this.conceded!= null)&&this.conceded.equals(rhs.conceded)))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.saves == rhs.saves)||((this.saves!= null)&&this.saves.equals(rhs.saves))))&&((this.assists == rhs.assists)||((this.assists!= null)&&this.assists.equals(rhs.assists))));
    }

}
