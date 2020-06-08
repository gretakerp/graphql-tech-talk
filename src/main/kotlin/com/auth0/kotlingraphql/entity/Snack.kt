package com.auth0.kotlingraphql.entity

import org.springframework.data.annotation.Id

data class Snack(
        @Id
        var id: String,
        var name: String,
        var amount: Float
)


