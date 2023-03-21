
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
    "form",
    "att",
    "def",
    "goals"
})
@Generated("jsonschema2pojo")
public class Last5 {

    @JsonProperty("form")
    private String form;
    @JsonProperty("att")
    private String att;
    @JsonProperty("def")
    private String def;
    @JsonProperty("goals")
    private Goals__1 goals;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    public Last5 withForm(String form) {
        this.form = form;
        return this;
    }

    @JsonProperty("att")
    public String getAtt() {
        return att;
    }

    @JsonProperty("att")
    public void setAtt(String att) {
        this.att = att;
    }

    public Last5 withAtt(String att) {
        this.att = att;
        return this;
    }

    @JsonProperty("def")
    public String getDef() {
        return def;
    }

    @JsonProperty("def")
    public void setDef(String def) {
        this.def = def;
    }

    public Last5 withDef(String def) {
        this.def = def;
        return this;
    }

    @JsonProperty("goals")
    public Goals__1 getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals__1 goals) {
        this.goals = goals;
    }

    public Last5 withGoals(Goals__1 goals) {
        this.goals = goals;
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

    public Last5 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Last5 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("att");
        sb.append('=');
        sb.append(((this.att == null)?"<null>":this.att));
        sb.append(',');
        sb.append("def");
        sb.append('=');
        sb.append(((this.def == null)?"<null>":this.def));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null)?"<null>":this.goals));
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
        result = ((result* 31)+((this.att == null)? 0 :this.att.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.def == null)? 0 :this.def.hashCode()));
        result = ((result* 31)+((this.goals == null)? 0 :this.goals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Last5) == false) {
            return false;
        }
        Last5 rhs = ((Last5) other);
        return ((((((this.att == rhs.att)||((this.att!= null)&&this.att.equals(rhs.att)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.def == rhs.def)||((this.def!= null)&&this.def.equals(rhs.def))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))));
    }

}
