
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
    "minutes",
    "number",
    "position",
    "rating",
    "captain",
    "substitute"
})
@Generated("jsonschema2pojo")
public class Games {

    @JsonProperty("minutes")
    private Integer minutes;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("position")
    private String position;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("captain")
    private Boolean captain;
    @JsonProperty("substitute")
    private Boolean substitute;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Games withMinutes(Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Games withNumber(Integer number) {
        this.number = number;
        return this;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    public Games withPosition(String position) {
        this.position = position;
        return this;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    public Games withRating(String rating) {
        this.rating = rating;
        return this;
    }

    @JsonProperty("captain")
    public Boolean getCaptain() {
        return captain;
    }

    @JsonProperty("captain")
    public void setCaptain(Boolean captain) {
        this.captain = captain;
    }

    public Games withCaptain(Boolean captain) {
        this.captain = captain;
        return this;
    }

    @JsonProperty("substitute")
    public Boolean getSubstitute() {
        return substitute;
    }

    @JsonProperty("substitute")
    public void setSubstitute(Boolean substitute) {
        this.substitute = substitute;
    }

    public Games withSubstitute(Boolean substitute) {
        this.substitute = substitute;
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

    public Games withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Games.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("minutes");
        sb.append('=');
        sb.append(((this.minutes == null)?"<null>":this.minutes));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("rating");
        sb.append('=');
        sb.append(((this.rating == null)?"<null>":this.rating));
        sb.append(',');
        sb.append("captain");
        sb.append('=');
        sb.append(((this.captain == null)?"<null>":this.captain));
        sb.append(',');
        sb.append("substitute");
        sb.append('=');
        sb.append(((this.substitute == null)?"<null>":this.substitute));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.minutes == null)? 0 :this.minutes.hashCode()));
        result = ((result* 31)+((this.rating == null)? 0 :this.rating.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        result = ((result* 31)+((this.captain == null)? 0 :this.captain.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.substitute == null)? 0 :this.substitute.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Games) == false) {
            return false;
        }
        Games rhs = ((Games) other);
        return ((((((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.minutes == rhs.minutes)||((this.minutes!= null)&&this.minutes.equals(rhs.minutes))))&&((this.rating == rhs.rating)||((this.rating!= null)&&this.rating.equals(rhs.rating))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))))&&((this.captain == rhs.captain)||((this.captain!= null)&&this.captain.equals(rhs.captain))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.substitute == rhs.substitute)||((this.substitute!= null)&&this.substitute.equals(rhs.substitute))));
    }

}
