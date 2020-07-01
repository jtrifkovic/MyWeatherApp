package app.data.db.entity


import com.google.gson.annotations.SerializedName

data class Location(
    var name: String,
    var country: String,
    var region: String,
    var lat: String,
    var lon: String,
    @SerializedName("timezone_id")
    var timezoneId: String,
    var localtime: String,
    @SerializedName("localtime_epoch")
    var localtimeEpoch: Int,
    @SerializedName("utc_offset")
    var utcOffset: String
)