package com.auth0.kotlingraphql.resolvers.snack

import com.auth0.kotlingraphql.entity.Snack
import com.auth0.kotlingraphql.repository.ReviewRepository
import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component

@Component
class SnackResolver(
        private val reviewRepository: ReviewRepository
) : GraphQLResolver<Snack> {
    fun reviews(snack: Snack) = reviewRepository.findBySnackId(snack.id)
}