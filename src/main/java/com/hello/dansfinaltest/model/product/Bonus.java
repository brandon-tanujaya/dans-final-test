package com.hello.dansfinaltest.model.product;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "class",
        "subclass",
        "name",
        "quota",
        "validity_period",
        "highlight"
})
public class Bonus implements Serializable
{

    @JsonProperty("class")
    private String _class;
    @JsonProperty("subclass")
    private String subclass;
    @JsonProperty("name")
    private String name;
    @JsonProperty("quota")
    private String quota;
    @JsonProperty("validity_period")
    private String validity_period;
    @JsonProperty("highlight")
    private String highlight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8994436410581658586L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Bonus() {
    }

    /**
     *
     * @param validity_period
     * @param highlight
     * @param quota
     * @param subclass
     * @param name
     * @param _class
     */
    public Bonus(String _class, String subclass, String name, String quota, String validity_period, String highlight) {
        super();
        this._class = _class;
        this.subclass = subclass;
        this.name = name;
        this.quota = quota;
        this.validity_period = validity_period;
        this.highlight = highlight;
    }

    @JsonProperty("class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("subclass")
    public String getSubclass() {
        return subclass;
    }

    @JsonProperty("subclass")
    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("quota")
    public String getQuota() {
        return quota;
    }

    @JsonProperty("quota")
    public void setQuota(String quota) {
        this.quota = quota;
    }

    @JsonProperty("validity_period")
    public String getValidity_period() {
        return validity_period;
    }

    @JsonProperty("validity_period")
    public void setValidity_period(String validity_period) {
        this.validity_period = validity_period;
    }

    @JsonProperty("highlight")
    public String getHighlight() {
        return highlight;
    }

    @JsonProperty("highlight")
    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}