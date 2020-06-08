package com.auth0.kotlingraphql.resolvers.snack

import com.auth0.kotlingraphql.entity.Snack
import com.auth0.kotlingraphql.repository.SnackRepository
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class SnackMutationResolver (
        private val snackRepository: SnackRepository
) : GraphQLMutationResolver {
    fun newSnack(name: String, amount: Float) : Snack {
        return snackRepository.save(Snack(
                UUID.randomUUID().toString(),
                name,
                amount
        ))
    }

    fun deleteSnack(id: String) : Boolean {
        snackRepository.deleteById(id)
        return true
    }

    fun updateSnack(id: String, amount: Float) : Snack {
        val snack = snackRepository.findById(id)
        snack.ifPresent {
            it.amount = amount
            snackRepository.save(it)
        }
        return snack.get()
    }
}