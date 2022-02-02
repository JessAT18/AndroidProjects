package com.jessica.dogsapp

import com.google.gson.annotations.SerializedName

data class DogsResponse (
    @SerializedName("status") var status:String,
    @SerializedName("message") var images:List<String>
    )
{
}