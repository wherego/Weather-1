package com.guofeng.weather.model.net;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.guofeng.weather.model.Weather;
import java.util.ArrayList;
import java.util.List;

public class WeatherAPI {

    @SerializedName("HeWeather5")
    @Expose
    public List<Weather> mHeWeatherDataService30s = new ArrayList<>();
}
