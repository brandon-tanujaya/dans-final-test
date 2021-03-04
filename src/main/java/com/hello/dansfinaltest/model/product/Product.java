package com.hello.dansfinaltest.model.product;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "transaction",
        "offer"
})
public class Product implements Serializable
{

    @JsonProperty("transaction")
    private Transaction transaction;
    @JsonProperty("offer")
    private List<Offer> offer = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1606697090343586363L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Product() {
    }

    /**
     *
     * @param offer
     * @param transaction
     */
    public Product(Transaction transaction, List<Offer> offer) {
        super();
        this.transaction = transaction;
        this.offer = offer;
    }

    @JsonProperty("transaction")
    public Transaction getTransaction() {
        return transaction;
    }

    @JsonProperty("transaction")
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @JsonProperty("offer")
    public List<Offer> getOffer() {
        return offer;
    }

    @JsonProperty("offer")
    public void setOffer(List<Offer> offer) {
        this.offer = offer;
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