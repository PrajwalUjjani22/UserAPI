package com.ujjani.userapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.Call;

public class ItemResponse {

    List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
