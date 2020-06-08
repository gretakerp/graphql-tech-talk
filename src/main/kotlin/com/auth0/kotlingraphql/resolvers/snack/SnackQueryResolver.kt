package com.auth0.kotlingraphql.resolvers.snack

import com.auth0.kotlingraphql.entity.Snack
import com.auth0.kotlingraphql.repository.SnackRepository
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class SnackQueryResolver(
        val snackRepository: SnackRepository
) : GraphQLQueryResolver {
    fun snacks(): List<Snack> = snackRepository.findAll()

    fun getSnackById(id: String) = snackRepository.findById(id)

}