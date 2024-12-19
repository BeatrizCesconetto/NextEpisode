package br.com.nextepisode.repository

import br.com.nextepisode.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository <User?, Long?> {
}