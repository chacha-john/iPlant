package com.chachaup.iplant.data.model

data class CreateAccountRequest(
    val name: String,
    val email: String,
    val password: String
)