package br.com.nextepisode.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    var name: String? = null

    var description: String? = null

    var launchDate: LocalDate? = null

    var categories: List<String>? = null

    var numberOfEpisodes: Int? = null

    var status: String? = null

    var rating: Double? = null
}