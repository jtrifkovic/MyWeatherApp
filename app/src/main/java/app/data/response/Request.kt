package app.data.response


import com.google.gson.annotations.SerializedName

data class Request(
    var type: String,
    var query: String,
    var language: String,
    var unit: String
)