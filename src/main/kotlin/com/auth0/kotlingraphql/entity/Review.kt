package com.auth0.kotlingraphql.entity

data class Review(
        var snackId: String,
        var rating: Int,
        var text: String,
        var userId: String
)
