package com.example.retrofitdemo3;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("/api/users")
    Call<TestModel> getUsers(@Query("page") int page);   // we can give any name of method instead of MarvelList().
}
