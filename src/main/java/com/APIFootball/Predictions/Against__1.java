
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
    "total",
    "average",
    "minute"
})
@Generated("jsonschema2pojo")
public class Against__1 {

    @JsonProperty("total")
    private Total__1 total;
    @JsonProperty("average")
    private Average__1 average;
    @JsonProperty("minute")
    private Minute__1 minute;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total")
    public Total__1 getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Total__1 total) {
        this.total = total;
    }

    public Against__1 withTotal(Total__1 total) {
        this.total = total;
        return this;
    }

    @JsonProperty("average")
    public Average__1 getAverage() {
        return average;
    }

    @JsonProperty("average")
    public void setAverage(Average__1 average) {
        this.average = average;
    }

    public Against__1 withAverage(Average__1 average) {
        this.average = average;
        return this;
    }

    @JsonProperty("minute")
    public Minute__1 getMinute() {
        return minute;
    }

    @JsonProperty("minute")
    public void setMinute(Minute__1 minute) {
        this.minute = minute;
    }

    public Against__1 withMinute(Minute__1 minute) {
        this.minute = minute;
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

    public Against__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Against__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("average");
        sb.append('=');
        sb.append(((this.average == null)?"<null>":this.average));
        sb.append(',');
        sb.append("minute");
        sb.append('=');
        sb.append(((this.minute == null)?"<null>":this.minute));
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
        result = ((result* 31)+((this.average == null)? 0 :this.average.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.minute == null)? 0 :this.minute.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Against__1) == false) {
            return false;
        }
        Against__1 rhs = ((Against__1) other);
        return (((((this.average == rhs.average)||((this.average!= null)&&this.average.equals(rhs.average)))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.minute == rhs.minute)||((this.minute!= null)&&this.minute.equals(rhs.minute))));
    }

}
