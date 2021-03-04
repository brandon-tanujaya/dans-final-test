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
        "id",
        "name",
        "highlight",
        "menu_id",
        "short_desc",
        "long_desc",
        "stock_type",
        "terms",
        "price",
        "transfer_price",
        "campaign_flag",
        "product_length",
        "offer_priority",
        "promotional_flag",
        "category",
        "subcategory",
        "adn",
        "tag",
        "product_family",
        "bonus",
        "price_list"
})
public class Offer implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("highlight")
    private String highlight;
    @JsonProperty("menu_id")
    private String menu_id;
    @JsonProperty("short_desc")
    private String short_desc;
    @JsonProperty("long_desc")
    private String long_desc;
    @JsonProperty("stock_type")
    private String stock_type;
    @JsonProperty("terms")
    private String terms;
    @JsonProperty("price")
    private String price;
    @JsonProperty("transfer_price")
    private String transfer_price;
    @JsonProperty("campaign_flag")
    private String campaign_flag;
    @JsonProperty("product_length")
    private String product_length;
    @JsonProperty("offer_priority")
    private String offer_priority;
    @JsonProperty("promotional_flag")
    private String promotional_flag;
    @JsonProperty("category")
    private String category;
    @JsonProperty("subcategory")
    private String subcategory;
    @JsonProperty("adn")
    private String adn;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("product_family")
    private String product_family;
    @JsonProperty("bonus")
    private List<Bonus> bonus = null;
    @JsonProperty("price_list")
    private List<PriceList> price_list = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5260933003072995789L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Offer() {
    }

    /**
     *
     * @param product_family
     * @param stock_type
     * @param bonus
     * @param adn
     * @param offer_priority
     * @param price_list
     * @param highlight
     * @param terms
     * @param price
     * @param name
     * @param menu_id
     * @param short_desc
     * @param id
     * @param promotional_flag
     * @param tag
     * @param product_length
     * @param category
     * @param subcategory
     * @param long_desc
     * @param transfer_price
     * @param campaign_flag
     */
    public Offer(String id, String name, String highlight, String menu_id, String short_desc, String long_desc, String stock_type, String terms, String price, String transfer_price, String campaign_flag, String product_length, String offer_priority, String promotional_flag, String category, String subcategory, String adn, String tag, String product_family, List<Bonus> bonus, List<PriceList> price_list) {
        super();
        this.id = id;
        this.name = name;
        this.highlight = highlight;
        this.menu_id = menu_id;
        this.short_desc = short_desc;
        this.long_desc = long_desc;
        this.stock_type = stock_type;
        this.terms = terms;
        this.price = price;
        this.transfer_price = transfer_price;
        this.campaign_flag = campaign_flag;
        this.product_length = product_length;
        this.offer_priority = offer_priority;
        this.promotional_flag = promotional_flag;
        this.category = category;
        this.subcategory = subcategory;
        this.adn = adn;
        this.tag = tag;
        this.product_family = product_family;
        this.bonus = bonus;
        this.price_list = price_list;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("highlight")
    public String getHighlight() {
        return highlight;
    }

    @JsonProperty("highlight")
    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    @JsonProperty("menu_id")
    public String getMenu_id() {
        return menu_id;
    }

    @JsonProperty("menu_id")
    public void setMenu_id(String menu_id) {
        this.menu_id = menu_id;
    }

    @JsonProperty("short_desc")
    public String getShort_desc() {
        return short_desc;
    }

    @JsonProperty("short_desc")
    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }

    @JsonProperty("long_desc")
    public String getLong_desc() {
        return long_desc;
    }

    @JsonProperty("long_desc")
    public void setLong_desc(String long_desc) {
        this.long_desc = long_desc;
    }

    @JsonProperty("stock_type")
    public String getStock_type() {
        return stock_type;
    }

    @JsonProperty("stock_type")
    public void setStock_type(String stock_type) {
        this.stock_type = stock_type;
    }

    @JsonProperty("terms")
    public String getTerms() {
        return terms;
    }

    @JsonProperty("terms")
    public void setTerms(String terms) {
        this.terms = terms;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("transfer_price")
    public String getTransfer_price() {
        return transfer_price;
    }

    @JsonProperty("transfer_price")
    public void setTransfer_price(String transfer_price) {
        this.transfer_price = transfer_price;
    }

    @JsonProperty("campaign_flag")
    public String getCampaign_flag() {
        return campaign_flag;
    }

    @JsonProperty("campaign_flag")
    public void setCampaign_flag(String campaign_flag) {
        this.campaign_flag = campaign_flag;
    }

    @JsonProperty("product_length")
    public String getProduct_length() {
        return product_length;
    }

    @JsonProperty("product_length")
    public void setProduct_length(String product_length) {
        this.product_length = product_length;
    }

    @JsonProperty("offer_priority")
    public String getOffer_priority() {
        return offer_priority;
    }

    @JsonProperty("offer_priority")
    public void setOffer_priority(String offer_priority) {
        this.offer_priority = offer_priority;
    }

    @JsonProperty("promotional_flag")
    public String getPromotional_flag() {
        return promotional_flag;
    }

    @JsonProperty("promotional_flag")
    public void setPromotional_flag(String promotional_flag) {
        this.promotional_flag = promotional_flag;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("subcategory")
    public String getSubcategory() {
        return subcategory;
    }

    @JsonProperty("subcategory")
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    @JsonProperty("adn")
    public String getAdn() {
        return adn;
    }

    @JsonProperty("adn")
    public void setAdn(String adn) {
        this.adn = adn;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("product_family")
    public String getProduct_family() {
        return product_family;
    }

    @JsonProperty("product_family")
    public void setProduct_family(String product_family) {
        this.product_family = product_family;
    }

    @JsonProperty("bonus")
    public List<Bonus> getBonus() {
        return bonus;
    }

    @JsonProperty("bonus")
    public void setBonus(List<Bonus> bonus) {
        this.bonus = bonus;
    }

    @JsonProperty("price_list")
    public List<PriceList> getPrice_list() {
        return price_list;
    }

    @JsonProperty("price_list")
    public void setPrice_list(List<PriceList> price_list) {
        this.price_list = price_list;
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