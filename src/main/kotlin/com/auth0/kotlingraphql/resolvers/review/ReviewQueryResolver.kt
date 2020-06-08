package com.auth0.kotlingraphql.resolvers.review

import com.auth0.kotlingraphql.entity.Review
import com.auth0.kotlingraphql.repository.ReviewRepository
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class ReviewQueryResolver(
        val reviewRepository: ReviewRepository
) : GraphQLQueryResolver {
    fun reviews() = reviewRepository.findAll()

    fun reviewsBySnackId(snackId: String) : List<Review> =
            reviewRepository.findBySnackId(snackId)
}