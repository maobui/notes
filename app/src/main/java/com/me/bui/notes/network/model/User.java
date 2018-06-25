package com.me.bui.notes.network.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mao.bui on 6/25/2018.
 */
public class User extends BaseResponse{
    @SerializedName("api_key")
    String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
