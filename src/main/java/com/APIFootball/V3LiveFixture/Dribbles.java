
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
    "attempts",
    "success",
    "past"
})
@Generated("jsonschema2pojo")
public class Dribbles {

    @JsonProperty("attempts")
    private Integer attempts;
    @JsonProperty("success")
    private Integer success;
    @JsonProperty("past")
    private Integer past;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("attempts")
    public Integer getAttempts() {
        return attempts;
    }

    @JsonProperty("attempts")
    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    public Dribbles withAttempts(Integer attempts) {
        this.attempts = attempts;
        return this;
    }

    @JsonProperty("success")
    public Integer getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Dribbles withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    @JsonProperty("past")
    public Integer getPast() {
        return past;
    }

    @JsonProperty("past")
    public void setPast(Integer past) {
        this.past = past;
    }

    public Dribbles withPast(Integer past) {
        this.past = past;
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

    public Dribbles withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dribbles.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attempts");
        sb.append('=');
        sb.append(((this.attempts == null)?"<null>":this.attempts));
        sb.append(',');
        sb.append("success");
        sb.append('=');
        sb.append(((this.success == null)?"<null>":this.success));
        sb.append(',');
        sb.append("past");
        sb.append('=');
        sb.append(((this.past == null)?"<null>":this.past));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.success == null)? 0 :this.success.hashCode()));
        result = ((result* 31)+((this.past == null)? 0 :this.past.hashCode()));
        result = ((result* 31)+((this.attempts == null)? 0 :this.attempts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dribbles) == false) {
            return false;
        }
        Dribbles rhs = ((Dribbles) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.success == rhs.success)||((this.success!= null)&&this.success.equals(rhs.success))))&&((this.past == rhs.past)||((this.past!= null)&&this.past.equals(rhs.past))))&&((this.attempts == rhs.attempts)||((this.attempts!= null)&&this.attempts.equals(rhs.attempts))));
    }

}
