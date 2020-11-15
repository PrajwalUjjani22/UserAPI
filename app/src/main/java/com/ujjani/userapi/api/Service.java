package com.ujjani.userapi.api;

import com.ujjani.userapi.model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("users")
    Call<List<Item>> getItems();



}
