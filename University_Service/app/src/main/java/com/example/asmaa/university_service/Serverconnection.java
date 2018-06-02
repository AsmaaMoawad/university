package com.example.asmaa.university_service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Abanoub on 1/11/2018.
 */

public class Serverconnection {
    public static Retrofit retrofit = null;

    public static Retrofit getApiClien() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(Url.ServerUrl).
                    addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }

}
