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
        "amount",
        "transfer_price",
        "payment_method",
        "price_description"
})
public class PriceList implements Serializable
{

    @JsonProperty("amount")
    private String amount;
    @JsonProperty("transfer_price")
    private String transfer_price;
    @JsonProperty("payment_method")
    private String payment_method;
    @JsonProperty("price_description")
    private String price_description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1700819591662685652L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PriceList() {
    }

    /**
     *
     * @param amount
     * @param payment_method
     * @param price_description
     * @param transfer_price
     */
    public PriceList(String amount, String transfer_price, String payment_method, String price_description) {
        super();
        this.amount = amount;
        this.transfer_price = transfer_price;
        this.payment_method = payment_method;
        this.price_description = price_description;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("transfer_price")
    public String getTransfer_price() {
        return transfer_price;
    }

    @JsonProperty("transfer_price")
    public void setTransfer_price(String transfer_price) {
        this.transfer_price = transfer_price;
    }

    @JsonProperty("payment_method")
    public String getPayment_method() {
        return payment_method;
    }

    @JsonProperty("payment_method")
    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    @JsonProperty("price_description")
    public String getPrice_description() {
        return price_description;
    }

    @JsonProperty("price_description")
    public void setPrice_description(String price_description) {
        this.price_description = price_description;
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