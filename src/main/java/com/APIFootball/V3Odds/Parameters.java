
package com.APIFootball.V3Odds;

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
    "bookmaker",
    "date",
    "bet"
})
@Generated("jsonschema2pojo")
public class Parameters {

    @JsonProperty("bookmaker")
    private String bookmaker;
    @JsonProperty("date")
    private String date;
    @JsonProperty("bet")
    private String bet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bookmaker")
    public String getBookmaker() {
        return bookmaker;
    }

    @JsonProperty("bookmaker")
    public void setBookmaker(String bookmaker) {
        this.bookmaker = bookmaker;
    }

    public Parameters withBookmaker(String bookmaker) {
        this.bookmaker = bookmaker;
        return this;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Parameters withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("bet")
    public String getBet() {
        return bet;
    }

    @JsonProperty("bet")
    public void setBet(String bet) {
        this.bet = bet;
    }

    public Parameters withBet(String bet) {
        this.bet = bet;
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

    public Parameters withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Parameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bookmaker");
        sb.append('=');
        sb.append(((this.bookmaker == null)?"<null>":this.bookmaker));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("bet");
        sb.append('=');
        sb.append(((this.bet == null)?"<null>":this.bet));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.bet == null)? 0 :this.bet.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bookmaker == null)? 0 :this.bookmaker.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameters) == false) {
            return false;
        }
        Parameters rhs = ((Parameters) other);
        return (((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.bet == rhs.bet)||((this.bet!= null)&&this.bet.equals(rhs.bet))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bookmaker == rhs.bookmaker)||((this.bookmaker!= null)&&this.bookmaker.equals(rhs.bookmaker))));
    }

}
