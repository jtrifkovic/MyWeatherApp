package app.data.db.unitlocalized

import androidx.room.ColumnInfo

data class MetricCurrentWeatherEntry (
    @ColumnInfo(name = "temperature")
    override val temperature: Double,
    @ColumnInfo(name = "weather_icons")
    override val weatherIcons: List<String>,
    @ColumnInfo(name = "weather_descriptions")
    override val weatherDescriptions: List<String>,
    @ColumnInfo(name = "wind_speed")
    override val windSpeed: Double,
    @ColumnInfo(name = "wind_dir")
    override val windDir: String,
    @ColumnInfo(name = "feelslike")
    override val feelsLike: Double,
    @ColumnInfo(name = "uv_index")
    override val uvIndex: Int,
    @ColumnInfo(name = "visibility")
    override val visibility: Double,
    @ColumnInfo(name = "is_day")
    override val isDay: String

): UnitSpecificCurrentWeatherEntry