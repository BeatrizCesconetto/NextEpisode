package br.com.nextepisode.repository

import br.com.nextepisode.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository  : JpaRepository <User?, Long?> {
}