package br.com.nextepisode.model

import jakarta.persistence.*

@Entity
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var firstName: String = "",

    var lastName: String? = null,

    @Column(unique = true, nullable = false)
    var email: String = "", // Email obrigatório e único

    @Column(nullable = false)
    private var password: String = "" // Senha obrigatória
) {
    fun setPassword(password: String) {
        this.password = password
    }

    fun getPassword(): String {
        return password
    }
}
