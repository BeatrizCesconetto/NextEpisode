package br.com.nextepisode.service

import br.com.nextepisode.model.User
import br.com.nextepisode.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    fun createUser(newUser : User) : User {
        return userRepository.save(newUser)
    }

    fun listAllUsers() : MutableList<User?> {
        return userRepository.findAll()
    }

    fun findUserById(id : Long) : User? {
        return userRepository.findById(id).orElse(null) //Retorna null se não encontrar o usuário
    }
}