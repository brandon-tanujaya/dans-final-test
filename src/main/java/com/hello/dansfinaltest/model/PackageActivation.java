package com.hello.dansfinaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hello.dansfinaltest.model.audit.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Map;

@Entity @Data @NoArgsConstructor
public class PackageActivation extends BaseEntity<String> implements Serializable {

    private @Id @GeneratedValue Long id;
    private String transaction_id;
    private String msisdn;
    private String product_id;
    private String product_price;
    private String product_name;

    public PackageActivation(String product_id, String product_price, String product_name){
        this.product_id = product_id;
        this.product_price = product_price;
        this.product_name = product_name;
        this.transaction_id = null;
        this.msisdn = null;
    }

}
