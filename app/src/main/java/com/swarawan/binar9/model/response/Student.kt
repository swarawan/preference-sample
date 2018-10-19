package com.swarawan.binar9.model.response

import com.google.gson.annotations.SerializedName

/**
 * Created by Rio Swarawan on 10/19/18.
 */
data class Student(@SerializedName("id")
                   val id: Int,

                   @SerializedName("name")
                   val name: String,

                   @SerializedName("email")
                   val email: String)