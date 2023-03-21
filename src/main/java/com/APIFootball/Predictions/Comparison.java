
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
    "poisson_distribution",
    "h2h",
    "goals",
    "total"
})
@Generated("jsonschema2pojo")
public class Comparison {

    @JsonProperty("form")
    private Form form;
    @JsonProperty("att")
    private Att att;
    @JsonProperty("def")
    private Def def;
    @JsonProperty("poisson_distribution")
    private PoissonDistribution poissonDistribution;
    @JsonProperty("h2h")
    private H2h h2h;
    @JsonProperty("goals")
    private Goals__7 goals;
    @JsonProperty("total")
    private Total__4 total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("form")
    public Form getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(Form form) {
        this.form = form;
    }

    public Comparison withForm(Form form) {
        this.form = form;
        return this;
    }

    @JsonProperty("att")
    public Att getAtt() {
        return att;
    }

    @JsonProperty("att")
    public void setAtt(Att att) {
        this.att = att;
    }

    public Comparison withAtt(Att att) {
        this.att = att;
        return this;
    }

    @JsonProperty("def")
    public Def getDef() {
        return def;
    }

    @JsonProperty("def")
    public void setDef(Def def) {
        this.def = def;
    }

    public Comparison withDef(Def def) {
        this.def = def;
        return this;
    }

    @JsonProperty("poisson_distribution")
    public PoissonDistribution getPoissonDistribution() {
        return poissonDistribution;
    }

    @JsonProperty("poisson_distribution")
    public void setPoissonDistribution(PoissonDistribution poissonDistribution) {
        this.poissonDistribution = poissonDistribution;
    }

    public Comparison withPoissonDistribution(PoissonDistribution poissonDistribution) {
        this.poissonDistribution = poissonDistribution;
        return this;
    }

    @JsonProperty("h2h")
    public H2h getH2h() {
        return h2h;
    }

    @JsonProperty("h2h")
    public void setH2h(H2h h2h) {
        this.h2h = h2h;
    }

    public Comparison withH2h(H2h h2h) {
        this.h2h = h2h;
        return this;
    }

    @JsonProperty("goals")
    public Goals__7 getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals__7 goals) {
        this.goals = goals;
    }

    public Comparison withGoals(Goals__7 goals) {
        this.goals = goals;
        return this;
    }

    @JsonProperty("total")
    public Total__4 getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Total__4 total) {
        this.total = total;
    }

    public Comparison withTotal(Total__4 total) {
        this.total = total;
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

    public Comparison withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Comparison.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("poissonDistribution");
        sb.append('=');
        sb.append(((this.poissonDistribution == null)?"<null>":this.poissonDistribution));
        sb.append(',');
        sb.append("h2h");
        sb.append('=');
        sb.append(((this.h2h == null)?"<null>":this.h2h));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null)?"<null>":this.goals));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
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
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.def == null)? 0 :this.def.hashCode()));
        result = ((result* 31)+((this.poissonDistribution == null)? 0 :this.poissonDistribution.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.h2h == null)? 0 :this.h2h.hashCode()));
        result = ((result* 31)+((this.goals == null)? 0 :this.goals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Comparison) == false) {
            return false;
        }
        Comparison rhs = ((Comparison) other);
        return (((((((((this.att == rhs.att)||((this.att!= null)&&this.att.equals(rhs.att)))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.def == rhs.def)||((this.def!= null)&&this.def.equals(rhs.def))))&&((this.poissonDistribution == rhs.poissonDistribution)||((this.poissonDistribution!= null)&&this.poissonDistribution.equals(rhs.poissonDistribution))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.h2h == rhs.h2h)||((this.h2h!= null)&&this.h2h.equals(rhs.h2h))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))));
    }

}
