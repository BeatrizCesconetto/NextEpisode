package br.com.nextepisode.model

import jakarta.persistence.*

@Entity
class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    var name: String? = null

    var description: String? = null

    /*@ManyToMany
    var animes: List<Anime>? = null*/
}