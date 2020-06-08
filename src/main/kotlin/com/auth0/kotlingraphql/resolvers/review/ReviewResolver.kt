package com.auth0.kotlingraphql.resolvers.review

import com.auth0.kotlingraphql.entity.Review
import com.auth0.kotlingraphql.repository.SnackRepository
import com.auth0.kotlingraphql.repository.UserRepository
import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component

@Component
class ReviewResolver(
        private val snackRepository: SnackRepository,
        private val userRepository: UserRepository
) : GraphQLResolver<Review> {
    fun getSnack(review: Review) = snackRepository.findById(review.snackId)

    fun getUser(review: Review) = userRepository.findById(review.userId!!)
}