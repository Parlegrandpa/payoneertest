package com.example.payoneertest.network;

import com.example.payoneertest.response.FetchDataResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NetworkService {
    OkHttpClient okHttpClient;
    ObjectMapper mapper;
    Retrofit retrofit;

    public interface ResponseCallback<T> {
        void onResponse(T data, boolean isFaulted, String error);
    }

    public NetworkService() {
        okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();

        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        retrofit = new Retrofit.Builder()
                .baseUrl(UrlConstants.BASE_ENDPOINT)
                .client(okHttpClient)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .build();
    }

    public void fetchList(final ResponseCallback<FetchDataResponse> responseCallback) {

        RetrofitService.MiscellaneousCalls miscellaneousCalls = retrofit.create(RetrofitService.MiscellaneousCalls.class);

        Call<FetchDataResponse> retrofitCall = miscellaneousCalls.fetchList();

        retrofitCall.enqueue(new Callback<FetchDataResponse>() {
            @Override
            public void onResponse(Call<FetchDataResponse> call, retrofit2.Response<FetchDataResponse> response) {
                if (response.isSuccessful()) {
                    FetchDataResponse responseBody = response.body();

                    responseCallback.onResponse(responseBody, false, "");
                } else {
                    responseCallback.onResponse(null, true, "Oops! We're temporarily unable to proceed with this. Please try again.");
                }
            }

            @Override
            public void onFailure(Call<FetchDataResponse> call, Throwable t) {
                responseCallback.onResponse(null, true, t.getMessage());
            }
        });
    }
}
