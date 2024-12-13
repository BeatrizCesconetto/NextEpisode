package br.com.nextepisode.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    var seasonName: String? = null

    var startDate: LocalDate? = null

    var endDate: LocalDate? = null

    //@OneToMany
    var animes: List<Anime>? = null
}