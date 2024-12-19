package br.com.nextepisode.controller

import br.com.nextepisode.model.User
import br.com.nextepisode.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private lateinit var service: UserService

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(@RequestBody newUser: User): User {
        println("CHEGUEEEEI")
        return service.createUser(newUser)
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun findAllUsers(): MutableList<User?> {
        return service.listAllUsers()
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun findUserById(@PathVariable id: Long): User {
        return service.findUserById(id)!!
    }
}