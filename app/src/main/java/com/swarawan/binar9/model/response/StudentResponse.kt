package com.swarawan.binar9.model.response

import com.google.gson.annotations.SerializedName

/**
 * Created by Rio Swarawan on 10/19/18.
 */
data class StudentResponse(@SerializedName("status")
                           val status: String,

                           @SerializedName("data")
                           val data: MutableList<Student>)