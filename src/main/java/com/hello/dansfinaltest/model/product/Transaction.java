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
        "transaction_id",
        "channel",
        "status_code",
        "status_desc"
})
public class Transaction implements Serializable
{

    @JsonProperty("transaction_id")
    private String transaction_id;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("status_code")
    private String status_code;
    @JsonProperty("status_desc")
    private String status_desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1386307871035459225L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Transaction() {
    }

    /**
     *
     * @param status_desc
     * @param channel
     * @param transaction_id
     * @param status_code
     */
    public Transaction(String transaction_id, String channel, String status_code, String status_desc) {
        super();
        this.transaction_id = transaction_id;
        this.channel = channel;
        this.status_code = status_code;
        this.status_desc = status_desc;
    }

    @JsonProperty("transaction_id")
    public String getTransaction_id() {
        return transaction_id;
    }

    @JsonProperty("transaction_id")
    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("status_code")
    public String getStatus_code() {
        return status_code;
    }

    @JsonProperty("status_code")
    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    @JsonProperty("status_desc")
    public String getStatus_desc() {
        return status_desc;
    }

    @JsonProperty("status_desc")
    public void setStatus_desc(String status_desc) {
        this.status_desc = status_desc;
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