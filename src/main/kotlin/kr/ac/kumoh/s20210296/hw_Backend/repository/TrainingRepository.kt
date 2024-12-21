package kr.ac.kumoh.s20210296.hw_Backend.repository

import kr.ac.kumoh.s20210296.hw_Backend.model.Training
import org.springframework.data.mongodb.repository.MongoRepository

interface TrainingRepository : MongoRepository<Training, String> {
    fun findByDate(date:String):List<Training>
}