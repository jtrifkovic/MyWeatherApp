package app.data.db.unitlocalized

interface UnitSpecificCurrentWeatherEntry {
    val temperature: Double
    val weatherIcons: List<String>
    val weatherDescriptions: List<String>
    val windSpeed: Double
    val windDir: String
    val feelsLike: Double
    val uvIndex: Int
    val visibility: Double
    val isDay: String



}