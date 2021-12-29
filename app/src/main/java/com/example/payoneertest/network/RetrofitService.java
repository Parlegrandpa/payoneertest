package com.example.payoneertest.network;

import com.example.payoneertest.response.FetchDataResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public class RetrofitService {

    public interface MiscellaneousCalls {

        @GET("optile/checkout-android/develop/shared-test/lists/listresult.json")
        Call<FetchDataResponse> fetchList();
    }
}
