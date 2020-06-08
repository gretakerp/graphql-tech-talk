package com.auth0.kotlingraphql.repository

import com.auth0.kotlingraphql.entity.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String>