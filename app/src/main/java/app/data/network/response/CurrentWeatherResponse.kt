package app.data.network.response

import app.data.db.entity.CurrentWeatherEntry
import app.data.db.entity.Location
import app.data.db.entity.Request
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    val request: Request,
    val location: Location,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)