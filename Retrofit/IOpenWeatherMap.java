package com.example.andriy.weatherapp.Retrofit;

import com.example.andriy.weatherapp.Model.WeatherForecastResult;
import retrofit2.http.GET;
import io.reactivex.Observable;
import com.example.andriy.weatherapp.Model.WeatherResult;
import retrofit2.http.Query;



public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                 @Query("lon") String lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);
    @GET("forecast")
    Observable<WeatherForecastResult> getForecastWeatherByLatLng(@Query("lat") String lat,
                                                                 @Query("lon") String lng,
                                                                 @Query("appid") String appid,
                                                                 @Query("units") String unit);

}
