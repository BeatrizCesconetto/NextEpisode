package br.com.nextepisode.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    var title: String? = null

    var episodeNumber: Int? = null

    var launchDate: LocalDate? = null

    var duration: Int? = null

}