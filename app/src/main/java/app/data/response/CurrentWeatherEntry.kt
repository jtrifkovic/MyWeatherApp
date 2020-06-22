package app.data.response


import com.google.gson.annotations.SerializedName

data class CurrentWeatherEntry(
    @SerializedName("observation_time")
    var observationTime: String,
    var temperature: Int,
    @SerializedName("weather_code")
    var weatherCode: Int,
    @SerializedName("weather_icons")
    var weatherIcons: List<String>,
    @SerializedName("weather_descriptions")
    var weatherDescriptions: List<String>,
    @SerializedName("wind_speed")
    var windSpeed: Int,
    @SerializedName("wind_degree")
    var windDegree: Int,
    @SerializedName("wind_dir")
    var windDir: String,
    var pressure: Int,
    var precip: Int,
    var humidity: Int,
    var cloudcover: Int,
    var feelslike: Int,
    @SerializedName("uv_index")
    var uvIndex: Int,
    var visibility: Int,
    @SerializedName("is_day")
    var isDay: String
)