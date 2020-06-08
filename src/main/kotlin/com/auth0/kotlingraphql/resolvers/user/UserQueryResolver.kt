package com.auth0.kotlingraphql.resolvers.user

import com.auth0.kotlingraphql.entity.User
import com.auth0.kotlingraphql.repository.UserRepository
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class UserQueryResolver (
        private val userRepository: UserRepository
) : GraphQLQueryResolver {
    fun users() : List<User> = userRepository.findAll()

    fun getUserById(id: String) = userRepository.findById(id)
}