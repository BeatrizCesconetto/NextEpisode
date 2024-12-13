package br.com.nextepisode.model

import jakarta.persistence.*
@Entity
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    var firstName: String = ""

    var lastName: String? = null

    var email: String? = null

    private var password: String? = null

    //TODO: Lista de animes favoritos
}