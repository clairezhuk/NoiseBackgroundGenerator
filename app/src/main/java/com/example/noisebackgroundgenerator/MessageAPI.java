package com.example.noisebackgroundgenerator;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MessageAPI {
    @GET("https://php-noise.com/noise.php")
    Call<String> message();

}
