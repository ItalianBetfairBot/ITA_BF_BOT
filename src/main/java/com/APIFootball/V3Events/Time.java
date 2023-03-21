
package com.APIFootball.V3Events;

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
    "elapsed",
    "extra"
})
@Generated("jsonschema2pojo")
public class Time {

    @JsonProperty("elapsed")
    private Integer elapsed;
    @JsonProperty("extra")
    private Object extra;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("elapsed")
    public Integer getElapsed() {
        return elapsed;
    }

    @JsonProperty("elapsed")
    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    public Time withElapsed(Integer elapsed) {
        this.elapsed = elapsed;
        return this;
    }

    @JsonProperty("extra")
    public Object getExtra() {
        return extra;
    }

    @JsonProperty("extra")
    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public Time withExtra(Object extra) {
        this.extra = extra;
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

    public Time withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Time.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("elapsed");
        sb.append('=');
        sb.append(((this.elapsed == null)?"<null>":this.elapsed));
        sb.append(',');
        sb.append("extra");
        sb.append('=');
        sb.append(((this.extra == null)?"<null>":this.extra));
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
        result = ((result* 31)+((this.elapsed == null)? 0 :this.elapsed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.extra == null)? 0 :this.extra.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Time) == false) {
            return false;
        }
        Time rhs = ((Time) other);
        return ((((this.elapsed == rhs.elapsed)||((this.elapsed!= null)&&this.elapsed.equals(rhs.elapsed)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.extra == rhs.extra)||((this.extra!= null)&&this.extra.equals(rhs.extra))));
    }

}
