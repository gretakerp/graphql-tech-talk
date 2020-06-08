package com.auth0.kotlingraphql.resolvers.review

import com.auth0.kotlingraphql.entity.Review
import com.auth0.kotlingraphql.repository.ReviewRepository
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component

@Component
class ReviewMutationResolver(
        private val reviewRepository: ReviewRepository
) : GraphQLMutationResolver {
    fun newReview(snackId: String, rating: Int, text: String, userId: String) : Review =
            reviewRepository.save(Review(snackId, rating, text, userId))

    fun deleteReview(snackId: String) : Boolean {
        val review = reviewRepository.findBySnackId(snackId).first()
        reviewRepository.delete(review)
        return true
    }
}