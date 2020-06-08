package com.auth0.kotlingraphql.resolvers.user

import com.auth0.kotlingraphql.entity.User
import com.auth0.kotlingraphql.repository.ReviewRepository
import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component

@Component
class UserResolver(
        private val reviewRepository: ReviewRepository
) : GraphQLResolver<User> {
    fun reviews(user: User) = reviewRepository.findByUserId(user.id)
}