
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
    "for",
    "against"
})
@Generated("jsonschema2pojo")
public class Goals__4 {

    @JsonProperty("for")
    private For__3 _for;
    @JsonProperty("against")
    private Against__3 against;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("for")
    public For__3 getFor() {
        return _for;
    }

    @JsonProperty("for")
    public void setFor(For__3 _for) {
        this._for = _for;
    }

    public Goals__4 withFor(For__3 _for) {
        this._for = _for;
        return this;
    }

    @JsonProperty("against")
    public Against__3 getAgainst() {
        return against;
    }

    @JsonProperty("against")
    public void setAgainst(Against__3 against) {
        this.against = against;
    }

    public Goals__4 withAgainst(Against__3 against) {
        this.against = against;
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

    public Goals__4 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Goals__4 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_for");
        sb.append('=');
        sb.append(((this._for == null)?"<null>":this._for));
        sb.append(',');
        sb.append("against");
        sb.append('=');
        sb.append(((this.against == null)?"<null>":this.against));
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
        result = ((result* 31)+((this._for == null)? 0 :this._for.hashCode()));
        result = ((result* 31)+((this.against == null)? 0 :this.against.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Goals__4) == false) {
            return false;
        }
        Goals__4 rhs = ((Goals__4) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this._for == rhs._for)||((this._for!= null)&&this._for.equals(rhs._for))))&&((this.against == rhs.against)||((this.against!= null)&&this.against.equals(rhs.against))));
    }

}
