package com.swarawan.binar9.model.request

import com.google.gson.annotations.SerializedName

/**
 * Created by Rio Swarawan on 10/19/18.
 */
data class StudentRequest(@SerializedName("email")
                          val email: String,

                          @SerializedName("name")
                          val name: String)