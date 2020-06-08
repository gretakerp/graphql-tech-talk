package com.auth0.kotlingraphql.entity

import org.springframework.data.annotation.Id

data class User(
        @Id
        var id: String,
        var username: String,
        var email: String,
        var country: String
)