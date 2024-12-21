package kr.ac.kumoh.s20210296.hw_Backend.repository

import kr.ac.kumoh.s20210296.hw_Backend.model.Competition
import org.springframework.data.mongodb.repository.MongoRepository

interface CompetitionRepository : MongoRepository<Competition, String> {
    fun findByDate(date:String):List<Competition>
}