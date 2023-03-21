
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
    "0-15",
    "16-30",
    "31-45",
    "46-60",
    "61-75",
    "76-90",
    "91-105",
    "106-120"
})
@Generated("jsonschema2pojo")
public class Minute {

    @JsonProperty("0-15")
    private com.APIFootball.Predictions._015 _015;
    @JsonProperty("16-30")
    private com.APIFootball.Predictions._1630 _1630;
    @JsonProperty("31-45")
    private com.APIFootball.Predictions._3145 _3145;
    @JsonProperty("46-60")
    private com.APIFootball.Predictions._4660 _4660;
    @JsonProperty("61-75")
    private com.APIFootball.Predictions._6175 _6175;
    @JsonProperty("76-90")
    private com.APIFootball.Predictions._7690 _7690;
    @JsonProperty("91-105")
    private com.APIFootball.Predictions._91105 _91105;
    @JsonProperty("106-120")
    private com.APIFootball.Predictions._106120 _106120;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("0-15")
    public com.APIFootball.Predictions._015 get015() {
        return _015;
    }

    @JsonProperty("0-15")
    public void set015(com.APIFootball.Predictions._015 _015) {
        this._015 = _015;
    }

    public Minute with015(com.APIFootball.Predictions._015 _015) {
        this._015 = _015;
        return this;
    }

    @JsonProperty("16-30")
    public com.APIFootball.Predictions._1630 get1630() {
        return _1630;
    }

    @JsonProperty("16-30")
    public void set1630(com.APIFootball.Predictions._1630 _1630) {
        this._1630 = _1630;
    }

    public Minute with1630(com.APIFootball.Predictions._1630 _1630) {
        this._1630 = _1630;
        return this;
    }

    @JsonProperty("31-45")
    public com.APIFootball.Predictions._3145 get3145() {
        return _3145;
    }

    @JsonProperty("31-45")
    public void set3145(com.APIFootball.Predictions._3145 _3145) {
        this._3145 = _3145;
    }

    public Minute with3145(com.APIFootball.Predictions._3145 _3145) {
        this._3145 = _3145;
        return this;
    }

    @JsonProperty("46-60")
    public com.APIFootball.Predictions._4660 get4660() {
        return _4660;
    }

    @JsonProperty("46-60")
    public void set4660(com.APIFootball.Predictions._4660 _4660) {
        this._4660 = _4660;
    }

    public Minute with4660(com.APIFootball.Predictions._4660 _4660) {
        this._4660 = _4660;
        return this;
    }

    @JsonProperty("61-75")
    public com.APIFootball.Predictions._6175 get6175() {
        return _6175;
    }

    @JsonProperty("61-75")
    public void set6175(com.APIFootball.Predictions._6175 _6175) {
        this._6175 = _6175;
    }

    public Minute with6175(com.APIFootball.Predictions._6175 _6175) {
        this._6175 = _6175;
        return this;
    }

    @JsonProperty("76-90")
    public com.APIFootball.Predictions._7690 get7690() {
        return _7690;
    }

    @JsonProperty("76-90")
    public void set7690(com.APIFootball.Predictions._7690 _7690) {
        this._7690 = _7690;
    }

    public Minute with7690(com.APIFootball.Predictions._7690 _7690) {
        this._7690 = _7690;
        return this;
    }

    @JsonProperty("91-105")
    public com.APIFootball.Predictions._91105 get91105() {
        return _91105;
    }

    @JsonProperty("91-105")
    public void set91105(com.APIFootball.Predictions._91105 _91105) {
        this._91105 = _91105;
    }

    public Minute with91105(com.APIFootball.Predictions._91105 _91105) {
        this._91105 = _91105;
        return this;
    }

    @JsonProperty("106-120")
    public com.APIFootball.Predictions._106120 get106120() {
        return _106120;
    }

    @JsonProperty("106-120")
    public void set106120(com.APIFootball.Predictions._106120 _106120) {
        this._106120 = _106120;
    }

    public Minute with106120(com.APIFootball.Predictions._106120 _106120) {
        this._106120 = _106120;
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

    public Minute withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Minute.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_015");
        sb.append('=');
        sb.append(((this._015 == null)?"<null>":this._015));
        sb.append(',');
        sb.append("_1630");
        sb.append('=');
        sb.append(((this._1630 == null)?"<null>":this._1630));
        sb.append(',');
        sb.append("_3145");
        sb.append('=');
        sb.append(((this._3145 == null)?"<null>":this._3145));
        sb.append(',');
        sb.append("_4660");
        sb.append('=');
        sb.append(((this._4660 == null)?"<null>":this._4660));
        sb.append(',');
        sb.append("_6175");
        sb.append('=');
        sb.append(((this._6175 == null)?"<null>":this._6175));
        sb.append(',');
        sb.append("_7690");
        sb.append('=');
        sb.append(((this._7690 == null)?"<null>":this._7690));
        sb.append(',');
        sb.append("_91105");
        sb.append('=');
        sb.append(((this._91105 == null)?"<null>":this._91105));
        sb.append(',');
        sb.append("_106120");
        sb.append('=');
        sb.append(((this._106120 == null)?"<null>":this._106120));
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
        result = ((result* 31)+((this._1630 == null)? 0 :this._1630 .hashCode()));
        result = ((result* 31)+((this._7690 == null)? 0 :this._7690 .hashCode()));
        result = ((result* 31)+((this._4660 == null)? 0 :this._4660 .hashCode()));
        result = ((result* 31)+((this._91105 == null)? 0 :this._91105 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._3145 == null)? 0 :this._3145 .hashCode()));
        result = ((result* 31)+((this._6175 == null)? 0 :this._6175 .hashCode()));
        result = ((result* 31)+((this._106120 == null)? 0 :this._106120 .hashCode()));
        result = ((result* 31)+((this._015 == null)? 0 :this._015 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Minute) == false) {
            return false;
        }
        Minute rhs = ((Minute) other);
        return ((((((((((this._1630 == rhs._1630)||((this._1630 != null)&&this._1630 .equals(rhs._1630)))&&((this._7690 == rhs._7690)||((this._7690 != null)&&this._7690 .equals(rhs._7690))))&&((this._4660 == rhs._4660)||((this._4660 != null)&&this._4660 .equals(rhs._4660))))&&((this._91105 == rhs._91105)||((this._91105 != null)&&this._91105 .equals(rhs._91105))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._3145 == rhs._3145)||((this._3145 != null)&&this._3145 .equals(rhs._3145))))&&((this._6175 == rhs._6175)||((this._6175 != null)&&this._6175 .equals(rhs._6175))))&&((this._106120 == rhs._106120)||((this._106120 != null)&&this._106120 .equals(rhs._106120))))&&((this._015 == rhs._015)||((this._015 != null)&&this._015 .equals(rhs._015))));
    }

}
