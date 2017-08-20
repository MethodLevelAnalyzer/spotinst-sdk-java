package com.spotinst.sdkjava.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by aharontwizer on 7/18/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemsInnerResponse<T>  extends BaseInnerResponse {
    public ItemsInnerResponse() {

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @JsonProperty
    private String kind;

    @JsonProperty
    private List<T> items;

    @JsonProperty
    private int count;
}
