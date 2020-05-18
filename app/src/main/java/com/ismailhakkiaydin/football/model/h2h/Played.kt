package com.ismailhakkiaydin.football.model.h2h


import com.google.gson.annotations.SerializedName

data class Played(
    @SerializedName("home")
    var home: Int,
    @SerializedName("away")
    var away: Int,
    @SerializedName("total")
    var total: Int
)