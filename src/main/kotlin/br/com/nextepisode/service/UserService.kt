package br.com.nextepisode.service

import br.com.nextepisode.model.User
import br.com.nextepisode.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService {

    @Autowired
    private lateinit var repository: UserRepository

    fun createUser(newUser : User) : User {
        return repository.save(newUser)
    }

    fun listAllUsers() : MutableList<User?> {
        return repository.findAll()
    }

    fun findUserById(id : Long) : User? {
        return repository.findById(id).orElse(null) //Retorna null se não encontrar o usuário
    }
}