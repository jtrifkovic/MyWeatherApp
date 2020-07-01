package app.data.db.entity


import com.google.gson.annotations.SerializedName

data class Request(
    var type: String,
    var query: String,
    var language: String,
    var unit: String
)