package com.auth0.kotlingraphql.resolvers.user

import com.auth0.kotlingraphql.entity.User
import com.auth0.kotlingraphql.repository.UserRepository
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class UserMutationResolver (
        private val userRepository: UserRepository
) : GraphQLMutationResolver {

    fun newUser(username: String, email: String, country: String) : User =
        userRepository.save(User(
                UUID.randomUUID().toString(),
                username,
                email,
                country
        ))

    fun deleteUser(id: String) : Boolean {
        userRepository.deleteById(id)
        return true
    }
}